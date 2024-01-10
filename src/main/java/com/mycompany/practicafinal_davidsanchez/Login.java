/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.practicafinal_davidsanchez;

import com.formdev.flatlaf.FlatLightLaf;

/**
 *
 * @author David Sánchez
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
        Escalar escalar = new Escalar();
        
        //Redondear el botón del Login
        botonLogin.putClientProperty( "JButton.buttonType", "roundRect" );
        
        escalar.escalarLabel(labelIcono,"/img/logo.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        labelLogin = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        textFieldCorreo = new javax.swing.JTextField();
        labelCorreo = new javax.swing.JLabel();
        textFieldPassword = new javax.swing.JTextField();
        botonLogin = new javax.swing.JButton();
        labelIcono = new javax.swing.JLabel();
        labelOlvidada = new javax.swing.JLabel();
        checkBoxCuenta = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 550));
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));

        labelLogin.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(181, 2, 2));
        labelLogin.setText("BIENVENIDO");

        labelPassword.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(181, 2, 2));
        labelPassword.setText("Contraseña");

        textFieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCorreoActionPerformed(evt);
            }
        });

        labelCorreo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelCorreo.setForeground(new java.awt.Color(181, 2, 2));
        labelCorreo.setText("Correo");

        textFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPasswordActionPerformed(evt);
            }
        });

        botonLogin.setBackground(new java.awt.Color(181, 2, 2));
        botonLogin.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        botonLogin.setForeground(new java.awt.Color(255, 255, 255));
        botonLogin.setText("Login");

        labelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        labelIcono.setText("jLabel1");

        labelOlvidada.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        labelOlvidada.setForeground(new java.awt.Color(181, 2, 2));
        labelOlvidada.setText("Contraseña olvidada?");

        checkBoxCuenta.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        checkBoxCuenta.setForeground(new java.awt.Color(181, 2, 2));
        checkBoxCuenta.setText("No tengo cuenta");

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(labelLogin))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(textFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(labelPassword))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(botonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addComponent(checkBoxCuenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelOlvidada))))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(labelCorreo)))
                .addGap(70, 70, 70)
                .addComponent(labelIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(labelLogin)
                .addGap(16, 16, 16)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(labelCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(labelPassword)
                        .addGap(3, 3, 3)
                        .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelOlvidada)
                            .addComponent(checkBoxCuenta))
                        .addGap(26, 26, 26)
                        .addComponent(botonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCorreoActionPerformed

    private void textFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        FlatLightLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonLogin;
    private javax.swing.JCheckBox checkBoxCuenta;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelIcono;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelOlvidada;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTextField textFieldCorreo;
    private javax.swing.JTextField textFieldPassword;
    // End of variables declaration//GEN-END:variables
}
