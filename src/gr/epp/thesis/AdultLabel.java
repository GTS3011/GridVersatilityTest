package gr.epp.thesis;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author vigos.ioannis
 */
public class AdultLabel extends JLabel implements ViewItem {

    ImageIcon decorImage = new ImageIcon("graphics/bismarck.png");

    public AdultLabel() {
        setHorizontalAlignment(CENTER);
        setIcon(decorImage);
    }

    @Override
    public void itemIcon() {
    }

    @Override
    public boolean isWarship() {
        return false;
    }

    @Override
    public void checker() {
    }
}
