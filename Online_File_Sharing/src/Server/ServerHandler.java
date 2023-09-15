/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author tharo
 */
public class ServerHandler implements Runnable {
    
    private Socket cliSock;
    
    public ServerHandler(Socket cliSocket) {
        this.cliSock=cliSocket;
        
    }

    @Override
    public void run() {
        try{
            PrintWriter out=new PrintWriter(cliSock.getOutputStream(),true); 
            
        } catch (Exception e) {
                e.printStackTrace();
        }
        
    }
    
}
