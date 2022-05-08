package largeWorld;

public class test {

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();

        // uses a panel to avoid clipping graphics into the title box
        // w/o the panel it clips through the title at the top of the screen
        frame.setContentPane(new GraphicsPane());
        frame.pack();
    }
}