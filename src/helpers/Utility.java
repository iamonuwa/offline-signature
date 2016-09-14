
package helpers;

import java.awt.Window;

/**
 *
 * @author iamonuwa
 */
public class Utility {
    
      /**
     * Centres a child window on a parent window
     *
     * @param parent
     * @param child
     */
    public static void centreOnParent(Window parent, Window child) {
        child.setLocationRelativeTo(parent);
    }
    /**
     * Center a window on screen
     * @param frame 
     */
    public static void centreOnScreen(Window frame) {
        frame.setLocationRelativeTo(null);
    }
    
    
  
}
