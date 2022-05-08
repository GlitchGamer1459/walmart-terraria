package largeWorld;

import javax.swing.*;
import java.awt.*;

public class GraphicsPane extends JPanel {

    int PANEL_WIDTH = 960;
    int PANEL_HEIGHT = 540;

    int[][] world = new int[27*5][48*5];

    GraphicsPane() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));

        initWorldArray();

//        Timer timer = new Timer();
//        timer.scheduleAtFixedRate(new TimerTask() {
//            int i = 0;
//
//            @Override
//            public void run() {
//                repaint();
//
//                if (i == 590 ) {
//                    System.out.println("abort timer, time: " + (i * 17));
//                    timer.cancel();
//                }
//
//                i++;
//            }
//        }, 2000, 17);
    }

    private void initWorldArray() {
        for (int h = 0; h < world.length; h++) {
            for (int w = 0; w < world[0].length; w++) {
                world[h][w] = 0;
            }
        }

        int startY = Maths.rand(0, world.length / 3) + (world.length / 3);
        int[] map = Maths.newHeightMap(startY, world[0].length);

        for (int x = 0; x < map.length; x++) {
            world[map[x]][x] = 1;
        }

        for (int h = 0; h < world.length; h++) {
            for (int w = 0; w < world[0].length; w++) {
                if (h > 0 && world[h - 1][w] >= 1) {
                    world[h][w] = 2;
                }
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        int wWidth = world[0].length;
        int wHeight = world.length;
        int bWidth = PANEL_WIDTH / wWidth;
        int bHeight = PANEL_HEIGHT / wHeight;

        for (int i = 0; i < wHeight; i++) {
            for (int o = 0; o < wWidth; o++) {
                switch (world[i][o]) {
                    case 1 -> g2d.setPaint(new Color(0x157700));
                    case 2 -> g2d.setPaint(new Color(0x5B442D));
                    default -> g2d.setPaint(new Color(0x12D5E7));
                }

                g2d.fillRect(o * bWidth, i * bHeight, bWidth, bHeight);
            }
        }
    }
}