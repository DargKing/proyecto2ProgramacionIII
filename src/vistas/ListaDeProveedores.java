/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.util.ArrayList;
import modelos.BaseDeDatos;
import modelos.Proveedor;
import vistas.componentes.ProveedorCarta;

/**
 *
 * @author yorman
 */
public class ListaDeProveedores extends javax.swing.JPanel {

    BaseDeDatos database;

    /**
     * Creates new form ListaDeProveedores
     */
    public ListaDeProveedores(VentanaPrincipal ventana) {
        initComponents();
        
        this.database = ventana.getDatabase();
        
        ArrayList<Proveedor> proveedores = this.database.getProveedores();

        for (Proveedor proveedor : proveedores) {
            ProveedorCarta p = new ProveedorCarta(proveedor);
            this.containerGrid.add(p);
        }

        int temp = (proveedores.size() % 2 != 0) ? proveedores.size() + 1 : proveedores.size();

        double cantidadDeFilas = temp / 2;
        System.out.println("Refrescar");
        containerGrid.setLayout(new java.awt.GridLayout((int) cantidadDeFilas, 2, 30, 30));
        containerGrid.repaint();
        containerGrid.revalidate();

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        containerGrid = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        refrescar = new javax.swing.JButton();

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        containerGrid.setBackground(new java.awt.Color(153, 255, 204));
        containerGrid.setPreferredSize(new java.awt.Dimension(100, 100));
        containerGrid.setLayout(new java.awt.GridLayout(2, 2, 30, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(containerGrid, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(containerGrid, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Lista de Proveedores");

        refrescar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        refrescar.setText("Refrescar");
        refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refrescar)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(refrescar))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refrescarActionPerformed
        // TODO add your handling code here:
        this.containerGrid.removeAll();
        ArrayList<Proveedor> proveedores = this.database.getProveedores();

        for (Proveedor proveedor : proveedores) {
            ProveedorCarta p = new ProveedorCarta(proveedor);
            this.containerGrid.add(p);
        }

        int temp = (proveedores.size() % 2 != 0) ? proveedores.size() + 1 : proveedores.size();

        double cantidadDeFilas = temp / 2;
        System.out.println("Refrescar");
        containerGrid.setLayout(new java.awt.GridLayout((int) cantidadDeFilas, 2, 30, 30));
        containerGrid.repaint();
        containerGrid.revalidate();
    }//GEN-LAST:event_refrescarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel containerGrid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refrescar;
    // End of variables declaration//GEN-END:variables
}
