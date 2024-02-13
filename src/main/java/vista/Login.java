/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import com.formdev.flatlaf.FlatLightLaf;
import controlador.UsuariosController;
import javax.swing.JOptionPane;
import modelo.Usuarios;
import org.mindrot.jbcrypt.BCrypt;



/**
 *
 * @author David Sanchez Avila
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
        // Placeholders
        textFieldCorreo.putClientProperty("JTextField.placeholderText", "Inserte su correo");
        passwordField.putClientProperty("JTextField.placeholderText", "Inserte su contraseña");
             
        // Redondeos
        botonLogin.putClientProperty( "FlatLaf.style", "arc: 25" );    
        textFieldCorreo.putClientProperty("FlatLaf.style", "arc: 20");
        passwordField.putClientProperty("FlatLaf.style", "arc: 20");
        botonRegistro.putClientProperty( "FlatLaf.style", "arc: 25" );
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
        botonLogin = new javax.swing.JButton();
        labelIcono = new javax.swing.JLabel();
        labelOlvidada = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        botonRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(800, 550));
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));

        labelLogin.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(181, 2, 2));
        labelLogin.setText("BIENVENIDO");

        labelPassword.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(255, 255, 255));
        labelPassword.setText("Contraseña");

        textFieldCorreo.setToolTipText("Inserte su correo electrónico");
        textFieldCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textFieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCorreoActionPerformed(evt);
            }
        });

        labelCorreo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelCorreo.setForeground(new java.awt.Color(255, 255, 255));
        labelCorreo.setText("Correo");

        botonLogin.setBackground(new java.awt.Color(181, 2, 2));
        botonLogin.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        botonLogin.setForeground(new java.awt.Color(255, 255, 255));
        botonLogin.setText("Login");
        botonLogin.setToolTipText("Pulse para entrar al programa");
        botonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLoginActionPerformed(evt);
            }
        });

        labelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon.png"))); // NOI18N
        labelIcono.setText("jLabel1");

        labelOlvidada.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        labelOlvidada.setForeground(new java.awt.Color(181, 2, 2));
        labelOlvidada.setText("Contraseña olvidada?");
        labelOlvidada.setToolTipText("Pulse si se le ha olvidado la contraseña");
        labelOlvidada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelOlvidada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelOlvidadaMouseClicked(evt);
            }
        });

        passwordField.setToolTipText("Inserte su contraseña");
        passwordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jSeparator1.setMinimumSize(new java.awt.Dimension(80, 10));

        botonRegistro.setBackground(new java.awt.Color(181, 2, 2));
        botonRegistro.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        botonRegistro.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistro.setText("No tengo cuenta");
        botonRegistro.setToolTipText("Pulse si no tiene cuenta");
        botonRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(labelLogin)
                .addGap(471, 545, Short.MAX_VALUE))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(textFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(labelCorreo))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(botonRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPassword)
                            .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(passwordField)
                                .addGroup(panelFondoLayout.createSequentialGroup()
                                    .addGap(148, 148, 148)
                                    .addComponent(labelOlvidada))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelIcono)
                .addGap(80, 80, 80))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(labelLogin)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(labelCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(labelPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelOlvidada)
                        .addGap(26, 26, 26)
                        .addComponent(botonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(botonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCorreoActionPerformed

    /**
     * Metodo action performed que se encarga de el logueo en la base de datos
     * @param evt 
     */
    private void botonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLoginActionPerformed
        // Coger la información de los campos de texto
        String correo = textFieldCorreo.getText();
        char[] passwordCaracteres = passwordField.getPassword();
        
        // Convertir la contraseña a String para utilizarla
        String password = new String(passwordCaracteres);

        // Validar que los campos no estén vacíos
        if (correo.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        UsuariosController usuariosController = new UsuariosController();

        Usuarios usuario = usuariosController.login(correo);
        // Verificar si se encontró un usuario con el correo proporcionado
        if (usuario != null && BCrypt.checkpw(password, usuario.getPassword())) {
            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");

            VistaPrincipal vistaPrincipal = new VistaPrincipal();
            vistaPrincipal.setVisible(true);
            this.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(null, "Correo o contraseña erroneos", "Error", JOptionPane.ERROR_MESSAGE);
        }
            
    }//GEN-LAST:event_botonLoginActionPerformed

    /**
     * Metodo mouse clicked que se encarga de abrir la vista RecuperarPassword
     * @param evt 
     */
    private void labelOlvidadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOlvidadaMouseClicked
        RecuperarPassword recuperar = new RecuperarPassword();
        recuperar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_labelOlvidadaMouseClicked

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    /**
     * Metodo action performed que se encarga de abrir la vista Registro
     * @param evt 
     */
    private void botonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroActionPerformed
        // TODO add your handling code here:
        Registro registro = new Registro();
        registro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonRegistroActionPerformed

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
    private javax.swing.JButton botonRegistro;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelIcono;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelOlvidada;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField textFieldCorreo;
    // End of variables declaration//GEN-END:variables
}
