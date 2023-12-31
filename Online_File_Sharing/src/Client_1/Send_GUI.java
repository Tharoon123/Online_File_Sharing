/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Client_1;

import Client_2.Recieve_Files_GUI;
import Client_2.Client_2_Handler;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author This PC
 */
public class Send_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Send_GUI
     */
    public Send_GUI() {
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
        fileLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        upBTN = new javax.swing.JButton();
        locationLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        disconLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        showBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Display", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 0));
        jLabel1.setText("  <-Online File Sharing Tool->");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        fileLbl.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        fileLbl.setForeground(new java.awt.Color(51, 255, 204));
        jPanel1.add(fileLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 380, 570, 71));

        jLabel2.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 51));
        jLabel2.setText("Server is Online ...\\/\\/\\/");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 6, 308, -1));

        upBTN.setBackground(new java.awt.Color(153, 153, 0));
        upBTN.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        upBTN.setForeground(new java.awt.Color(255, 255, 255));
        upBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/upload.png"))); // NOI18N
        upBTN.setText("Share");
        upBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upBTNActionPerformed(evt);
            }
        });
        jPanel1.add(upBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 270, 70));

        locationLbl.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        locationLbl.setForeground(new java.awt.Color(51, 255, 204));
        jPanel1.add(locationLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 469, 570, 75));

        nameLbl.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(51, 255, 204));
        jPanel1.add(nameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 562, 570, 72));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/hacker.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 42, -1, -1));

        disconLbl.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        disconLbl.setForeground(new java.awt.Color(51, 251, 51));
        disconLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back.png"))); // NOI18N
        disconLbl.setText("Home");
        disconLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disconLblMouseClicked(evt);
            }
        });
        jPanel1.add(disconLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/0QijKY.gif"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 400, 150));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/shutdown.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, -1, -1));

        showBtn.setBackground(new java.awt.Color(0, 51, 51));
        showBtn.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        showBtn.setForeground(new java.awt.Color(102, 255, 102));
        showBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/database-storage.png"))); // NOI18N
        showBtn.setText("Select Files");
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });
        jPanel1.add(showBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 270, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void upBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upBTNActionPerformed
        // TODO add your handling code here:
        String file=fileLbl.getText();
        String loc=locationLbl.getText();
        String name=nameLbl.getText();
        
        System.out.println(file + loc + name );
        
        

        /*Client_2_Handler client2= new Client_2_Handler();
        client2.recFile("Client #1 is Sending File...");*/
        
        /*
        Recieve_Files_GUI recF=new Recieve_Files_GUI();
        recF.name("CLient #1 is Sending a File...", loc, name);
        recF.setVisible(true);**/
        
        if(file=="" || loc == "" || name == ""){
            nameLbl.setText("Please Select a file .... ");
            fileLbl.setText("");
            locationLbl.setText("");
        
        }else{
            Recieve_Files_GUI recF=new Recieve_Files_GUI();
            recF.name("CLient #1 is Sending a File...", loc, name);
            recF.setVisible(true);
            fileLbl.setText("");
            locationLbl.setText("");
            nameLbl.setText("");
        
        }
        
    }//GEN-LAST:event_upBTNActionPerformed

    private void disconLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disconLblMouseClicked
        // TODO add your handling code here:

        Home back=new Home();
        back.setVisible(true);
        super.dispose();

    }//GEN-LAST:event_disconLblMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
        // TODO add your handling code here:
        //List <String> results = new ArrayList<String>();
        //If this pathname does not denote a directory, then listFiles() returns null.

        JFileChooser jf = new JFileChooser();
        fileLbl.setText("");

        nameLbl.setText("");
        File folder = new File("C:\\Users\\This PC\\Documents\\NetBeansProjects\\Online_File_Sharing\\src\\Client\\My_Files");
        File[] files= folder.listFiles();
        jf.setCurrentDirectory(folder);

        jf.setDialogTitle("Choose A File...!!!");
        final File[] fileToSend= new File[1];
        if (jf.showOpenDialog(null)== JFileChooser.APPROVE_OPTION){

            fileToSend[0] =jf.getSelectedFile();
            String path=jf.getSelectedFile().getAbsolutePath();
            fileLbl.setText("The file you want to Download is ");
            nameLbl.setText("'" + jf.getName(fileToSend[0]) + "'");
            locationLbl.setText(path);

        }else{

            System.out.println("errorrrrr");

        }

    }//GEN-LAST:event_showBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Send_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Send_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Send_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Send_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Send_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel disconLbl;
    private javax.swing.JLabel fileLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel locationLbl;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JButton showBtn;
    private javax.swing.JButton upBTN;
    // End of variables declaration//GEN-END:variables
}
