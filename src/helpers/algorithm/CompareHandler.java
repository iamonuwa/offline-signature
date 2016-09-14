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
class CompareHandler {
     public boolean CompareHandler(SignatureSpider1 signatureSpider1, SignatureSpider2 signatureSpider2) {
        boolean Same = (signatureSpider1.getRed() == signatureSpider2.getRed()) && (signatureSpider1.getGreen() == signatureSpider2.getGreen()) && (signatureSpider1.getBlue() == signatureSpider2.getBlue());
        return Same;
    }
}
