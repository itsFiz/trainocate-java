package module7;

import ij.IJ;
import ij.ImagePlus;
import ij.io.FileSaver;
import ij.process.ImageProcessor;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageJDemo extends JPanel {
    public void paint(Graphics g){
        Image img = createImageWithText();
        g.drawImage(img, 20, 20, this);
    }

    private Image createImageWithText(){
        BufferedImage bufferedImage = new BufferedImage(200,300,BufferedImage.TYPE_INT_RGB);
        Graphics g = bufferedImage.getGraphics();
        g.drawString("Hello World", 20, 20);
        return bufferedImage;

    }

    public void drawRectangle(){
        ImagePlus imp = IJ.openImage("assets/test.jpg");
        ImageProcessor ip = imp.getProcessor();
        ip.setColor(Color.red);
        ip.setLineWidth(4);
        ip.drawRect(50,50,imp.getWidth() - 100, imp.getHeight() -100 );
        FileSaver fs = new FileSaver(imp);
        fs.saveAsJpeg("assets/test2.jpeg");
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        ImageJDemo demo = new ImageJDemo();
        demo.drawRectangle();
        frame.getContentPane().add(new ImageJDemo());
        frame.getContentPane().add(demo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
    }
}
