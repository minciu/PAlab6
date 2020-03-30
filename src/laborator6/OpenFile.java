/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laborator6;

import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author user
 */
public class OpenFile {
    JFileChooser fc=new JFileChooser();
    StringBuilder sb=new StringBuilder();

    public void PickMe() throws Exception{
        
    if(fc.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
        java.io.File file=fc.getSelectedFile();
        Scanner input=new Scanner(file);
        while(input.hasNext()){
        sb.append(input.nextLine());
        sb.append("/n");
        }
        input.close();
    }
    else{
    sb.append("Nu a fost selectata nici o fila");
    }
    }
    
}
