/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Client_1;

import Server.Connected;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author tharo
 */
public class ClientHandler{
    
    public void online() {
        System.out.println("Hello Client This is Your Server");
        Client_1 cls= new Client_1();
        cls.dispose();
        Connected c=new Connected();
        c.setVisible(true);
    }
    
}
