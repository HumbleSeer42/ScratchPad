import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class ScratchPad implements Runnable {
    JFrame window;
    JTextArea pad;

    public void run() {
        window = new JFrame("ScratchPad");
        window.setSize(705, 705);
        window.setResizable(false);
        window.setDefaultCloseOperation(3);
        pad = new JTextArea();
        pad.setLineWrap(true);
        pad.setSize(500, 500);
        window.add(pad);
        window.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new ScratchPad());
    }
}
