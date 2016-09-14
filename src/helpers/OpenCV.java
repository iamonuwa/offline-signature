package helpers;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.util.Arrays;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.MatOfFloat;
import org.opencv.core.MatOfInt;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author iamonuwa
 */
public class OpenCV {
    
    public int compareImages(BufferedImage mImage1, BufferedImage mImage2){
        Mat mMat1 = convertMat(mImage1);
        Mat mMat2 = convertMat(mImage2);
        
        
        Mat mHist1 = new Mat();
        Mat mHist2 = new Mat();
        
        MatOfFloat ranges = new MatOfFloat(0f, 256f);
        MatOfInt histSize = new MatOfInt(25);
        
        Imgproc.calcHist(Arrays.asList(mMat1), new MatOfInt(0), 
				new Mat(), mHist1, histSize, ranges);
        
        Imgproc.calcHist(Arrays.asList(mMat2), new MatOfInt(0),
				new Mat(), mHist2, histSize, ranges);
        
        double res = Imgproc.compareHist(mHist1, mHist2, Imgproc.CV_COMP_CORREL);
	Double d = new Double(res * 100);
//        print the value of d here
        return d.intValue();
//	Result dialog = new Result();
//	dialog.disp_percen(d.intValue());
//	dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//        dialog.setVisible(true);
    }

    private Mat convertMat(BufferedImage mImage) {
        byte[] data = ((DataBufferByte) mImage.getRaster().getDataBuffer()).getData();
	Mat mat = new Mat(mImage.getHeight(),mImage.getWidth(),CvType.CV_8UC3);
	mat.put(0,0,data);
	
	Mat mMat = new Mat(mImage.getHeight(),mImage.getWidth(),CvType.CV_8UC3);
	Imgproc.cvtColor(mat, mMat, Imgproc.COLOR_RGB2HSV);
	
	return mMat;
    }
    
}
