
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
    
    ArrayList<Object> array = new ArrayList<>();
    JProgressBar bar;

    public Hilo(JProgressBar bar, ArrayList<Object> array) {
        this.bar = bar;
        this.array = array;
    }
    
    @Override
    public void run(){
        for (Object object : array) {
            try {
                
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}