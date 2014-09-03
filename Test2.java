import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test2
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL("http://blogs-images.forbes.com/thumbnails/blog_1011/pt_1011_5662_o.jpg?t=1343922794");
        JOptionPane.showMessageDialog(null, "We are Anonymous, We are Legion, We do not forgive, We do not forget, You know who you are, Expect us.", "Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}