
import java.awt.*;
import java.awt.event.*;

public class ColorPalette extends Frame {

    ColorPalette() {
        setTitle("Color Palette");
        setSize(400, 300);
        setLayout(new GridLayout(2, 3, 10, 10));

        Button b1 = new Button("Red");
        Button b2 = new Button("Green");
        Button b3 = new Button("Blue");
       
        b1.setBackground(Color.RED);
        b2.setBackground(Color.GREEN);
        b3.setBackground(Color.BLUE);

        add(b1);
        add(b2);
        add(b3);
        

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorPalette();
    }
}
