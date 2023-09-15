/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Client_2;

import Client_1.*;
import Server.Connected;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author tharo
 */
public class Client_2_Handler{
    
    public void online() {
        System.out.println("Hello Client This is Your Server");
        Client_2 cls= new Client_2();
        cls.dispose();
        Conn_OK c=new Conn_OK();
        c.setVisible(true);
    }
    public void recFile(String name){
        System.out.println(name);
        Recieve_Files_GUI val= new Recieve_Files_GUI();
        
        
    }
    
}
