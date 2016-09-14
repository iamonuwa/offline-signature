/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers.spiders;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author iamonuwa
 */
public class SignatureSpider2 {
    
    private int TotalRed;
    private int TotalGreen;
    private int TotalBlue;
    private int TotalAlpha;
    private String Path;
    private int Width;
    private int Height;
    private boolean WidthisGreater = false;
    private boolean JobDone = false;
    private BufferedImage img;

    public SignatureSpider2(String path) throws Exception {
         try {
                this.Path = path;
                Initiate();
                this.JobDone = true;
        } catch (Exception JobFailed) {
            JobDone = false;
            throw new Exception("JobFailed!");
        }
    }
    private void Initiate() {
        try {
            img = ImageIO.read(new File(this.Path));
            WidthisGreater = (img.getWidth() > img.getHeight());
            this.Height = img.getHeight();
            this.Width = img.getWidth();
            ExtractProperties(img);
        } catch (IOException ex) {
            System.err.println("Something went wrong, could not load.");
        }
    }

    private void ExtractProperties(BufferedImage buff) {
        if (WidthisGreater == true) {
            for (int w = 0; w < buff.getWidth(); w++) {
                for (int h = 0; h < buff.getHeight(); h++) {
                    Color color = new Color(buff.getRGB(w, h));
                    TotalRed += color.getRed();
                    TotalGreen += color.getGreen();
                    TotalBlue += color.getBlue();
                    TotalAlpha += color.getAlpha();
                }
            }
        } else {
            for (int h = 0; h < buff.getHeight(); h++) {
                for (int w = 0; w < buff.getWidth(); w++) {
                    Color color = new Color(buff.getRGB(w, h));
                    TotalRed += color.getRed();
                    TotalGreen += color.getGreen();
                    TotalBlue += color.getBlue();
                    TotalAlpha += color.getAlpha();
                }
            }
        }
    }

    public int getRed() {
        return this.TotalRed;
    }

    public int getGreen() {
        return this.TotalGreen;
    }

    public int getBlue() {
        return this.TotalBlue;
    }

    public int getAlpha() {
        return this.TotalAlpha;
    }

    public boolean isJobDone() {
        return this.JobDone;
    }
    
    
    
}
