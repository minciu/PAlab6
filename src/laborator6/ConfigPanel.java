package laborator6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfigPanel extends JPanel{

    private DrawingPanel myCanvas;
    private JTextArea sides;
    private JTextArea shape;
    private JTextArea stroke;
    private JTextArea size;

    public ConfigPanel(DrawingPanel canvas){
        this.myCanvas=canvas;
        addNumberOfSides();
        addNumberOfShapes();
        addStroke();
        addButton();
    }

    private void addButton() {
        JButton button = new JButton("Draw");
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                myCanvas.updateGraphics(Integer.parseInt(sides.getText()),Integer.parseInt(shape.getText()));
            }
        });
        add(button);
    }

    private void addStroke() {
        JLabel label = new JLabel("Stroke");

        stroke = new JTextArea(1,10);
     
        Font font = new Font(
                Font.MONOSPACED,
                Font.PLAIN,
                stroke.getFont().getSize());
        stroke.setFont(font);

        add(label);
        add(stroke);
    }

    private void addNumberOfSides() {
        JLabel label = new JLabel("Number of Sides");

        sides = new JTextArea(1,10);
    
        Font font = new Font(
                Font.MONOSPACED,
                Font.PLAIN,
                sides.getFont().getSize());
        sides.setFont(font);
        add(label);
        add(sides);
    }

    private void addNumberOfShapes(){
        JLabel label = new JLabel("Number of Shapes");

        shape = new JTextArea(1,10);
    
        Font font = new Font(
                Font.MONOSPACED,
                Font.PLAIN,
                shape.getFont().getSize());
        shape.setFont(font);
        add(label);
        add(shape);

    }
    
    private void addSize() {
        JLabel label = new JLabel("Size");

        stroke = new JTextArea(1,10);
     
        Font font = new Font(
                Font.MONOSPACED,
                Font.PLAIN,
                stroke.getFont().getSize());
        stroke.setFont(font);

        add(label);
        add(size);
    }
}