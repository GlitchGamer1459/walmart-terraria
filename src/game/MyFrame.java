package game;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(String name) {
        super(name);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void setFullScreen(boolean on) {
        GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = graphics.getDefaultScreenDevice();

        device.setFullScreenWindow(this);
    }
}
