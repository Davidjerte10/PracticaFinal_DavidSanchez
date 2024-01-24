/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.EmailUtil;
import com.formdev.flatlaf.FlatLightLaf;
import controlador.HibernateUtil;
import java.security.SecureRandom;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import modelo.Usuarios;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author David Sánchez Ávila
 */
public class RecuperarPassword extends javax.swing.JFrame {

    /**
     * Creates new form RecuperarPassword
     */
    public RecuperarPassword() {
        initComponents();
        FlatLightLaf.setup();
                    
        //Redondeos
        textFieldCorreo.putClientProperty("FlatLaf.style", "arc: 20");
        botonRecuperar.putClientProperty("FlatLaf.style", "arc: 20"); 
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
        labelRecuperar = new javax.swing.JLabel();
        textFieldCorreo = new javax.swing.JTextField();
        labelCorreo = new javax.swing.JLabel();
        botonRecuperar = new javax.swing.JButton();
        labelIcono = new javax.swing.JLabel();
        panelVolver = new javax.swing.JPanel();
        labelVolver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Recuperar");
        setMinimumSize(new java.awt.Dimension(800, 550));
        setPreferredSize(new java.awt.Dimension(800, 550));
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));

        labelRecuperar.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        labelRecuperar.setForeground(new java.awt.Color(181, 2, 2));
        labelRecuperar.setText("RECUPERAR");

        textFieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCorreoActionPerformed(evt);
            }
        });

        labelCorreo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelCorreo.setForeground(new java.awt.Color(255, 255, 255));
        labelCorreo.setText("Correo");

        botonRecuperar.setBackground(new java.awt.Color(181, 2, 2));
        botonRecuperar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        botonRecuperar.setForeground(new java.awt.Color(255, 255, 255));
        botonRecuperar.setText("Recuperar");
        botonRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRecuperarActionPerformed(evt);
            }
        });

        labelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon.png"))); // NOI18N
        labelIcono.setText("jLabel1");

        panelVolver.setBackground(new java.awt.Color(255, 255, 255));
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
                .addGap(78, 78, 78)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRecuperar)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCorreo)
                            .addComponent(botonRecuperar, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addComponent(labelIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(91, 91, 91))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(labelRecuperar)
                .addGap(16, 16, 16)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(labelCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonRecuperar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCorreoActionPerformed

    private void botonRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRecuperarActionPerformed
        // Configurar envío del correo
        final String fromEmail = "davidjerte10@gmail.com";
        final String password = "xvfjgmjqtzmxmyjk";
        final String toEmail = textFieldCorreo.getText();

        System.out.println("SSLEmail Start");
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.user", fromEmail);
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");

        Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(fromEmail, password);
            }
        };

        Session session = Session.getDefaultInstance(props, auth);
        System.out.println("Sesión Creada");
        
        // Caracteres de la contraseña
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // Longitud de la nueva contraseña
        int longitudPassword = 8;
        
        // Crear un StringBuilder para construir la nueva contraseña
        StringBuilder nuevaPassword = new StringBuilder(longitudPassword);
        
        // Crear un objeto SecureRandom para generar la contraseña de forma segura
        SecureRandom random = new SecureRandom();
        
        // Generar cada caracter de la nueva contraseña de forma aleatoria
        for (int i = 0; i < longitudPassword; i++) {
            int indice = random.nextInt(caracteres.length());
            nuevaPassword.append(caracteres.charAt(indice));
        }

        // Envío del correo
        EmailUtil.sendEmail(session, toEmail, "Recuperación de contraseña", "Su nueva contraseña es " + nuevaPassword);
        
        // Convertir el StringBuilder en String para poder pasarlo al método
        String nuevaPasswordString = nuevaPassword.toString();

        // Llamada al Método que actualiza la contraseña en la base de datos
        actualizarPassword(toEmail, nuevaPasswordString);

        System.out.println("Correo enviado y contraseña actualizada con éxito.");
    }//GEN-LAST:event_botonRecuperarActionPerformed

    private void panelVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelVolverMouseClicked
        Login login = new Login();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_panelVolverMouseClicked
     
    private void actualizarPassword(String correo, String nuevaPassword) {
        try {
            // Establecer conexión
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            // He tenido que importar así a Session porque me daba fallo con el otro import del correo
            org.hibernate.Session sesion = sessionFactory.openSession();
            
            Transaction tx = sesion.beginTransaction();

            Query q = sesion.createQuery("FROM Usuarios WHERE email = :correo");
            q.setParameter("correo", correo);

            Usuarios usuario = (Usuarios) q.uniqueResult();

            if (usuario != null) {
                // Actualizar la contraseña del usuario
                usuario.setPassword(BCrypt.hashpw(nuevaPassword, BCrypt.gensalt()));

                sesion.save(usuario);
                tx.commit();

                System.out.println("Contraseña actualizada en la base de datos.");
            } else {
                System.out.println("Usuario no encontrado en la base de datos.");
            }

            sesion.close();
        } catch (HibernateException e) {
            System.out.println("Error al actualizar la contraseña en la base de datos.");
        }
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRecuperar;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelIcono;
    private javax.swing.JLabel labelRecuperar;
    private javax.swing.JLabel labelVolver;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelVolver;
    private javax.swing.JTextField textFieldCorreo;
    // End of variables declaration//GEN-END:variables
}
