/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.componentes;

import modelos.Proveedor;

/**
 *
 * @author yorman
 */
public class ProveedorCarta extends javax.swing.JPanel {

    /**
     * Creates new form ProveedorCarta
     * @param proveedor
     */
    public ProveedorCarta(Proveedor proveedor) {
        initComponents();
        
        this.rif.setText("<html><body style='margin: 5px 10px 2px 10px'><span style='font-weight: bold'>RIF del Proveedor:</span> <span>" + 
                proveedor.getRifProveedor() + "</span></body></html>");
        this.nombre.setText("<html><body style='margin: 2px 10px 2px 10px'><span style='font-weight: bold'>Nombre del Proveedor:</span> <span>" + 
                proveedor.getNombreProveedor() + "</span></body></html>");
        this.direccion.setText("<html><body style='margin: 2px 10px 2px 10px'><span style='font-weight: bold'>Direccion:</span> <span>" + 
                proveedor.getDireccion() + "</span></body></html>");
        this.correo.setText("<html><body style='margin: 2px 10px 2px 10px'><span style='font-weight: bold'>Correo:</span> <span>" + 
                proveedor.getCorreoElectronico() + "</span></body></html>");
        this.telefono.setText("<html><body style='margin: 2px 10px 2px 10px'><span  style='font-weight: bold'>Numero de Telefono:</span> <span>" + 
                proveedor.getNumeroDeTelefono() + "</span></body></html>");
        this.materialesQueSuministra.setText(proveedor.getMaterialesQueSuministra());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rif = new javax.swing.JLabel();
        numeroDeFactura = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        direccion = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        tituloDescripcion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        materialesQueSuministra = new javax.swing.JTextArea();
        listaExamenes = new javax.swing.JLabel();

        setBackground(new java.awt.Color(155, 204, 253));

        rif.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rif.setText("RIF del Proveedor: J-294675379");

        numeroDeFactura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombre.setText("Nombre Del Proveedor: Materiales Bisturi");

        telefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        telefono.setText("Numero De Telefono: +58414-8698221");

        direccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        direccion.setText("Direccion: Unare");

        correo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        correo.setText("Correo: example@gmail.com");

        tituloDescripcion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tituloDescripcion.setText("<html><body style=\"margin: 2px 10px 2px 10px\">Materiales que Suministra:");

        materialesQueSuministra.setColumns(20);
        materialesQueSuministra.setRows(5);
        jScrollPane1.setViewportView(materialesQueSuministra);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        listaExamenes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(rif)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(numeroDeFactura)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(direccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rif)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre)
                    .addComponent(numeroDeFactura))
                .addComponent(telefono)
                .addGap(0, 0, 0)
                .addComponent(direccion)
                .addGap(0, 0, 0)
                .addComponent(correo)
                .addGap(0, 0, 0)
                .addComponent(tituloDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel correo;
    private javax.swing.JLabel direccion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel listaExamenes;
    private javax.swing.JTextArea materialesQueSuministra;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel numeroDeFactura;
    private javax.swing.JLabel rif;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel tituloDescripcion;
    // End of variables declaration//GEN-END:variables
}
