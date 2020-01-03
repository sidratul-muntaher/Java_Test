import javax.javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Gui {

    public static void main(String[] arg){
        JFrame frame = new JFrame();   
        JButton button = new JButton("Click Me");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}