package stopwatchlabel;

import javax.swing.*;
import java.awt.*;

/**
 * Tests the custom component classes MirrorText and StopWatchLabel
 * by adding them both to a panel. The panel also contains a button
 * that changes the text on the MirrorText component (and also on
 * the button itself). This program also demonstrates how the layout
 * of the panel is recomputed when the components are changed.
 */

public class CustomComponentTest extends JPanel {

    private StopWatchLabel timer;

    /**
     * The main routine simply opens a window that shows a CustomComponentTest panel.
     */

    public static void main(String[] args) {
        JFrame window = new JFrame("CustomComponentText");
        CustomComponentTest content = new CustomComponentTest();
        window.setContentPane(content);
        window.setSize(420,150);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        window.setLocation((screenSize.width - window.getWidth()) /2,
                (screenSize.height - window.getHeight()) /2);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }



    public CustomComponentTest(){

        setLayout(new FlowLayout());

        timer = new StopWatchLabel();
        timer.setBackground(Color.WHITE);
        timer.setForeground(Color.blue);
        timer.setOpaque(true);
        timer.setFont(new Font("Serif",Font.PLAIN,20));
        add(timer);

        System.out.println(timer.isRunning());
    }
}
