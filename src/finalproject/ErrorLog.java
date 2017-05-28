//When I wrote this, only God and I understood what I was doing
//Now, God only knows

package finalproject;

import java.util.logging.Level;
import java.util.logging.Logger;
import static finalproject.Frame1.lableErrorMessage;

public class ErrorLog implements Runnable
{
    private final int DISPLAY_TIME = 3000;
    private final String errorMessage;
    
    public ErrorLog(String s)
    {
        this.errorMessage = s;
    }
    @Override
    public void run()
    {
        lableErrorMessage.setText(errorMessage);
        try
        {
            Thread.sleep(DISPLAY_TIME);
        }
        catch (InterruptedException ex)
        {
            Logger.getLogger(ErrorLog.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        lableErrorMessage.setText("");
    }
}