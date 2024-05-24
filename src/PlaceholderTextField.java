import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JTextField;

public class PlaceholderTextField extends JTextField {
    private String placeholder;

    public PlaceholderTextField(String placeholder) {
        this.placeholder = placeholder;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // If the text field is empty and does not have focus, draw the placeholder text
        if (getText().isEmpty() && !hasFocus()) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setColor(Color.GRAY);
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int x = getInsets().left;
            int y = g.getFontMetrics().getAscent() + getInsets().top;
            g2d.drawString(placeholder, x, y);
            g2d.dispose();
        }
    }
}
