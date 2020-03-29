package laborator6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Random;

public class DrawingPanel extends JPanel {
    private BufferedImage buffer;
    private Graphics2D canvas;
    private int sides;
    private int numbers;

    public DrawingPanel() {
        setBackground(Color.BLUE);
        addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent e){
                sides=5;
                numbers=0;
                drawShapeAt(e.getX(), e.getY());
                repaint();
            }

            public void mouseEntered(MouseEvent arg0) {}
            public void mouseExited(MouseEvent arg0) {}
            public void mousePressed(MouseEvent arg0) {}
            public void mouseReleased(MouseEvent arg0) {}
        });
    }


    @Override
    public void paintComponent(Graphics g) {
        if(buffer == null) {
            buffer = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
            canvas = buffer.createGraphics();
        }
        Random rand = new Random();
        for(int i=0;i<this.numbers;i++){
            drawShapeAt(rand.nextInt((getWidth() - 10) +1) +10,rand.nextInt((getHeight() - 10)+1) +10);
        }
        g.drawImage(buffer, 0, 0, this);
    }

    public void updateGraphics( int sides, int numbers) {
        this.sides=sides;
        this.numbers=numbers;
        repaint();
    }

    private void drawShapeAt(int x, int y) {
        Random rand = new Random();
        canvas.setColor(new Color(rand.nextInt(0xFFFFFF)));
        canvas.fill(new RegularPolygon(x, y, rand.nextInt((30 - 5) +1) +5, sides));
        float dash1[] = {10.0f};
        BasicStroke dashed =
                new BasicStroke(1.0f,
                        BasicStroke.CAP_BUTT,
                        BasicStroke.JOIN_MITER,
                        10.0f, dash1, 0.0f);
        canvas.setStroke(dashed);

    }
    
    

    public void reset() {
        this.sides=0;
        this.numbers=0;
        this.buffer=null;
        repaint();
    }
}