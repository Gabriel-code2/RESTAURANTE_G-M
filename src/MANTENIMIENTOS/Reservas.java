package MANTENIMIENTOS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ARCHIVOS.ArchivoReserva;
import MANTENIMIENTOS.Cliente;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Reservas extends javax.swing.JFrame {

    boolean creear;
    boolean encontrado = false;
    boolean encontradoM = false;

    String Santigualinea;

    public Reservas() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Reservas");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        IDReserva = new javax.swing.JTextField();
        cajaFecha = new javax.swing.JTextField();
        cajaIdCliente = new javax.swing.JTextField();
        cajaIdMesa = new javax.swing.JTextField();
        cajaFechaReserva = new javax.swing.JTextField();
        cajaHora = new javax.swing.JTextField();
        NO = new javax.swing.JRadioButton();
        Si = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        estado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Fecha:");

        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("ID Cliente Reserva:");

        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("ID Mesa Reserva:");

        jLabel5.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Disponible:");

        jLabel6.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Fecha baja Reserva:");

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("ID Reserva:");

        jLabel7.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Hora:");

        IDReserva.setFont(new java.awt.Font("Liberation Mono", 0, 16)); // NOI18N
        IDReserva.setForeground(new java.awt.Color(102, 102, 102));
        IDReserva.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        IDReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDReservaActionPerformed(evt);
            }
        });

        cajaFecha.setFont(new java.awt.Font("Liberation Mono", 0, 16)); // NOI18N
        cajaFecha.setForeground(new java.awt.Color(102, 102, 102));
        cajaFecha.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));

        cajaIdCliente.setFont(new java.awt.Font("Liberation Mono", 0, 16)); // NOI18N
        cajaIdCliente.setForeground(new java.awt.Color(102, 102, 102));
        cajaIdCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        cajaIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaIdClienteActionPerformed(evt);
            }
        });

        cajaIdMesa.setFont(new java.awt.Font("Liberation Mono", 0, 16)); // NOI18N
        cajaIdMesa.setForeground(new java.awt.Color(102, 102, 102));
        cajaIdMesa.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        cajaIdMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaIdMesaActionPerformed(evt);
            }
        });
        cajaIdMesa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cajaIdMesaKeyReleased(evt);
            }
        });

        cajaFechaReserva.setFont(new java.awt.Font("Liberation Mono", 0, 16)); // NOI18N
        cajaFechaReserva.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));

        cajaHora.setFont(new java.awt.Font("Liberation Mono", 0, 16)); // NOI18N
        cajaHora.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));

        NO.setBackground(new java.awt.Color(51, 204, 255));
        botones.add(NO);
        NO.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        NO.setText("NO");
        NO.setEnabled(false);

        Si.setBackground(new java.awt.Color(51, 204, 255));
        botones.add(Si);
        Si.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        Si.setText("Si");
        Si.setEnabled(false);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/x (1).png"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 255, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/descargar.png"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        estado.setEditable(false);
        estado.setBackground(new java.awt.Color(51, 204, 255));
        estado.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        estado.setForeground(new java.awt.Color(255, 0, 0));
        estado.setBorder(null);

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabel8.setText("Salir");

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabel9.setText("Guardar");

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabel10.setText("Limpiar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(cajaFechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cajaIdMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cajaIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Si)
                                        .addGap(18, 18, 18)
                                        .addComponent(NO))
                                    .addComponent(cajaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(cajaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(173, 173, 173))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(IDReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(74, 74, 74))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(45, 45, 45))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(IDReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cajaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cajaIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cajaIdMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Si)
                    .addComponent(NO))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cajaFechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cajaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 4, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(64, 64, 64))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDReservaActionPerformed
        if (evt.getSource() == IDReserva) {
            int cod;
            boolean encontrado = false;

            cod = Integer.parseInt(IDReserva.getText());
            String ST = "Disponible";
            Scanner s;

            try {
                File f = new File("Reservas.txt");
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
                                cajaFecha.setText(sl.next());
                                cajaIdCliente.setText(sl.next());
                                cajaIdMesa.setText(sl.next());
                                cajaFechaReserva.setText(sl.next());
                                cajaHora.setText(sl.next());

                                if (ST.equals(sl.next())) {
                                    Si.setSelected(true);
                                } else {
                                    NO.setSelected(true);
                                }

                                encontrado = true;
                                creear = true;

                                Santigualinea = IDReserva.getText() + " ; " + cajaFecha.getText() + " ; " + cajaIdCliente.getText() + " ; " + cajaIdMesa.getText() + " ; " + cajaFechaReserva.getText() + " ; " + cajaHora.getText();

                                estado.setText("MODIFICANDO");

                            } else {

                                cajaFecha.setText("");
                                cajaIdCliente.setText("");
                                cajaIdMesa.setText("");
                                cajaFecha.setText("");
                                cajaFechaReserva.setText("");
                                cajaHora.setText("");

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
    }//GEN-LAST:event_IDReservaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        IDReserva.setText("");
        cajaFecha.setText("");
        cajaIdCliente.setText("");
        cajaIdMesa.setText("");
        cajaFechaReserva.setText("");
        cajaHora.setText("");
        estado.setText("");
        botones.clearSelection();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (IDReserva.getText().equals("") || cajaFecha.getText().equals("") || cajaIdCliente.getText().equals("") || cajaIdMesa.getText().equals("") || cajaFechaReserva.getText().equals("") || cajaHora.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por Favor Rellene Todos los campos ");

        } else {

            String Id = "";
            String fecha = "", Idcliente = "", Idmesa = "";
            String fechaR = "", hora = "";
            String Snuevalinea = "";

            ArchivoReserva archivo = new ArchivoReserva();

            Si.setSelected(true);
            Id = IDReserva.getText();
            fecha = cajaFecha.getText();
            Idcliente = cajaIdCliente.getText();
            Idmesa = cajaIdMesa.getText();
            fechaR = cajaFechaReserva.getText();
            hora = cajaHora.getText();

            String auxDisponible = "";

            if (Si.isSelected()) {
                auxDisponible = "Disponible";
            } else {
                auxDisponible = " NO Disponible";
            }

            try {

                if (creear == false) {
                    archivo.GuardarDatos(Id, auxDisponible, Idcliente, Idmesa, fechaR, hora, fecha);
                } else {
                    Snuevalinea = (Id + " ; " + auxDisponible + " ; " + Idcliente + " ; " + Idmesa + " ; " + fechaR + " ; " + hora + " ; " + fecha);
                    archivo.Modificar(Santigualinea, Snuevalinea);
                }

                IDReserva.setText("");
                cajaFecha.setText("");
                cajaIdCliente.setText("");
                cajaIdMesa.setText("");
                cajaFechaReserva.setText("");
                cajaHora.setText("");
                estado.setText("");

            } catch (IOException el) {
                el.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "Registro guardado");

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cajaIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaIdClienteActionPerformed
        if (evt.getSource() == cajaIdCliente) {
            String auxid = cajaIdCliente.getText();
            String nombreTipo = "";

            boolean encontrado = false;
            try {
                int Id_Tipo = Integer.parseInt(auxid);
                try {
                    File f = new File("Clientes.txt");
                    Scanner s = new Scanner(f);
                    if (f.exists()) {

                        while (s.hasNextLine() && !encontrado) {
                            String linea = s.nextLine();
                            Scanner s1 = new Scanner(linea);
                            s1.useDelimiter("\\s*;\\s*");

                            if (Id_Tipo == Integer.parseInt(s1.next())) {
                                encontrado = true;
                                nombreTipo = s1.next();
                            }

                        }
                        s.close();

                        if (!encontrado) {
                            JOptionPane.showMessageDialog(rootPane, "El cliente NO Existe");
                            JOptionPane.showMessageDialog(rootPane, "Por Favor creelo como nuevo");

                            Cliente C = new Cliente();
                            C.setVisible(true);
                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "El Nombre del cliente es: " + nombreTipo);
                        }

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "El clinete no Existe");
                    }
                } catch (IOException e) {
                    System.out.println("No se pudo leer el archivo correctamente\n" + e);
                }

            } catch (Exception ex) {
                cajaIdCliente.setText("");
                JOptionPane.showMessageDialog(rootPane, "No se permiten carÃ¡cteres en el Id");
            }
        }
    }//GEN-LAST:event_cajaIdClienteActionPerformed

    private void cajaIdMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaIdMesaActionPerformed
        if (evt.getSource() == cajaIdMesa) {
            String auxid = cajaIdMesa.getText();
            String nombreTipo = "";

            boolean encontrado = false;
            String status = "NO";
            String comersales = "";

            try {
                int Id_Tipo = Integer.parseInt(auxid);
                try {
                    File f = new File("Mesa.txt");
                    Scanner s = new Scanner(f);
                    if (f.exists()) {

                        while (s.hasNextLine() && !encontrado) {
                            String linea = s.nextLine();
                            Scanner s1 = new Scanner(linea);
                            s1.useDelimiter("\\s*;\\s*");

                            if (Id_Tipo == Integer.parseInt(s1.next())) {
                                encontrado = true;

                                if (status.equals(s1.next())) {

                                    JOptionPane.showMessageDialog(rootPane, "La Mesa esta Disponible");

                                }
                            }

                        }
                        s.close();

                        if (!encontrado) {
                            JOptionPane.showMessageDialog(rootPane, "LA MESA NO EXISTE");

                        }

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "La mesa no existe");

                    }
                } catch (IOException e) {
                    System.out.println("No se pudo leer el archivo correctamente\n" + e);
                }

            } catch (Exception ex) {
                cajaIdMesa.setText("");
                JOptionPane.showMessageDialog(rootPane, "No se permiten carÃ¡cteres en el Id");
            }
        }
    }//GEN-LAST:event_cajaIdMesaActionPerformed

    private void cajaIdMesaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaIdMesaKeyReleased

    }//GEN-LAST:event_cajaIdMesaKeyReleased

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
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDReserva;
    private javax.swing.JRadioButton NO;
    private javax.swing.JRadioButton Si;
    private javax.swing.ButtonGroup botones;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField cajaFecha;
    private javax.swing.JTextField cajaFechaReserva;
    private javax.swing.JTextField cajaHora;
    private javax.swing.JTextField cajaIdCliente;
    private javax.swing.JTextField cajaIdMesa;
    private javax.swing.JTextField estado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
