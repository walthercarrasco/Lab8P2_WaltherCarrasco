
package Main;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

/**
 *
 * @author HP
 */
public class Hilo extends Thread{
    
    ArrayList<Seres> array = new ArrayList<>();
    JProgressBar bar;

    public Hilo(JProgressBar bar, ArrayList<Seres> array) {
        this.bar = bar;
        this.array = array;
    }
    
    @Override
    public void run(){
        for (Object object : array) {
            try {
                bar.setValue(bar.getValue()+1);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
