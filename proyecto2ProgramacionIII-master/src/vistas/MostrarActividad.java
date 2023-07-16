/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import modelos.*;
import vistas.componentes.HeaderCita;

/**
 *
 * @author yorman
 */
public class MostrarActividad extends javax.swing.JPanel {

    private int tipo;
    private BaseDeDatos database;

    /**
     * Creates new form MostrarActividad
     */
    public MostrarActividad(VentanaPrincipal ventana, int tipo) {
        initComponents();

        this.database = ventana.getDatabase();

        Calendar calendario = new GregorianCalendar();

        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int semana = dia / 7 + 1;
        int mes = calendario.get(Calendar.MONTH);
        int año = calendario.get(Calendar.YEAR);

        this.tipo = -1;

        this.dia.setSelectedIndex(dia - 1);
        this.semana.setSelectedIndex(semana - 1);
        this.mes.setSelectedIndex(mes);
        this.año.setSelectedIndex(año - 2023);

        this.tipo = tipo;

        switch (tipo) {
            case 0: {
                this.semana.setVisible(false);
                this.tituloSemana.setVisible(false);
                this.ingresos.setText("Actividad (Dia)");
                this.container.add(new HeaderCita());
                ArrayList<Cita> citas = this.database.getCitas();
                for (Cita cita : citas) {
                    if (Integer.parseInt(cita.getFecha().split("-")[2]) == dia
                            && Integer.parseInt(cita.getFecha().split("-")[1]) == mes
                            && Integer.parseInt(cita.getFecha().split("-")[0]) == año) {
                        HeaderCita ingreso = new HeaderCita(cita);

                        this.container.add(ingreso);
                    }
                }
                break;
            }
            case 1: {
                this.tituloDia.setVisible(false);
                this.dia.setVisible(false);
                this.ingresos.setText("Actividad (Semana)");
                this.container.add(new HeaderCita());
                ArrayList<Cita> citas = this.database.getCitas();
                for (Cita cita : citas) {
                    if ((Integer.parseInt(cita.getFecha().split("-")[2]) / 7 + 1) == semana
                            && Integer.parseInt(cita.getFecha().split("-")[1]) == mes
                            && Integer.parseInt(cita.getFecha().split("-")[0]) == año) {
                        HeaderCita ingreso = new HeaderCita(
                                cita);

                        this.container.add(ingreso);
                    }

                }
                break;
            }
            case 2: {
                this.tituloDia.setVisible(false);
                this.dia.setVisible(false);
                this.semana.setVisible(false);
                this.tituloSemana.setVisible(false);
                this.ingresos.setText("Actividad (Mes)");
                this.container.add(new HeaderCita());
                ArrayList<Cita> citas = this.database.getCitas();
                for (Cita cita : citas) {
                    if (Integer.parseInt(cita.getFecha().split("-")[1]) == mes
                            && Integer.parseInt(cita.getFecha().split("-")[0]) == año) {
                        HeaderCita ingreso = new HeaderCita(cita);

                        this.container.add(ingreso);
                    }

                }
                break;
            }
            default:
                break;
        }
        this.container.repaint();
        this.container.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        container = new javax.swing.JPanel();
        ingresos = new javax.swing.JLabel();
        tituloAño = new javax.swing.JLabel();
        año = new javax.swing.JComboBox<>();
        tituloMes = new javax.swing.JLabel();
        mes = new javax.swing.JComboBox<>();
        tituloDia = new javax.swing.JLabel();
        dia = new javax.swing.JComboBox<>();
        tituloSemana = new javax.swing.JLabel();
        semana = new javax.swing.JComboBox<>();

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        container.setBackground(new java.awt.Color(204, 239, 255));
        container.setLayout(new javax.swing.BoxLayout(container, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane4.setViewportView(container);

        ingresos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ingresos.setText("Actividad");

        tituloAño.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tituloAño.setText("Año");

        año.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2022", "2021", "2020" }));
        año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añoActionPerformed(evt);
            }
        });

        tituloMes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tituloMes.setText("Mes");

        mes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesActionPerformed(evt);
            }
        });

        tituloDia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tituloDia.setText("Dia");

        dia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaActionPerformed(evt);
            }
        });

        tituloSemana.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tituloSemana.setText("Semana");

        semana.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        semana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        semana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semanaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(ingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloAño, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloMes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloDia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(ingresos))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloAño)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloMes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloDia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloSemana)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(semana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void añoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añoActionPerformed
        // TODO add your handling code here:

        this.container.removeAll();

        int dia = Integer.parseInt(this.dia.getItemAt(this.dia.getSelectedIndex()));
        int semana = Integer.parseInt(this.semana.getItemAt(this.semana.getSelectedIndex()));
        int mes = Integer.parseInt(this.mes.getItemAt(this.mes.getSelectedIndex()));
        int año = Integer.parseInt(this.año.getItemAt(this.año.getSelectedIndex()));

        switch (tipo) {
            case 0: {
                this.semana.setVisible(false);
                this.tituloSemana.setVisible(false);
                this.ingresos.setText("Actividad (Dia)");
                this.container.add(new HeaderCita());
                ArrayList<Cita> citas = this.database.getCitas();
                for (Cita cita : citas) {
                    if (Integer.parseInt(cita.getFecha().split("-")[2]) == dia
                            && Integer.parseInt(cita.getFecha().split("-")[1]) == mes
                            && Integer.parseInt(cita.getFecha().split("-")[0]) == año) {
                        HeaderCita ingreso = new HeaderCita(cita);

                        this.container.add(ingreso);
                    }
                }
                break;
            }
            case 1: {
                this.tituloDia.setVisible(false);
                this.dia.setVisible(false);
                this.ingresos.setText("Actividad (Semana)");
                this.container.add(new HeaderCita());
                ArrayList<Cita> citas = this.database.getCitas();
                for (Cita cita : citas) {
                    if ((Integer.parseInt(cita.getFecha().split("-")[2]) / 7 + 1) == semana
                            && Integer.parseInt(cita.getFecha().split("-")[1]) == mes
                            && Integer.parseInt(cita.getFecha().split("-")[0]) == año) {
                        HeaderCita ingreso = new HeaderCita(
                                cita);

                        this.container.add(ingreso);
                    }

                }
                break;
            }
            case 2: {
                this.tituloDia.setVisible(false);
                this.dia.setVisible(false);
                this.semana.setVisible(false);
                this.tituloSemana.setVisible(false);
                this.ingresos.setText("Actividad (Mes)");
                this.container.add(new HeaderCita());
                ArrayList<Cita> citas = this.database.getCitas();
                for (Cita cita : citas) {
                    if (Integer.parseInt(cita.getFecha().split("-")[1]) == mes
                            && Integer.parseInt(cita.getFecha().split("-")[0]) == año) {
                        HeaderCita ingreso = new HeaderCita(cita);

                        this.container.add(ingreso);
                    }

                }
                break;
            }
            default:
                break;
        }
        this.container.repaint();
        this.container.revalidate();
    }//GEN-LAST:event_añoActionPerformed

    private void mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesActionPerformed
        this.container.removeAll();

        int dia = Integer.parseInt(this.dia.getItemAt(this.dia.getSelectedIndex()));
        int semana = Integer.parseInt(this.semana.getItemAt(this.semana.getSelectedIndex()));
        int mes = Integer.parseInt(this.mes.getItemAt(this.mes.getSelectedIndex()));
        int año = Integer.parseInt(this.año.getItemAt(this.año.getSelectedIndex()));

        if (tipo == 0) {
            this.semana.setVisible(false);
            this.tituloSemana.setVisible(false);

            this.ingresos.setText("Actividad (Dia)");

            this.container.add(new HeaderCita());

            ArrayList<Cita> citas = this.database.getCitas();

            for (Cita cita : citas) {
                if (Integer.parseInt(cita.getFecha().split("-")[2]) == dia
                        && Integer.parseInt(cita.getFecha().split("-")[1]) == mes
                        && Integer.parseInt(cita.getFecha().split("-")[0]) == año) {
                    HeaderCita ingreso = new HeaderCita(
                            cita);

                    this.container.add(ingreso);
                }
            }
        } else if (tipo == 1) {

            this.tituloDia.setVisible(false);
            this.dia.setVisible(false);
            this.ingresos.setText("Actividad (Semana)");

            this.container.add(new HeaderCita());

            ArrayList<Cita> citas = this.database.getCitas();

            for (Cita cita : citas) {
                if ((Integer.parseInt(cita.getFecha().split("-")[2]) / 7 + 1) == semana
                        && Integer.parseInt(cita.getFecha().split("-")[1]) == mes
                        && Integer.parseInt(cita.getFecha().split("-")[0]) == año) {
                    HeaderCita ingreso = new HeaderCita(
                            cita);

                    this.container.add(ingreso);
                }

            }
        } else if (tipo == 2) {

            this.tituloDia.setVisible(false);
            this.dia.setVisible(false);

            this.semana.setVisible(false);
            this.tituloSemana.setVisible(false);

            this.ingresos.setText("Actividad (Mes)");

            this.container.add(new HeaderCita());

            ArrayList<Cita> citas = this.database.getCitas();

            for (Cita cita : citas) {
                if (Integer.parseInt(cita.getFecha().split("-")[1]) == mes
                        && Integer.parseInt(cita.getFecha().split("-")[0]) == año) {
                    HeaderCita ingreso = new HeaderCita(
                            cita);

                    this.container.add(ingreso);
                }

            }
        }
        this.container.repaint();
        this.container.revalidate();
    }//GEN-LAST:event_mesActionPerformed

    private void diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaActionPerformed
        this.container.removeAll();

        int dia = Integer.parseInt(this.dia.getItemAt(this.dia.getSelectedIndex()));
        int semana = Integer.parseInt(this.semana.getItemAt(this.semana.getSelectedIndex()));
        int mes = Integer.parseInt(this.mes.getItemAt(this.mes.getSelectedIndex()));
        int año = Integer.parseInt(this.año.getItemAt(this.año.getSelectedIndex()));

        switch (tipo) {
            case 0: {
                this.semana.setVisible(false);
                this.tituloSemana.setVisible(false);
                this.ingresos.setText("Actividad (Dia)");
                this.container.add(new HeaderCita());
                ArrayList<Cita> citas = this.database.getCitas();
                for (Cita cita : citas) {
                    if (Integer.parseInt(cita.getFecha().split("-")[2]) == dia
                            && Integer.parseInt(cita.getFecha().split("-")[1]) == mes
                            && Integer.parseInt(cita.getFecha().split("-")[0]) == año) {
                        HeaderCita ingreso = new HeaderCita(
                                cita);

                        this.container.add(ingreso);
                    }
                }
                break;
            }
            case 1: {
                this.tituloDia.setVisible(false);
                this.dia.setVisible(false);
                this.ingresos.setText("Actividad (Semana)");
                this.container.add(new HeaderCita());
                ArrayList<Cita> citas = this.database.getCitas();
                for (Cita cita : citas) {
                    if ((Integer.parseInt(cita.getFecha().split("-")[2]) / 7 + 1) == semana
                            && Integer.parseInt(cita.getFecha().split("-")[1]) == mes
                            && Integer.parseInt(cita.getFecha().split("-")[0]) == año) {
                        HeaderCita ingreso = new HeaderCita(
                                cita);

                        this.container.add(ingreso);
                    }

                }
                break;
            }
            case 2: {
                this.tituloDia.setVisible(false);
                this.dia.setVisible(false);
                this.semana.setVisible(false);
                this.tituloSemana.setVisible(false);
                this.ingresos.setText("Actividad (Mes)");
                this.container.add(new HeaderCita());
                ArrayList<Cita> citas = this.database.getCitas();
                for (Cita cita : citas) {
                    if (Integer.parseInt(cita.getFecha().split("-")[1]) == mes
                            && Integer.parseInt(cita.getFecha().split("-")[0]) == año) {
                        HeaderCita ingreso = new HeaderCita(
                                cita);

                        this.container.add(ingreso);
                    }

                }
                break;
            }
            default:
                break;
        }
        this.container.repaint();
        this.container.revalidate();
    }//GEN-LAST:event_diaActionPerformed

    private void semanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semanaActionPerformed
        this.container.removeAll();

        int dia = Integer.parseInt(this.dia.getItemAt(this.dia.getSelectedIndex()));
        int semana = Integer.parseInt(this.semana.getItemAt(this.semana.getSelectedIndex()));
        int mes = Integer.parseInt(this.mes.getItemAt(this.mes.getSelectedIndex()));
        int año = Integer.parseInt(this.año.getItemAt(this.año.getSelectedIndex()));

        if (tipo == 0) {
            this.semana.setVisible(false);
            this.tituloSemana.setVisible(false);

            this.ingresos.setText("Actividad (Dia)");

            this.container.add(new HeaderCita());

            ArrayList<Cita> citas = this.database.getCitas();

            for (Cita cita : citas) {
                if (Integer.parseInt(cita.getFecha().split("-")[2]) == dia
                        && Integer.parseInt(cita.getFecha().split("-")[1]) == mes
                        && Integer.parseInt(cita.getFecha().split("-")[0]) == año) {
                    HeaderCita ingreso = new HeaderCita(
                            cita);

                    this.container.add(ingreso);
                }
            }
        } else if (tipo == 1) {

            this.tituloDia.setVisible(false);
            this.dia.setVisible(false);
            this.ingresos.setText("Actividad (Semana)");

            this.container.add(new HeaderCita());

            ArrayList<Cita> citas = this.database.getCitas();

            for (Cita cita : citas) {
                if ((Integer.parseInt(cita.getFecha().split("-")[2]) / 7 + 1) == semana
                        && Integer.parseInt(cita.getFecha().split("-")[1]) == mes
                        && Integer.parseInt(cita.getFecha().split("-")[0]) == año) {
                    HeaderCita ingreso = new HeaderCita(
                            cita);

                    this.container.add(ingreso);
                }

            }
        } else if (tipo == 2) {

            this.tituloDia.setVisible(false);
            this.dia.setVisible(false);

            this.semana.setVisible(false);
            this.tituloSemana.setVisible(false);

            this.ingresos.setText("Actividad (Mes)");

            this.container.add(new HeaderCita());

            ArrayList<Cita> citas = this.database.getCitas();

            for (Cita cita : citas) {
                if (Integer.parseInt(cita.getFecha().split("-")[1]) == mes
                        && Integer.parseInt(cita.getFecha().split("-")[0]) == año) {
                    HeaderCita ingreso = new HeaderCita(
                            cita);

                    this.container.add(ingreso);
                }

            }
        }
        this.container.repaint();
        this.container.revalidate();
    }//GEN-LAST:event_semanaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> año;
    private javax.swing.JPanel container;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JLabel ingresos;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox<String> mes;
    private javax.swing.JComboBox<String> semana;
    private javax.swing.JLabel tituloAño;
    private javax.swing.JLabel tituloDia;
    private javax.swing.JLabel tituloMes;
    private javax.swing.JLabel tituloSemana;
    // End of variables declaration//GEN-END:variables
}
