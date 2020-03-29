package laborator6;


import javax.swing.*;
import java.awt.*;

public class MainFrame {

    public void startFrame(){
        JFrame frame = new JFrame("FrameDemo");
        frame.setSize(800,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addComponentsToPane(frame.getContentPane());

        frame.setVisible(true);
    }

    private static void addComponentsToPane(Container pane) {

        if (!(pane.getLayout() instanceof BorderLayout)) {
            pane.add(new JLabel("Container doesn't use BorderLayout!"));
            return;
        }

        JPanel panel = new JPanel();
        panel.setMaximumSize(new Dimension(500, 500));
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setAlignmentY(Component.CENTER_ALIGNMENT);


        DrawingPanel canv = new DrawingPanel();
        canv.setPreferredSize(new Dimension(400,300));
        panel.add(canv);

        pane.add(new ConfigPanel(canv),BorderLayout.PAGE_START);
        pane.add(panel,BorderLayout.CENTER);
        pane.add(new ControlPanel(canv),BorderLayout.PAGE_END);

    }

}