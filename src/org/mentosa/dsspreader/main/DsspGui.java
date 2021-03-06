/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.mentosa.dsspreader.main;

import java.io.File;

/**
 * @author Jimmy
 */
public class DsspGui extends javax.swing.JFrame {

    /**
     * Creates new form DsspGui
     */
    public DsspGui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lblBaseAddress = new javax.swing.JLabel();
        lblListFile = new javax.swing.JLabel();
        txtListFile = new javax.swing.JTextField();
        txtBaseAddress = new javax.swing.JTextField();
        chkUseList = new javax.swing.JCheckBox();
        btnStart = new javax.swing.JButton();
        scrollArea = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaLog = new javax.swing.JTextArea();
        btnStop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(602, 421));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        setResizable(false);
        lblBaseAddress.setText("Dssp Filles Address");
        getContentPane().add(lblBaseAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, 20));

        lblListFile.setText("Dssp List File Address");
        getContentPane().add(lblListFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, -1));

        txtListFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtListFileActionPerformed(evt);
            }
        });
        getContentPane().add(txtListFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 300, -1));

        txtBaseAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBaseAddressActionPerformed(evt);
            }
        });
        getContentPane().add(txtBaseAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 300, 20));

        chkUseList.setText("Use List ");
        getContentPane().add(chkUseList, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        getContentPane().add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 140, -1));

        scrollArea.setAutoscrolls(false);

        txtAreaLog.setColumns(20);
        txtAreaLog.setRows(5);
        txtAreaLog.setEnabled(false);
        jScrollPane1.setViewportView(txtAreaLog);

        scrollArea.setViewportView(jScrollPane1);

        getContentPane().add(scrollArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 550, 350));

        btnStop.setText("Stop");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });
        getContentPane().add(btnStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 130, -1));

        pack();
    }// </editor-fold>                        

    private void txtListFileActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtBaseAddressActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {
        String fileLocation = txtBaseAddress.getText().trim();
        Runner.LOGGER.info("You entered this addresse : " + fileLocation + " ");
        Runner.LOGGER.info("All files would be created in this address.");
        txtAreaLog.append("You entered this addresse : " + fileLocation + "\n");
        txtAreaLog.append("All files would be created in this address.\n");
        //-----------------------------------------------------------
        Runner.tempFolderAddress = fileLocation + System.getProperty("file.separator") + "tempfiles" + System.getProperty("file.separator");
        Runner.midFilesAddress = fileLocation + System.getProperty("file.separator") + "midFiles" + System.getProperty("file.separator");
        Runner.resultFiles = fileLocation + System.getProperty("file.separator") + "resultFiles" + System.getProperty("file.separator");
        Runner.partialResult = fileLocation + System.getProperty("file.separator") + "partialResult" + System.getProperty("file.separator");
        Runner.logFileAddress = fileLocation + System.getProperty("file.separator") + "log" + System.getProperty("file.separator");
        Runner.tempListAddress = new File(txtListFile.getText().trim());
        //-----------------------------------------------------------
        Divider.hTempFileAddress = fileLocation + System.getProperty("file.separator") + "H TEMP" + System.getProperty("file.separator");
        Divider.cTempFileAddress = fileLocation + System.getProperty("file.separator") + "C TEMP" + System.getProperty("file.separator");
        Divider.eTempFileAddress = fileLocation + System.getProperty("file.separator") + "E Temp" + System.getProperty("file.separator");
        Divider.hcResultFolder = fileLocation + System.getProperty("file.separator") + "HC" + System.getProperty("file.separator");
        Divider.heResultFolder= fileLocation + System.getProperty("file.separator") + "HE" + System.getProperty("file.separator");
        Divider.ecResultFolder = fileLocation + System.getProperty("file.separator") + "EC" + System.getProperty("file.separator");
        //-----------------------------------------------------------
        boolean flag = chkUseList.isSelected();
        new Runner().run(fileLocation, flag);
        txtAreaLog.append("Process is done");

    }

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {
        txtAreaLog.append("Stopped by user \n");
        System.exit(-1);
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DsspGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DsspGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DsspGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DsspGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

        new DsspGui().setVisible(true);
    }

    // Variables declaration - do not modify                     
    public static javax.swing.JButton btnStart;
    public static javax.swing.JButton btnStop;
    public static javax.swing.JCheckBox chkUseList;
    private static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblBaseAddress;
    public static javax.swing.JLabel lblListFile;
    private static javax.swing.JScrollPane scrollArea;
    public static javax.swing.JTextArea txtAreaLog;
    public static javax.swing.JTextField txtBaseAddress;
    public static javax.swing.JTextField txtListFile;
    // End of variables declaration                   
}
