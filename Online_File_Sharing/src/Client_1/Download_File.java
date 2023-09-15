/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Client_1;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author This PC
 */
public class Download_File{
    
    void download( String srcPath, String srcName){
        
        String srcAdd = srcPath;
        String destAdd = "C:\\Users\\This PC\\Documents\\NetBeansProjects\\Online_File_Sharing\\src\\Client\\My_Files\\"+srcName;
        
        System.out.println(destAdd);
        try {
            FileChannel srcChnl = FileChannel.open(Paths.get(srcAdd), StandardOpenOption.READ);
            FileChannel destChnl = FileChannel.open(Paths.get(destAdd), StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
            ByteBuffer buff = ByteBuffer.allocate(1024);
            
            
            while(srcChnl.read(buff)!=-1 || buff.position()>0){
                buff.flip();
                while(buff.hasRemaining()){
                    destChnl.write(buff);
                }
                buff.clear();
            }
            srcChnl.close();
            destChnl.close();
            
            
            /*Up_Progress_Bar load = new Up_Progress_Bar();
            load.uploading();*/
            
            Download_Complete ok=new Download_Complete();
            ok.setVisible(true);
            
            
            System.out.println("File Uploaded SuccessFully.....!!!!");
                
            
        } catch (IOException e) {
            System.out.println("Please Select a file ");
            Download_Error err= new Download_Error();
            err.setVisible(true);
            e.printStackTrace();
        }
        
        
        
    }
    
}


