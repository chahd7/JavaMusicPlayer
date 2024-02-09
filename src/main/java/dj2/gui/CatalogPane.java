package dj2.gui;

import dj2.core.*;

import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

class CatalogPane extends JTabbedPane{
    private RecentPlaylistPane recent;
    
    protected CatalogPane(CatalogStyle catalog, ManualPlaylistPane manual, RecentPlaylistPane recent, PlayingPane play) {
        Style[] styles = catalog.getStyles();
        setFont(new Font("Verdana", Font.BOLD, 12));
        int i = 0;
        this.recent = recent;
        this.setBackground(new Color(247, 239, 223));
        for(Style style : styles){
            Music[] musics = new Music[100];
            musics = style.getTracks();
            if(musics == null)
                continue;
            JPanel musicsPane = new JPanel();
            for(Music music : musics)
            musicsPane.add(new MusicPane(music, manual, recent, play));
            add(style.getName(), musicsPane);
        
}


}
}
