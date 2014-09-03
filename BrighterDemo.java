import java.awt.Color;
import javax.swing.JFrame;

public class BrighterDemo
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(200,200);
        Color myColor = Color.WHITE;
        frame.getContentPane().setBackground(myColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        while(true){
            myColor = Color.BLACK;
            frame.getContentPane().setBackground(myColor);
            myColor = Color.WHITE;
            frame.getContentPane().setBackground(myColor);
        }
    }
}


