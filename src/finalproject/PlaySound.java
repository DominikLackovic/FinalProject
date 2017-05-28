//When I wrote this, only God and I understood what I was doing
//Now, God only knows

package finalproject;

import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class PlaySound implements Runnable
{
    String name;
    
    PlaySound(String name)
    {
        this.name = name;
    }

    @Override
    public void run()
    {
        try
        {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getClassLoader().getResource("finalproject/sounds/" + name)));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength()/1000);
        }
        catch(LineUnavailableException | UnsupportedAudioFileException | IOException | InterruptedException e)
        {
            
        }
    }
}