package dj2.gui;
import dj2.core.*;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.*;

import org.checkerframework.checker.index.qual.UpperBoundBottom;

public abstract class AbstractMusicPane extends JTabbedPane{
        protected JPanel pane;
        protected JTextArea textArea;
    
        protected AbstractMusicPane(String title) {
            super();
            pane = new JPanel();
            setFont(new Font("Verdana", Font.BOLD, 12));
            add(title, pane);
            textArea = new JTextArea();
            textArea.setEnabled(false);
            textArea.setFont(new Font("Verdana", Font.BOLD, 12));
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            pane.setLayout(new BorderLayout());
            pane.add(new JScrollPane(textArea), BorderLayout.CENTER);
        }
    
        protected abstract void update();
}

