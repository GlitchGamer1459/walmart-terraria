package game;

public class test {

    public static void main(String[] args) {
        MyFrame frame = new MyFrame("fucker");

        // uses a panel to avoid clipping graphics into the title box
        // w/o the panel it clips through the title at the top of the screen
        GraphicsPane pane = new GraphicsPane();
        frame.setContentPane(pane);
        pane.init();
        frame.pack();
    }
}