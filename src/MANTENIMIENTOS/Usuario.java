package MANTENIMIENTOS;

import ARCHIVOS.Archivo_Usuario;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class Usuario extends javax.swing.JFrame {

    boolean creear;
    boolean Modificar = false;
    boolean encontrado = false;
    String Santigualinea;
    public int Nivel = 1;

    /**
     * Creates new form Usuario
     */
    public Usuario() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Usuarios");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CajaTextoUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CajaTextoAcceso = new javax.swing.JTextField();
        CajaTextoContrasena = new javax.swing.JPasswordField();
        estado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CajaTextoApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CajaTextoNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CajaTextoCorreo = new javax.swing.JTextField();
        BotonGuardarUsuario = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnSalir1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 22)); // NOI18N
        jLabel1.setText("Usuario:");

        CajaTextoUsuario.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        CajaTextoUsuario.setForeground(new java.awt.Color(51, 51, 51));
        CajaTextoUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        CajaTextoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaTextoUsuarioActionPerformed(evt);
            }
        });
        CajaTextoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CajaTextoUsuarioKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 22)); // NOI18N
        jLabel2.setText("Contraseña:");

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 22)); // NOI18N
        jLabel3.setText("Nombre:");

        CajaTextoAcceso.setEditable(false);
        CajaTextoAcceso.setBackground(new java.awt.Color(255, 255, 255));
        CajaTextoAcceso.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        CajaTextoAcceso.setForeground(new java.awt.Color(51, 51, 51));
        CajaTextoAcceso.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        CajaTextoAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaTextoAccesoActionPerformed(evt);
            }
        });

        CajaTextoContrasena.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        CajaTextoContrasena.setForeground(new java.awt.Color(51, 51, 51));
        CajaTextoContrasena.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        CajaTextoContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaTextoContrasenaActionPerformed(evt);
            }
        });
        CajaTextoContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CajaTextoContrasenaKeyReleased(evt);
            }
        });

        estado.setEditable(false);
        estado.setBackground(new java.awt.Color(51, 204, 255));
        estado.setFont(new java.awt.Font("Liberation Mono", 1, 20)); // NOI18N
        estado.setForeground(new java.awt.Color(255, 0, 0));
        estado.setBorder(null);
        estado.setCaretColor(new java.awt.Color(153, 255, 153));
        estado.setDisabledTextColor(new java.awt.Color(153, 255, 153));

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 22)); // NOI18N
        jLabel4.setText("Acceso:");

        CajaTextoApellido.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        CajaTextoApellido.setForeground(new java.awt.Color(51, 51, 51));
        CajaTextoApellido.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 22)); // NOI18N
        jLabel5.setText("Apellido:");

        CajaTextoNombre.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        CajaTextoNombre.setForeground(new java.awt.Color(51, 51, 51));
        CajaTextoNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        CajaTextoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaTextoNombreActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 22)); // NOI18N
        jLabel6.setText("Correo:");

        CajaTextoCorreo.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        CajaTextoCorreo.setForeground(new java.awt.Color(51, 51, 51));
        CajaTextoCorreo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));

        BotonGuardarUsuario.setBackground(new java.awt.Color(102, 255, 102));
        BotonGuardarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/descargar.png"))); // NOI18N
        BotonGuardarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonGuardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarUsuarioActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/eliminar.png"))); // NOI18N
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Salir");

        btnSalir1.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/x (1).png"))); // NOI18N
        btnSalir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Eliminar");

        jLabel13.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Guardar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(BotonGuardarUsuario))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel13))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CajaTextoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnLimpiar)
                                        .addGap(25, 25, 25))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel12))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CajaTextoAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CajaTextoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CajaTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CajaTextoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CajaTextoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(98, 98, 98))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CajaTextoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CajaTextoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CajaTextoAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CajaTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CajaTextoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CajaTextoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                        .addComponent(BotonGuardarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CajaTextoContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaTextoContrasenaActionPerformed


    }//GEN-LAST:event_CajaTextoContrasenaActionPerformed

    private void CajaTextoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaTextoUsuarioActionPerformed
    
    }//GEN-LAST:event_CajaTextoUsuarioActionPerformed


    private void BotonGuardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarUsuarioActionPerformed

        if (CajaTextoUsuario.getText().equals("") || CajaTextoContrasena.getText().equals("") || CajaTextoNombre.getText().equals("") || CajaTextoApellido.getText().equals("")
                || CajaTextoCorreo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por Favor Rellene Todos los campos ");
        } else {

            String usu = "";
            String correo = "", contr = "", nombre = "";
            String apell = "";
            String Snuevalinea = "";
            int NV;

            Archivo_Usuario archivo = new Archivo_Usuario();

            usu = CajaTextoUsuario.getText();
            correo = CajaTextoCorreo.getText();
            contr = CajaTextoContrasena.getText();
            nombre = CajaTextoNombre.getText();
            apell = CajaTextoApellido.getText();

            try {

                if (creear == false) {
                    
                    archivo.GuardarDatos(usu, contr, Nivel, nombre, apell,correo);

                } else {
                    Snuevalinea = (usu + " ; " + contr + " ; " + Nivel + " ; " + nombre + " ; " + apell + " ; " + correo);
                    archivo.Modificar(Santigualinea, Snuevalinea);
                }

                CajaTextoCorreo.setText("");
                CajaTextoUsuario.setText("");
                CajaTextoContrasena.setText("");
                CajaTextoNombre.setText("");
                CajaTextoApellido.setText("");
                CajaTextoAcceso.setText("");
                estado.setText("");

            } catch (IOException el) {
                el.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "Registro guardado");

        }


    }//GEN-LAST:event_BotonGuardarUsuarioActionPerformed

    private void CajaTextoAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaTextoAccesoActionPerformed
        Nivel = 1;
    }//GEN-LAST:event_CajaTextoAccesoActionPerformed

    private void CajaTextoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaTextoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaTextoNombreActionPerformed

    private void CajaTextoUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CajaTextoUsuarioKeyReleased

    }//GEN-LAST:event_CajaTextoUsuarioKeyReleased

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        CajaTextoUsuario.setText("");
        CajaTextoAcceso.setText("");
        CajaTextoContrasena.setText("");
        CajaTextoNombre.setText("");
        CajaTextoApellido.setText("");
        CajaTextoCorreo.setText("");
        estado.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void CajaTextoContrasenaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CajaTextoContrasenaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String usuario = CajaTextoUsuario.getText();
            String contraseña = new String(CajaTextoContrasena.getPassword());
            Scanner s;
            String nv = "";
            boolean encontrado = false;

            try {
                File f = new File("Usuarios.txt");

                if (!f.exists()) {
                    f.createNewFile();
                } else {
                    s = new Scanner(f);

                    while (s.hasNextLine() && !encontrado) {
                        String linea = s.nextLine();
                        Scanner s1 = new Scanner(linea);

                        s1.useDelimiter("\\s*;\\s*");

                        try {
                            String auxlogin = s1.next();
                            String auxPass = s1.next();
                            if (usuario.equals(auxlogin) && contraseña.equals(auxPass)) {
                                Nivel = Integer.parseInt(s1.next());

                                if (Nivel == 0) {
                                    nv = "0";
                                } else {
                                    nv = "1";

                                }

                                CajaTextoAcceso.setText(nv);
                                CajaTextoNombre.setText(s1.next());
                                CajaTextoApellido.setText(s1.next());
                                CajaTextoCorreo.setText(s1.next());
                                encontrado = true;
                                creear = true;

                                Santigualinea = CajaTextoUsuario.getText() + ";" + CajaTextoContrasena.getText() + ";" + Nivel + ";" + CajaTextoNombre.getText() + ";" + CajaTextoApellido.getText() + ";" + CajaTextoCorreo.getText();
                                estado.setText("Modificando");

                            } else {

                                CajaTextoNombre.setText("");
                                CajaTextoApellido.setText("");
                                CajaTextoCorreo.setText("");
                                CajaTextoAcceso.setText("1");

                                encontrado = false;
                                creear = false;
                                estado.setText("CREANDO");

                            }

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(this, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    s.close();
                }

            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(this, "No se encontra el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                System.out.println("Error: " + ex);
            }
        }
    }//GEN-LAST:event_CajaTextoContrasenaKeyReleased

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalir1ActionPerformed

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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGuardarUsuario;
    private javax.swing.JTextField CajaTextoAcceso;
    private javax.swing.JTextField CajaTextoApellido;
    private javax.swing.JPasswordField CajaTextoContrasena;
    private javax.swing.JTextField CajaTextoCorreo;
    private javax.swing.JTextField CajaTextoNombre;
    private javax.swing.JTextField CajaTextoUsuario;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JTextField estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
