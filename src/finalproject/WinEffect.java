//When I wrote this, only God and I understood what I was doing
//Now, God only knows

package finalproject;

import java.util.logging.Level;
import java.util.logging.Logger;
import static finalproject.Frame2.jLabel34;

public class WinEffect implements Runnable
{
    private int win;
    
    public WinEffect(int win)
    {
        this.win = win;
    }
    
    @Override
    public void run()
    {
        jLabel34.setVisible(true);
        jLabel34.setText("WIN     +" + win);
        
        try
        {
            Thread.sleep(2000); 
        }
        catch (InterruptedException ex)
        {
            Logger.getLogger(ErrorLog.class.getName()).log(Level.SEVERE, null, ex);
        }    
            
        jLabel34.setVisible(false);
    }
}
