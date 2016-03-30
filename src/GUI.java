
import java.awt.Point;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Edwin
 */
public class GUI extends javax.swing.JFrame {

    //attr
    byte[] plainByte;
    
    /**
     * Creates new form GUI
     */
    public GUI() {
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

        fileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        privateLabel = new javax.swing.JLabel();
        publicLabel = new javax.swing.JLabel();
        publicKeyField1 = new javax.swing.JTextField();
        privateKeyField1 = new javax.swing.JTextField();
        saveKeyButton = new javax.swing.JButton();
        encryptButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        processTimeLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        input1 = new javax.swing.JTextArea();
        inputLabel = new javax.swing.JLabel();
        openButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        output1 = new javax.swing.JTextArea();
        keyLabel2 = new javax.swing.JLabel();
        saveCipherButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        input2 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        privateLabel1 = new javax.swing.JLabel();
        publicLabel1 = new javax.swing.JLabel();
        publicKeyField2 = new javax.swing.JTextField();
        privateKeyField2 = new javax.swing.JTextField();
        saveKeyButton1 = new javax.swing.JButton();
        decryptButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        processTimeLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        input3 = new javax.swing.JTextArea();
        keyLabel3 = new javax.swing.JLabel();
        inputLabel1 = new javax.swing.JLabel();
        openButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Key"));

        privateLabel.setText("Private");

        publicLabel.setText("Public");

        publicKeyField1.setEditable(false);
        publicKeyField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publicKeyField1ActionPerformed(evt);
            }
        });

        privateKeyField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                privateKeyField1ActionPerformed(evt);
            }
        });

        saveKeyButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        saveKeyButton.setText("Save Key");
        saveKeyButton.setName(""); // NOI18N
        saveKeyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveKeyButtonActionPerformed(evt);
            }
        });

        encryptButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        encryptButton.setText("Encrypt");
        encryptButton.setName(""); // NOI18N
        encryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Process Time :");

        processTimeLabel1.setText("0 ms");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(privateLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(privateKeyField1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(publicLabel)
                            .addGap(18, 18, 18)
                            .addComponent(publicKeyField1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(saveKeyButton)
                        .addGap(18, 18, 18)
                        .addComponent(encryptButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(processTimeLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(privateLabel)
                    .addComponent(privateKeyField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(publicLabel)
                    .addComponent(publicKeyField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveKeyButton)
                    .addComponent(encryptButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(processTimeLabel1))
                .addGap(22, 22, 22))
        );

        input1.setColumns(20);
        input1.setRows(5);
        jScrollPane1.setViewportView(input1);

        inputLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputLabel.setText("PlainText :");

        openButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        openButton1.setText("Open");
        openButton1.setName(""); // NOI18N
        openButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButton1ActionPerformed(evt);
            }
        });

        output1.setColumns(20);
        output1.setRows(5);
        jScrollPane2.setViewportView(output1);

        keyLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        keyLabel2.setText("Ciphertext :");

        saveCipherButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        saveCipherButton.setText("Save");
        saveCipherButton.setName(""); // NOI18N
        saveCipherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCipherButtonActionPerformed(evt);
            }
        });

        input2.setColumns(20);
        input2.setRows(5);
        jScrollPane3.setViewportView(input2);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Key"));

        privateLabel1.setText("Private");

        publicLabel1.setText("Public");

        publicKeyField2.setEditable(false);

        privateKeyField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                privateKeyField2ActionPerformed(evt);
            }
        });

        saveKeyButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        saveKeyButton1.setText("Save Key");
        saveKeyButton1.setName(""); // NOI18N
        saveKeyButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveKeyButton1ActionPerformed(evt);
            }
        });

        decryptButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        decryptButton.setText("Decrypt");
        decryptButton.setName(""); // NOI18N
        decryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Process Time :");

        processTimeLabel2.setText("0 ms");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(privateLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(privateKeyField2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(publicLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(publicKeyField2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(saveKeyButton1)
                        .addGap(18, 18, 18)
                        .addComponent(decryptButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(processTimeLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(privateLabel1)
                    .addComponent(privateKeyField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(publicLabel1)
                    .addComponent(publicKeyField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveKeyButton1)
                    .addComponent(decryptButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(processTimeLabel2))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        input3.setColumns(20);
        input3.setRows(5);
        jScrollPane4.setViewportView(input3);

        keyLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        keyLabel3.setText("Plaintext :");

        inputLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputLabel1.setText("Ciphertext :");

        openButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        openButton2.setText("Open");
        openButton2.setName(""); // NOI18N
        openButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(openButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(keyLabel3)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(openButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(keyLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(saveCipherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(keyLabel2)
                            .addComponent(saveCipherButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(inputLabel)
                                .addComponent(openButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputLabel1)
                            .addComponent(openButton2)
                            .addComponent(keyLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void privateKeyField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_privateKeyField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_privateKeyField1ActionPerformed

    private void openButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButton1ActionPerformed
        // TODO add your handling code here:
        int returnVal = fileChooser.showOpenDialog(this);

        // process selected file
        String filePath = null;
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            filePath = file.getAbsolutePath();
        } else {
            System.out.println("File access cancelled by user.");
        }

        //load selected file
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filePath);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //load as bytes
        Path path = Paths.get(filePath);
        try {
            plainByte = Files.readAllBytes(path);
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Always wrap FileReader in BufferedReader.
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try {
            input1.read(bufferedReader, filePath);
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_openButton1ActionPerformed

    private void saveCipherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCipherButtonActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        int returnVal = fileChooser.showSaveDialog(this);
       
        // process selected file
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedWriter fileOut = new BufferedWriter(new FileWriter(file))) {
                output1.write(fileOut);
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            //System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_saveCipherButtonActionPerformed

    private void saveKeyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveKeyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveKeyButtonActionPerformed

    private void encryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptButtonActionPerformed
        // TODO add your handling code here:
        ECC.setEq(43, 46, 241);
        ECC.countGaloisField();
        
        ElGamal E = new ElGamal();
        long priB = Long.parseLong(this.privateKeyField1.getText());
        Point B = new Point(12,230); //basis
        Point pub = E.generatePublicKey(priB, B);
        String encrypted;
        try {
            encrypted = E.EncryptElGamal(plainByte,pub,B);
            output1.append(encrypted); // append to jtextarea
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        //read by line
//        String s[] = input1.getText().split("\\r?\\n");
//        ArrayList<String>inputList = new ArrayList<>(Arrays.asList(s));
//        for(int i=0; i<inputList.size(); i++){
//            String message = inputList.get(i);
//            output1.append(encrypted + "\n"); // append to jtextarea
//        }
        
    }//GEN-LAST:event_encryptButtonActionPerformed

    private void privateKeyField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_privateKeyField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_privateKeyField2ActionPerformed

    private void saveKeyButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveKeyButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveKeyButton1ActionPerformed

    private void decryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_decryptButtonActionPerformed

    private void openButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openButton2ActionPerformed

    private void publicKeyField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publicKeyField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publicKeyField1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton decryptButton;
    private javax.swing.JButton encryptButton;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JTextArea input1;
    private javax.swing.JTextArea input2;
    private javax.swing.JTextArea input3;
    private javax.swing.JLabel inputLabel;
    private javax.swing.JLabel inputLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel keyLabel2;
    private javax.swing.JLabel keyLabel3;
    private javax.swing.JButton openButton1;
    private javax.swing.JButton openButton2;
    private javax.swing.JTextArea output1;
    private javax.swing.JTextField privateKeyField1;
    private javax.swing.JTextField privateKeyField2;
    private javax.swing.JLabel privateLabel;
    private javax.swing.JLabel privateLabel1;
    private javax.swing.JLabel processTimeLabel1;
    private javax.swing.JLabel processTimeLabel2;
    private javax.swing.JTextField publicKeyField1;
    private javax.swing.JTextField publicKeyField2;
    private javax.swing.JLabel publicLabel;
    private javax.swing.JLabel publicLabel1;
    private javax.swing.JButton saveCipherButton;
    private javax.swing.JButton saveKeyButton;
    private javax.swing.JButton saveKeyButton1;
    // End of variables declaration//GEN-END:variables
}
