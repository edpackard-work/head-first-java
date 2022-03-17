import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGui implements ActionListener {

    JButton button;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;

    public static void main (String[] args) {
        SimpleGui gui = new SimpleGui();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame("Simple GUI by Ed");
        button = new JButton("click me");

        menuBar = new JMenuBar();
        menu = new JMenu("A menu");
        menuBar.add(menu);
        menuItem = new JMenuItem("A menu item");
        menu.add(menuItem);
        menuItem = new JMenuItem ("Another menu item");
        menu.add(menuItem);

        button.addActionListener(this);

        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setJMenuBar(menuBar);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        button.setText("clicked");
    }

 }
