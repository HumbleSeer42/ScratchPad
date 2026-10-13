import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class ScratchPad {
    static JFrame jf;

    public static void create() {
        jf = new JFrame("ScratchPad");
        jf.setSize(705, 705);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(3);
        JTextArea ta = new JTextArea();
        ta.setLineWrap(true);
        ta.setSize(500, 500);
    }
    
    public static void show() {
        //jf.pack();
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ScratchPad.create();
                ScratchPad.show();
            }
        });
    }
}
