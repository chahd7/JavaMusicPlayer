package dj2.gui;
import dj2.core.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MenuBar extends JMenuBar{
    private JMenu menuFile = new JMenu("File");
    private JMenuItem menuFileSave = new JMenuItem("Save");
    private JMenuItem menuFileExit = new JMenuItem("Exit");
    //private JMenu menuAccount = new JMenu("Account");
    //private JMenuItem menuItemAccountManage = new JMenuItem("Manage");

    protected MenuBar(){
        super();
        menuFile.add(menuFileSave);
        menuFile.add(menuFileExit);
        add(menuFile);
        menuFileExit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
}
}
