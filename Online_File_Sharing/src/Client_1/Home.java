/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Client_1;

import static Client_1.Download_Files_GUI.fileLbl;
import Server.Conn_Error;
import Server.Connected;
import Server.ServerGUI;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.JFileChooser;

/**
 *
 * @author tharo
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Client2
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        onlineLbl = new javax.swing.JLabel();
        disconLbl = new javax.swing.JLabel();
        upBTN = new javax.swing.JButton();
        downloadBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sendBtn = new javax.swing.JButton();
        downloadBtn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 255, 102)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Sitka Display", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("/^\\  File Sharing Tool");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 484, -1));

        onlineLbl.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        onlineLbl.setForeground(new java.awt.Color(51, 255, 51));
        onlineLbl.setText("Server is Online ...\\/\\/\\/");
        jPanel1.add(onlineLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 308, -1));

        disconLbl.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        disconLbl.setForeground(new java.awt.Color(51, 251, 51));
        disconLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back.png"))); // NOI18N
        disconLbl.setText("Logout ");
        disconLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disconLblMouseClicked(evt);
            }
        });
        jPanel1.add(disconLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, -1, 40));

        upBTN.setBackground(new java.awt.Color(0, 102, 255));
        upBTN.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        upBTN.setForeground(new java.awt.Color(255, 255, 255));
        upBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/upload.png"))); // NOI18N
        upBTN.setText(" Upload");
        upBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upBTNActionPerformed(evt);
            }
        });
        jPanel1.add(upBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 273, 75));

        downloadBtn.setBackground(new java.awt.Color(204, 255, 51));
        downloadBtn.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        downloadBtn.setForeground(new java.awt.Color(0, 0, 0));
        downloadBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/download.png"))); // NOI18N
        downloadBtn.setText("Download");
        downloadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadBtnActionPerformed(evt);
            }
        });
        jPanel1.add(downloadBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 290, 270, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/0QijKY.gif"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, 300));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/shutdown.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, -1));

        sendBtn.setBackground(new java.awt.Color(0, 204, 0));
        sendBtn.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        sendBtn.setForeground(new java.awt.Color(0, 0, 0));
        sendBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/share.png"))); // NOI18N
        sendBtn.setText("Send Files");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });
        jPanel1.add(sendBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 270, -1));

        downloadBtn2.setBackground(new java.awt.Color(51, 255, 204));
        downloadBtn2.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        downloadBtn2.setForeground(new java.awt.Color(0, 0, 0));
        downloadBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/my-documents.png"))); // NOI18N
        downloadBtn2.setText("My Files");
        downloadBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadBtn2ActionPerformed(evt);
            }
        });
        jPanel1.add(downloadBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 270, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );

        setBounds(20, 10, 617, 581);
    }// </editor-fold>//GEN-END:initComponents

    private void disconLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disconLblMouseClicked
        // TODO add your handling code here:
        
        super.dispose();
        Client_1 back=new Client_1();
        back.setVisible(true);

    }//GEN-LAST:event_disconLblMouseClicked

    private void upBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upBTNActionPerformed
        // TODO add your handling code here:
        Upload_Files_GUI upGui=new Upload_Files_GUI();
        upGui.setVisible(true);
        super.dispose();
        
        ServerGUI servObj = new ServerGUI();
        int num=servObj.out();
        System.out.println(num);
        
        /*
        if (num>0){
            Upload_Files_GUI upGui=new Upload_Files_GUI();
            upGui.setVisible(true);
            super.dispose();
        
        }else{
            System.out.println("System errorrrr");
            Conn_Error err= new Conn_Error();
            err.setVisible(true);
        }*/
                
        
        

    }//GEN-LAST:event_upBTNActionPerformed

    private void downloadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadBtnActionPerformed
        // TODO add your handling code here:
        Download_Files_GUI downGui= new Download_Files_GUI();
        downGui.setVisible(true);
        super.dispose();
         
         
        ServerGUI servObj = new ServerGUI();
        int num=servObj.out();
        System.out.println(num);
        /*
        if (num==0){
            System.out.println("System errorrrr");
            Conn_Error err= new Conn_Error();
            err.setVisible(true);
        
        }else{
            Download_Files_GUI downGui= new Download_Files_GUI();
            downGui.setVisible(true);
            super.dispose();
        }*/
    }//GEN-LAST:event_downloadBtnActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        // TODO add your handling code here:
        Send_GUI send = new Send_GUI();
            send.setVisible(true);
            super.dispose();
        
        ServerGUI servObj = new ServerGUI();
        int num=servObj.out();
        System.out.println(num);
        /*
        if (num==0){
            System.out.println("System errorrrr");
            Conn_Error err= new Conn_Error();
            err.setVisible(true);
        
        }else{
            Send_GUI send = new Send_GUI();
            send.setVisible(true);
            super.dispose();
        }*/
        
        
        
       
    }//GEN-LAST:event_sendBtnActionPerformed

    private void downloadBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadBtn2ActionPerformed
        // TODO add your handling code here:
        JFileChooser jf = new JFileChooser();

            File folder = new File("C:\\Users\\This PC\\Documents\\NetBeansProjects\\Online_File_Sharing\\src\\Client\\My_Files");
            File[] files= folder.listFiles();
            jf.setCurrentDirectory(folder);


            jf.setDialogTitle("This is Your Content...!");
            jf.showOpenDialog(null);
            final File[] fileToSend= new File[1];
        
        
        ServerGUI servObj = new ServerGUI();
        int num=servObj.out();
        System.out.println(num);
        /*
        if (num==0){
            System.out.println("System errorrrr");
            Conn_Error err= new Conn_Error();
            err.setVisible(true);
        
        }else{
           
            JFileChooser jf = new JFileChooser();

            File folder = new File("C:\\Users\\This PC\\Documents\\NetBeansProjects\\Online_File_Sharing\\src\\Client\\My_Files");
            File[] files= folder.listFiles();
            jf.setCurrentDirectory(folder);


            jf.setDialogTitle("This is Your Content...!");
            jf.showOpenDialog(null);
            final File[] fileToSend= new File[1];
        }
        */
        
    }//GEN-LAST:event_downloadBtn2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
           
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel disconLbl;
    private javax.swing.JButton downloadBtn;
    private javax.swing.JButton downloadBtn2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel onlineLbl;
    private javax.swing.JButton sendBtn;
    private javax.swing.JButton upBTN;
    // End of variables declaration//GEN-END:variables
}
