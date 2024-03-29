/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import com.formdev.flatlaf.FlatLightLaf;
import controlador.UsuariosController;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;




/**
 *
 * @author David Sanchez Avila
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        FlatLightLaf.setup();
        
        // Boton por defecto
        getRootPane().setDefaultButton(botonRegistro);
         
        // Placeholders
        textFieldCorreo.putClientProperty("JTextField.placeholderText", "Inserte su correo");
        passwordField.putClientProperty("JTextField.placeholderText", "Inserte su contraseña");
        textFieldNombre.putClientProperty("JTextField.placeholderText", "Inserte su nombre");
        textFieldApellidos.putClientProperty("JTextField.placeholderText", "Inserte sus apellidos");
        
        //Redondeos
        botonRegistro.putClientProperty( "FlatLaf.style", "arc: 25" );
        textFieldNombre.putClientProperty("FlatLaf.style", "arc: 20");
        textFieldApellidos.putClientProperty("FlatLaf.style", "arc: 20");
        textFieldCorreo.putClientProperty("FlatLaf.style", "arc: 20");
        passwordField.putClientProperty("FlatLaf.style", "arc: 20");
        panelVolver.putClientProperty("FlatLaf.style", "arc:50");
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
        labelRegistro = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        botonRegistro = new javax.swing.JButton();
        labelIcono = new javax.swing.JLabel();
        textFieldApellidos = new javax.swing.JTextField();
        labelApellidos = new javax.swing.JLabel();
        textFieldCorreo = new javax.swing.JTextField();
        labelCorreo = new javax.swing.JLabel();
        checkBoxTerminos = new javax.swing.JCheckBox();
        passwordField = new javax.swing.JPasswordField();
        panelVolver = new javax.swing.JPanel();
        labelVolver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro");
        setMinimumSize(new java.awt.Dimension(800, 550));
        setUndecorated(true);
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));

        labelRegistro.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        labelRegistro.setForeground(new java.awt.Color(181, 2, 2));
        labelRegistro.setText("REGISTRO");

        labelPassword.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(255, 255, 255));
        labelPassword.setText("Contraseña");

        textFieldNombre.setToolTipText("Inserte su nombre");
        textFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNombreActionPerformed(evt);
            }
        });

        labelNombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre.setText("Nombre");

        botonRegistro.setBackground(new java.awt.Color(181, 2, 2));
        botonRegistro.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        botonRegistro.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistro.setText("REGISTRATE !");
        botonRegistro.setToolTipText("Pulse para registrase");
        botonRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroActionPerformed(evt);
            }
        });

        labelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon.png"))); // NOI18N
        labelIcono.setText("jLabel1");

        textFieldApellidos.setToolTipText("Inserte sus apellidos");
        textFieldApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldApellidosActionPerformed(evt);
            }
        });

        labelApellidos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelApellidos.setForeground(new java.awt.Color(255, 255, 255));
        labelApellidos.setText("Apellidos");

        textFieldCorreo.setToolTipText("Inserte su correo electrónico");
        textFieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCorreoActionPerformed(evt);
            }
        });

        labelCorreo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelCorreo.setForeground(new java.awt.Color(255, 255, 255));
        labelCorreo.setText("Correo");

        checkBoxTerminos.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        checkBoxTerminos.setForeground(new java.awt.Color(181, 2, 2));
        checkBoxTerminos.setText("Acepto los términos y condiciones");
        checkBoxTerminos.setToolTipText("Pulse si acepta los términos y condicines");
        checkBoxTerminos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkBoxTerminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxTerminosActionPerformed(evt);
            }
        });

        passwordField.setToolTipText("Inserte su contraseña");

        panelVolver.setBackground(new java.awt.Color(255, 255, 255));
        panelVolver.setToolTipText("Pulse para volver al login");
        panelVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelVolverMouseClicked(evt);
            }
        });

        labelVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volver.png"))); // NOI18N

        javax.swing.GroupLayout panelVolverLayout = new javax.swing.GroupLayout(panelVolver);
        panelVolver.setLayout(panelVolverLayout);
        panelVolverLayout.setHorizontalGroup(
            panelVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
            .addGroup(panelVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelVolverLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panelVolverLayout.setVerticalGroup(
            panelVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
            .addGroup(panelVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelVolverLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(labelRegistro))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(panelVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(labelNombre))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelPassword)
                            .addComponent(botonRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(textFieldApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(labelApellidos)
                            .addComponent(textFieldCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(labelCorreo)
                            .addComponent(checkBoxTerminos)
                            .addComponent(passwordField))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(labelIcono)
                .addGap(71, 71, 71))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(panelVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelRegistro)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(labelNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(labelApellidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(labelCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(checkBoxTerminos))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(labelIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(botonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
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

    private void textFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNombreActionPerformed

    private void textFieldApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldApellidosActionPerformed

    private void textFieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCorreoActionPerformed

    private void checkBoxTerminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxTerminosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxTerminosActionPerformed

    /**
     * Metodo action performed que registra el usuario en la base de datos
     * @param evt 
     */
    private void botonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroActionPerformed
        // Recuperar la información de los campos de texto
        String nombre = textFieldNombre.getText();
        String apellidos = textFieldApellidos.getText();
        String correo = textFieldCorreo.getText();
        char[] passwordChars = passwordField.getPassword();
        
        // Convertimos la contraseña a String para poder utilizarla
        String password = new String(passwordChars);

        // Validar que los campos no estén vacíos
        if (nombre.isEmpty() || apellidos.isEmpty() || correo.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Hashear la contraseña utilizando BCrypt
        String hashPassword = BCrypt.hashpw(password, BCrypt.gensalt());

        UsuariosController usuariosController = new UsuariosController();
        
        usuariosController.registrarUsuario(nombre, apellidos, correo, hashPassword);
            
        JOptionPane.showMessageDialog(null, "Usuario insertado correctamente"
                + "\nVuelva al login para entrar al programa");
            
    }//GEN-LAST:event_botonRegistroActionPerformed

    /**
     * Metodo para volver al login
     * @param evt 
     */
    private void panelVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelVolverMouseClicked
        Login login = new Login();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_panelVolverMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistro;
    private javax.swing.JCheckBox checkBoxTerminos;
    private javax.swing.JLabel labelApellidos;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelIcono;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelRegistro;
    private javax.swing.JLabel labelVolver;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelVolver;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField textFieldApellidos;
    private javax.swing.JTextField textFieldCorreo;
    private javax.swing.JTextField textFieldNombre;
    // End of variables declaration//GEN-END:variables
}
