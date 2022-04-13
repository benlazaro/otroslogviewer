package pl.otros.swing.text;

import javax.swing.*;
import javax.swing.plaf.TextUI;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class FullWidthJTextPane extends JTextPane {

    private boolean fullWidth = false;

    public FullWidthJTextPane() {
        super();
    }

    public FullWidthJTextPane(StyledDocument doc) {
        super(doc);
    }

    public boolean getScrollableTracksViewportWidth() {
        if (fullWidth) {
            Container parent = getParent();
            if (parent instanceof JViewport) {
                JViewport port = (JViewport) parent;
                TextUI ui = getUI();
                int w = port.getWidth();
                final Dimension preferredSize = ui.getPreferredSize(this);
                if (preferredSize.width <= w) {
                    return true;
                }
            }
            return false;
        } else {
            return super.getScrollableTracksViewportWidth();
        }
    }

    public boolean isFullWidth() {
        return fullWidth;
    }

    public void setFullWidth(boolean fullWidth) {
        this.fullWidth = fullWidth;
        this.revalidate();
    }

}
