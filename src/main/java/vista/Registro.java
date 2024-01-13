/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.Escalar;
import com.formdev.flatlaf.FlatLightLaf;
import controlador.HibernateUtil;
import modelo.Usuarios;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.password4j.Hash;
import com.password4j.Password;


/**
 *
 * @author David Sánchez
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Registro() {
        initComponents();
        FlatLightLaf.setup();
        
        Escalar escalar = new Escalar();
        
        //Redondear el botón del Login
        botonRegistro.putClientProperty( "JButton.buttonType", "roundRect" );
        
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro");
        setMinimumSize(new java.awt.Dimension(800, 550));
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));

        labelRegistro.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        labelRegistro.setForeground(new java.awt.Color(181, 2, 2));
        labelRegistro.setText("REGISTRO");

        labelPassword.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(181, 2, 2));
        labelPassword.setText("Contraseña");

        textFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNombreActionPerformed(evt);
            }
        });

        labelNombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(181, 2, 2));
        labelNombre.setText("Nombre");

        botonRegistro.setBackground(new java.awt.Color(181, 2, 2));
        botonRegistro.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        botonRegistro.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistro.setText("REGISTRATE !");
        botonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroActionPerformed(evt);
            }
        });

        labelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        labelIcono.setText("jLabel1");

        textFieldApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldApellidosActionPerformed(evt);
            }
        });

        labelApellidos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelApellidos.setForeground(new java.awt.Color(181, 2, 2));
        labelApellidos.setText("Apellidos");

        textFieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCorreoActionPerformed(evt);
            }
        });

        labelCorreo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelCorreo.setForeground(new java.awt.Color(181, 2, 2));
        labelCorreo.setText("Correo");

        checkBoxTerminos.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        checkBoxTerminos.setForeground(new java.awt.Color(181, 2, 2));
        checkBoxTerminos.setText("Acepto los términos y condiciones");
        checkBoxTerminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxTerminosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(labelRegistro))
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
                .addGap(70, 70, 70)
                .addComponent(labelIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(labelRegistro)
                .addGap(16, 16, 16)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
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
                        .addComponent(checkBoxTerminos)))
                .addGap(27, 27, 27)
                .addComponent(botonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            System.out.println("Por favor, complete todos los campos.");
            return;
        }
        
        // Hashear la contraseña utilizando PBKDF2
        Hash hashPassword = Password.hash(password).withPBKDF2();

        // Crear un nuevo objeto Usuarios con la información proporcionada
        Usuarios nuevoUsuario = new Usuarios();
        nuevoUsuario.setNombre(nombre);
        nuevoUsuario.setApellidos(apellidos);
        nuevoUsuario.setEmail(correo);
        nuevoUsuario.setPassword(hashPassword.getResult()); // Guardar el hash en lugar de la contraseña en texto plano

        // Realizar la inserción en la base de datos
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            
            Session session = sessionFactory.openSession();
            Transaction tx = session.beginTransaction();
            
            session.save(nuevoUsuario);
            tx.commit();
            
            System.out.println("Usuario registrado exitosamente.");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al registrar el usuario en la base de datos.");
        }
    }//GEN-LAST:event_botonRegistroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistro;
    private javax.swing.JCheckBox checkBoxTerminos;
    private javax.swing.JLabel labelApellidos;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelIcono;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelRegistro;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField textFieldApellidos;
    private javax.swing.JTextField textFieldCorreo;
    private javax.swing.JTextField textFieldNombre;
    // End of variables declaration//GEN-END:variables
}
