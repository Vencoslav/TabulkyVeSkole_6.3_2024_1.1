import javax.swing.*;
import java.awt.event.KeyEvent;

public class TabulkyVeSkoleForm extends JFrame {
    private JButton button1;
    private JTextField textField1;
    private JTextArea textArea1;

    public TabulkyVeSkoleForm(){
        super("Menu");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initMenu();

        setVisible(true);

    }
    private void initMenu(){
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("Akce");
        menuBar.add(fileMenu);

        JMenuItem openItem = new JMenuItem("Pozdrav", KeyEvent.VK_F);
        fileMenu.add(openItem);
        JMenuItem aboutItem = new JMenuItem("O aplikaci...");
        menuBar.add(aboutItem);

        openItem.addActionListener(e -> reakce());
        aboutItem.addActionListener(e ->{
            JOptionPane.showMessageDialog(this,"Toto je aplikace pro demonstraci menu.");
        });

    }
    private void reakce(){
        JOptionPane.showMessageDialog(this,"Ahoj!");
    }

    public static void main(String[] args) {
        new TabulkyVeSkoleForm();
    }
}
