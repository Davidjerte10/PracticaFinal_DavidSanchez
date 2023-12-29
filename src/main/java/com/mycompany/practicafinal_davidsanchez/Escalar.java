/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinal_davidsanchez;

/**
 *
 * @author Alumno
 */

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Escalar {
   
    public void escalarLabel(JLabel label, String rutaImagen) {
        label.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(rutaImagen))
        .getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT)));
    }
}
