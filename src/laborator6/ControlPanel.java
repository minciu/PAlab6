package laborator6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.File;
import javafx.stage.FileChooser;



public class ControlPanel extends JPanel {
    private DrawingPanel myCanvas;

    public ControlPanel( DrawingPanel myCanvas){
        this.myCanvas=myCanvas;
        addResetButton();
        addLoadButton();
        addSaveButton();
        addExitButton();
    }
    
    
    
    private void addResetButton() {
        JButton button = new JButton("Reset");
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                myCanvas.reset();
            }
        });
        add(button);
    }

    private void addLoadButton() {
        
        JButton button = new JButton("Load");
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                OpenFile of=new OpenFile();
                try{
                of.PickMe();
                } catch(Exception el){
                el.printStackTrace();
                }
            
            
            }
        }
        );
        add(button);
    }

    private void addSaveButton() {
        JButton button = new JButton("Save");
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                OpenFile of=new OpenFile();
                try{
                of.PickMe();
                } catch(Exception el){
                el.printStackTrace();
                }
            }
        });
        add(button);
    }
    
    private void addExitButton() {
        JButton button = new JButton("Exit");
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                myCanvas.reset();
            }
        });
        add(button);
    }
}
