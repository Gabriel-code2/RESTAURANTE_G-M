package MANTENIMIENTOS;


import ARCHIVOS.ArchivoCliente;
import MENÚ_LOGIN.Menu_Principal;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Cliente extends javax.swing.JFrame {

    boolean creear;
    boolean encontrado = false;
    String Santigualinea;

    public Cliente() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cajaId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cajaApellp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cajaApellm = new javax.swing.JTextField();
        estado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cajaTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cajaCorreo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel1.setText("ID Cliente:");

        cajaId.setFont(new java.awt.Font("Liberation Mono", 0, 16)); // NOI18N
        cajaId.setForeground(new java.awt.Color(51, 51, 51));
        cajaId.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        cajaId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaIdActionPerformed(evt);
            }
        });
        cajaId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cajaIdKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel2.setText("Nombre:");

        cajaNombre.setFont(new java.awt.Font("Liberation Mono", 0, 16)); // NOI18N
        cajaNombre.setForeground(new java.awt.Color(51, 51, 51));
        cajaNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel3.setText("Apellido Paterno:");

        cajaApellp.setFont(new java.awt.Font("Liberation Mono", 0, 16)); // NOI18N
        cajaApellp.setForeground(new java.awt.Color(51, 51, 51));
        cajaApellp.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel4.setText("Apellido Materno:");

        cajaApellm.setFont(new java.awt.Font("Liberation Mono", 0, 16)); // NOI18N
        cajaApellm.setForeground(new java.awt.Color(51, 51, 51));
        cajaApellm.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));

        estado.setEditable(false);
        estado.setBackground(new java.awt.Color(51, 204, 255));
        estado.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        estado.setForeground(new java.awt.Color(255, 0, 0));
        estado.setBorder(null);
        estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel5.setText("Telefono:");

        cajaTelefono.setFont(new java.awt.Font("Liberation Mono", 0, 16)); // NOI18N
        cajaTelefono.setForeground(new java.awt.Color(51, 51, 51));
        cajaTelefono.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel6.setText("Correo:");

        cajaCorreo.setFont(new java.awt.Font("Liberation Mono", 0, 14)); // NOI18N
        cajaCorreo.setForeground(new java.awt.Color(51, 51, 51));
        cajaCorreo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));

        btnGuardar.setBackground(new java.awt.Color(102, 255, 102));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/descargar.png"))); // NOI18N
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
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

        btnSalir1.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/x (1).png"))); // NOI18N
        btnSalir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Limpiar");

        jLabel11.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Salir");

        jLabel12.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Guardar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnGuardar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir1)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cajaId, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cajaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaApellm, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaApellp, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(116, 116, 116)
                .addComponent(jLabel11)
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cajaId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cajaApellp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cajaApellm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cajaTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cajaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(29, 29, 29))
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

    private void estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_estadoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        cajaNombre.setText("");
        cajaApellp.setText("");
        cajaApellm.setText("");
        cajaTelefono.setText("");
        cajaCorreo.setText("");
        estado.setText("");
        cajaId.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

 
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if(cajaId.getText().equals("") || cajaApellp.getText().equals("") || cajaApellm.getText().equals("") ||   cajaTelefono.getText().equals("") ||
           cajaCorreo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por Favor Rellene Todos los campos ");
        }else{
            
        String Id = "";
        String nombre = "", apellP = "", apellM = "";
        String telefono = "", correo = "";
        String Snuevalinea = "";

        ArchivoCliente MA = new ArchivoCliente();
        Id = cajaId.getText();
        nombre = cajaNombre.getText();
        apellP = cajaApellp.getText();
        apellM = cajaApellm.getText();
        telefono = cajaTelefono.getText();
        correo = cajaCorreo.getText();

        try {

            if (creear == false) {
                MA.GuardarDatos(Id, nombre, apellP, apellM, telefono, correo);
            } else {
                Snuevalinea = (Id + "; " + nombre + "; " + apellP + "; " + apellM + "; " + telefono + "; " + correo);
                MA.Modificar(Santigualinea, Snuevalinea);
            }

            cajaId.setText("");
            cajaNombre.setText("");
            cajaApellp.setText("");
            cajaApellm.setText("");
            cajaTelefono.setText("");
            cajaCorreo.setText("");
            estado.setText("");

        } catch (IOException el) {

            el.printStackTrace();
        }
          JOptionPane.showMessageDialog(null, "Registro guardado");
         
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cajaIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaIdActionPerformed

    }//GEN-LAST:event_cajaIdActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed

        dispose();
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void cajaIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaIdKeyReleased

        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            int cod;

                cod = Integer.parseInt(cajaId.getText());

                Scanner s;

                try {
                    File f = new File("Clientes.txt");
                    s = new Scanner(f);
                    if (!f.exists()) {

                        f.createNewFile();

                    } else {
                        while (s.hasNextLine() && !encontrado) {
                            String linea = s.nextLine();
                            Scanner sl = new Scanner(linea);
                            sl.useDelimiter("\\s*;\\s*");
                            try {
                                if (cod == Integer.parseInt(sl.next())) {
                                    cajaNombre.setText(sl.next());
                                    cajaApellp.setText(sl.next());
                                    cajaApellm.setText(sl.next());
                                    cajaTelefono.setText(sl.next());
                                    cajaCorreo.setText(sl.next());
                                    encontrado = true;
                                    creear = true;

                                    Santigualinea = cajaId.getText() + "; " + cajaNombre.getText() + "; " + cajaApellp.getText() + "; " + cajaApellm.getText() + "; " + cajaTelefono.getText() + "; " + cajaCorreo.getText();

                                    estado.setText("MODIFICANDO");

                                } else {

                                    cajaNombre.setText("");
                                    cajaApellp.setText("");
                                    cajaApellm.setText("");
                                    cajaTelefono.setText("");
                                    cajaCorreo.setText("");
                                    encontrado = false;
                                    creear = false;
                                    estado.setText("CREANDO");
                                }
                            } catch (Exception el) {
                                el.printStackTrace();
                            }
                        }
                    }
                    s.close();
                } catch (FileNotFoundException el) {
                    JOptionPane.showMessageDialog(null, "Error al leer Arcivo" + el);
                } catch (IOException el) {
                    el.printStackTrace();
                }

        }
        
        
        
    }//GEN-LAST:event_cajaIdKeyReleased

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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JTextField cajaApellm;
    private javax.swing.JTextField cajaApellp;
    private javax.swing.JTextField cajaCorreo;
    private javax.swing.JTextField cajaId;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaTelefono;
    private javax.swing.JTextField estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
