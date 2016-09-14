/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers.algorithm;

import helpers.spiders.SignatureSpider1;
import helpers.spiders.SignatureSpider2;

/**
 *
 * @author iamonuwa
 */
public class Compare {
    
    protected String ImagePath1;
    protected String ImagePath2;
    protected SignatureSpider1 signatureSpider1;
    protected SignatureSpider2 signatureSpider2;
    
    protected boolean Same = false;
    protected boolean Done = false;
    
    public Compare(String path1, String path2) throws Exception {
        signatureSpider1 = new SignatureSpider1(path1);
        signatureSpider2 = new SignatureSpider2(path2);
        CompareHandler compareHandler = new CompareHandler();
        Same = compareHandler.CompareHandler(signatureSpider1, signatureSpider2);
        Done = true;
    }

    public String getImagePath1() {
        return ImagePath1;
    }

    public void setImagePath1(String ImagePath1) {
        this.ImagePath1 = ImagePath1;
    }

    public String getImagePath2() {
        return ImagePath2;
    }

    public void setImagePath2(String ImagePath2) {
        this.ImagePath2 = ImagePath2;
    }

    public SignatureSpider1 getSignatureSpider1() {
        return signatureSpider1;
    }

    public void setSignatureSpider1(SignatureSpider1 signatureSpider1) {
        this.signatureSpider1 = signatureSpider1;
    }

    public SignatureSpider2 getSignatureSpider2() {
        return signatureSpider2;
    }

    public void setSignatureSpider2(SignatureSpider2 signatureSpider2) {
        this.signatureSpider2 = signatureSpider2;
    }

    public boolean isSame() {
        return Same;
    }

    public void setSame(boolean Same) {
        this.Same = Same;
    }

    public boolean isDone() {
        return Done;
    }

    public void setDone(boolean Done) {
        this.Done = Done;
    }
    
    
}
