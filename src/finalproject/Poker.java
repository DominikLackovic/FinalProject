//When I wrote this, only God and I understood what I was doing
//Now, God only knows

package finalproject;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Poker
{
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException
    {
        try
        {
            for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
            {
                if ("Windows".equals(info.getName()))
                {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e)
        {
        // If Nimbus is not available, you can set the GUI to another look and feel.
        }
        
        Frame1 frame = new Frame1();
        frame.setVisible(true);
    }
    
}
