
package offlinesignature;

import helpers.Utility;

/**
 *
 * @author Onuwa Nnachi Isaac <i_onuwa4u@outlook.com>
 */
public class OfflineSignature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login mLogin = new Login();
        Utility.centreOnScreen(mLogin);
        mLogin.setVisible(true);
    }
    
}
