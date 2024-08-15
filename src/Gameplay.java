import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Gameplay extends JPanel{
    private ImageIcon titleImage;
    public Gameplay(){

    }
    public void paint(Graphics g){

        //border of title image
        g.setColor(Color.white);
        g.drawRect(24,10,851,55);

        titleImage=new ImageIcon("E:\\Java\\2Dsnak\\assets\\snaketitle.jpg");

        titleImage.paintIcon(this,g,25,11);
        //border of gameplay
        g.setColor(Color.white);
        g.drawRect(24,74,851,577);
        g.setColor(Color.BLACK);
        g.fillRect(25,75,850,575);

    }
}