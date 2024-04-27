package Main;

import java.awt.EventQueue;
import javax.swing.JFrame;
import windows.MainWindow;

/**
 *
 * @author DannerDQ
 */
public class Runner {
    
    // Ventana Principal
    JFrame mainWindow = new MainWindow();

    public Runner() {
        
        mainWindow.setVisible(true);
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
                new Runner();
            }
            
        });
    }
}
