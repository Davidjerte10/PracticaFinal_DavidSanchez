/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JOptionPane;

/**
 *
 * @author David Sanchez Avila
 */
public class VistaPlan extends javax.swing.JFrame {
   
    /**
     * Creates new form VistaPrincipal
     */
    public VistaPlan() {
        initComponents();
        FlatLightLaf.setup();
        
        //Redondeos
        botonCalcular.putClientProperty( "FlatLaf.style", "arc: 25" );
        panelVolver.putClientProperty("FlatLaf.style", "arc:50");
        textFieldAltura.putClientProperty("FlatLaf.style", "arc: 20");
        textFieldPeso.putClientProperty("FlatLaf.style", "arc: 20");
        textFieldResultado.putClientProperty("FlatLaf.style", "arc: 15");
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
        panelLateral = new javax.swing.JPanel();
        labelFotoPerfil = new javax.swing.JLabel();
        botonPrincipal = new javax.swing.JButton();
        botonActividades = new javax.swing.JButton();
        botonMonitores = new javax.swing.JButton();
        botonPlan = new javax.swing.JButton();
        panelVolver = new javax.swing.JPanel();
        labelVolver = new javax.swing.JLabel();
        labelBarraLateral = new javax.swing.JLabel();
        labelImagen = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        panelFrame = new controlador.PanelRound();
        textFieldAltura = new javax.swing.JTextField();
        textFieldPeso = new javax.swing.JTextField();
        labelPeso = new javax.swing.JLabel();
        labelAltura = new javax.swing.JLabel();
        botonCalcular = new javax.swing.JButton();
        textFieldResultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VistaPrincipal");
        setMinimumSize(new java.awt.Dimension(900, 650));
        setUndecorated(true);
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));

        panelLateral.setBackground(new java.awt.Color(47, 47, 47));
        panelLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelFotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PersonCircle.png"))); // NOI18N
        panelLateral.add(labelFotoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 54, -1, -1));

        botonPrincipal.setBackground(new java.awt.Color(47, 47, 47));
        botonPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        botonPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconPrincipal.png"))); // NOI18N
        botonPrincipal.setText("Principal");
        botonPrincipal.setToolTipText("Pulse para ir a principal");
        botonPrincipal.setBorderPainted(false);
        botonPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonPrincipal.setIconTextGap(30);
        botonPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPrincipalActionPerformed(evt);
            }
        });
        panelLateral.add(botonPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 137, -1));

        botonActividades.setBackground(new java.awt.Color(47, 47, 47));
        botonActividades.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonActividades.setForeground(new java.awt.Color(255, 255, 255));
        botonActividades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconActividades.png"))); // NOI18N
        botonActividades.setText("Actividades");
        botonActividades.setToolTipText("Pulse para ir a actividades");
        botonActividades.setBorderPainted(false);
        botonActividades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonActividades.setIconTextGap(15);
        botonActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActividadesActionPerformed(evt);
            }
        });
        panelLateral.add(botonActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 137, -1));

        botonMonitores.setBackground(new java.awt.Color(47, 47, 47));
        botonMonitores.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonMonitores.setForeground(new java.awt.Color(255, 255, 255));
        botonMonitores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconMonitores.png"))); // NOI18N
        botonMonitores.setText("Monitores");
        botonMonitores.setToolTipText("Pulse para ir a monitores");
        botonMonitores.setBorderPainted(false);
        botonMonitores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMonitores.setIconTextGap(22);
        botonMonitores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMonitoresActionPerformed(evt);
            }
        });
        panelLateral.add(botonMonitores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 137, -1));

        botonPlan.setBackground(new java.awt.Color(47, 47, 47));
        botonPlan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonPlan.setForeground(new java.awt.Color(255, 255, 255));
        botonPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconPlan.png"))); // NOI18N
        botonPlan.setText("Plan");
        botonPlan.setToolTipText("Pulse para ir a plan");
        botonPlan.setBorderPainted(false);
        botonPlan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonPlan.setIconTextGap(53);
        botonPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPlanActionPerformed(evt);
            }
        });
        panelLateral.add(botonPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 137, -1));

        panelVolver.setBackground(new java.awt.Color(255, 255, 255));
        panelVolver.setToolTipText("Pulse para cerrar sesión");
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

        panelLateral.add(panelVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, -1, -1));

        labelBarraLateral.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelBarraLateral.setForeground(new java.awt.Color(255, 255, 255));
        labelBarraLateral.setText("ADMINISTRADOR");
        panelLateral.add(labelBarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        labelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconSmall.png"))); // NOI18N

        labelTitulo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(181, 2, 2));
        labelTitulo.setText("DAVID GYM");

        panelFrame.setBackground(new java.awt.Color(47, 47, 47));
        panelFrame.setMaximumSize(new java.awt.Dimension(576, 436));
        panelFrame.setMinimumSize(new java.awt.Dimension(576, 436));
        panelFrame.setRoundBottomLeft(20);
        panelFrame.setRoundBottomRight(20);
        panelFrame.setRoundTopLeft(20);
        panelFrame.setRoundTopRight(20);

        textFieldAltura.setToolTipText("Inserte su altura en metros");

        textFieldPeso.setToolTipText("Inserte su peso en kilogramos");

        labelPeso.setForeground(new java.awt.Color(255, 255, 255));
        labelPeso.setText("Inserte el peso en kg");

        labelAltura.setForeground(new java.awt.Color(255, 255, 255));
        labelAltura.setText("Inserte la altura en m");

        botonCalcular.setBackground(new java.awt.Color(181, 2, 2));
        botonCalcular.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        botonCalcular.setForeground(new java.awt.Color(255, 255, 255));
        botonCalcular.setText("Calcular");
        botonCalcular.setToolTipText("Pulse para calcular su imc");
        botonCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });

        textFieldResultado.setEditable(false);
        textFieldResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldResultado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelFrameLayout = new javax.swing.GroupLayout(panelFrame);
        panelFrame.setLayout(panelFrameLayout);
        panelFrameLayout.setHorizontalGroup(
            panelFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFrameLayout.createSequentialGroup()
                .addGroup(panelFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFrameLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addGroup(panelFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAltura)
                            .addComponent(textFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPeso)
                            .addComponent(textFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelFrameLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(textFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        panelFrameLayout.setVerticalGroup(
            panelFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFrameLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(labelPeso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelAltura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(botonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(textFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(panelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelImagen)
                        .addGap(18, 18, 18)
                        .addComponent(labelTitulo))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(panelFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(labelImagen))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(labelTitulo)))
                .addGap(18, 18, 18)
                .addComponent(panelFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelLateral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
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

    /**
     * Metodo para mostrar la vista monitores
     * @param evt 
     */
    private void botonMonitoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMonitoresActionPerformed
        // TODO add your handling code here:ç
        VistaMonitores vistaMonitores = new VistaMonitores();
        vistaMonitores.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonMonitoresActionPerformed

    private void botonPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPlanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonPlanActionPerformed
    
    /**
     * Metodo para mostrar la vista actividades
     * @param evt 
     */
    private void botonActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActividadesActionPerformed
        // TODO add your handling code here:
        VistaActividades vistaActividades = new VistaActividades();
        vistaActividades.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonActividadesActionPerformed

    /**
     * Metodo para mostrar la vista principal
     * @param evt 
     */
    private void botonPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPrincipalActionPerformed
        // TODO add your handling code here:
        VistaPrincipal vistaPrincipal = new VistaPrincipal();
        vistaPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonPrincipalActionPerformed

    /**
     * Metodo para cerrar sesion y volver al login
     * @param evt 
     */
    private void panelVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelVolverMouseClicked
        JOptionPane.showMessageDialog(null, "Cerrando sesión");
        Login login = new Login();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_panelVolverMouseClicked

    /**
     * Metodo que calcula el imc y lo muestra al usuario
     * @param evt 
     */
    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed

        double peso = Double.parseDouble(textFieldPeso.getText());
        double altura = Double.parseDouble(textFieldAltura.getText());

        double imc = peso / (altura * altura);

        textFieldResultado.setText(String.format("IMC: %.2f", imc));

        if (imc < 18.5) {
            textFieldResultado.setText(textFieldResultado.getText() + "\nNecesita aumentar peso.");
        } else if (imc >= 18.5 && imc < 24.9) {
            textFieldResultado.setText(textFieldResultado.getText() + "\nPeso saludable.");
        } else {
            textFieldResultado.setText(textFieldResultado.getText() + "\nNecesita reducir peso.");
        }
    }//GEN-LAST:event_botonCalcularActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActividades;
    private javax.swing.JButton botonCalcular;
    private javax.swing.JButton botonMonitores;
    private javax.swing.JButton botonPlan;
    private javax.swing.JButton botonPrincipal;
    private javax.swing.JLabel labelAltura;
    private javax.swing.JLabel labelBarraLateral;
    private javax.swing.JLabel labelFotoPerfil;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JLabel labelPeso;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelVolver;
    private javax.swing.JPanel panelFondo;
    private controlador.PanelRound panelFrame;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JPanel panelVolver;
    private javax.swing.JTextField textFieldAltura;
    private javax.swing.JTextField textFieldPeso;
    private javax.swing.JTextField textFieldResultado;
    // End of variables declaration//GEN-END:variables
}
