import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class ScratchPad implements Runnable {
    JFrame window;
    JTextArea pad;
    JScrollPane scrollable;

    public void run() {
        window = new JFrame("ScratchPad");
        window.setSize(705, 705);
        window.setResizable(false);
        window.setDefaultCloseOperation(3);
        pad = new JTextArea();
        pad.setLineWrap(true);
        pad.setSize(500, 500);
        scrollable = new JScrollPane(pad, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        window.add(scrollable);
        window.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new ScratchPad());
    }
}
