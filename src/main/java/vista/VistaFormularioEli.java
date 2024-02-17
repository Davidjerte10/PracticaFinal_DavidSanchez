/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.MonitoresController;
import javax.swing.JOptionPane;


/**
 *
 * @author David Sanchez Avila
 */
public class VistaFormularioEli extends javax.swing.JFrame {

    private final MonitoresController monitoresController;
    /**
     * Creates new form VistaFormulario
     */
    public VistaFormularioEli() {
        initComponents();
        
        monitoresController = new MonitoresController();
        
        // Boton por defecto
        getRootPane().setDefaultButton(botonEliminar);
        
         // Redondeos
        panelVolver.putClientProperty("FlatLaf.style", "arc:50");
        botonEliminar.putClientProperty( "FlatLaf.style", "arc: 25" );
        textFieldId.putClientProperty("FlatLaf.style", "arc: 20");
        
        // Placeholders
        textFieldId.putClientProperty("JTextField.placeholderText", "Inserte el id");
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
        botonEliminar = new javax.swing.JButton();
        panelVolver = new javax.swing.JPanel();
        labelVolver = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        textFieldId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VistaFormularioEli");
        setUndecorated(true);

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonEliminar.setBackground(new java.awt.Color(181, 2, 2));
        botonEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminar.setText("Eliminar");
        botonEliminar.setToolTipText("Pulse para eliminar el monitor");
        botonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        panelFondo.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        panelVolver.setBackground(new java.awt.Color(255, 255, 255));
        panelVolver.setToolTipText("Pulse para volver a Monitores");
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
            .addGroup(panelVolverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelVolverLayout.setVerticalGroup(
            panelVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVolverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelFondo.add(panelVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        labelId.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelId.setForeground(new java.awt.Color(255, 255, 255));
        labelId.setText("Id");
        panelFondo.add(labelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        textFieldId.setToolTipText("Inserte el id");
        textFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldIdActionPerformed(evt);
            }
        });
        panelFondo.add(textFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 184, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo action performed que recoge el id y llama al método eliminar monitor
     * @param evt 
     */
    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
        String id = textFieldId.getText();
        int idInt = Integer.parseInt(id);
        
        // Validar que los campos no estén vacíos
        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete el campo", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int filasAfectadas = monitoresController.eliminarMonitor(idInt);
        
        if(filasAfectadas > 0)
            JOptionPane.showMessageDialog(null, "Monitor eliminado con éxito");
        else
            JOptionPane.showMessageDialog(null, "No se ha encontrado el monitor");
    }//GEN-LAST:event_botonEliminarActionPerformed

    /**
     * Metodo para volver a la vista monitores
     * @param evt 
     */
    private void panelVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelVolverMouseClicked
        VistaMonitores monitores = new VistaMonitores();
        monitores.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_panelVolverMouseClicked

    private void textFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldIdActionPerformed

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
            java.util.logging.Logger.getLogger(VistaFormularioEli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaFormularioEli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaFormularioEli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaFormularioEli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaFormularioEli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminar;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelVolver;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelVolver;
    private javax.swing.JTextField textFieldId;
    // End of variables declaration//GEN-END:variables
}
