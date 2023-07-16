/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.componentes;

import modelos.Pago;

/**
 *
 * @author yorman
 */
public class HeaderIngresos extends javax.swing.JPanel {

    /**
     * Creates new form HeaderIngresos
     */
    public HeaderIngresos() {
        initComponents();
    }

    public HeaderIngresos(String fecha, int metodoDePago, long monto, int moneda) {
        initComponents();
        
        String metodo = "PAGO MOVIL";
        String mon = "BOLIVARES";
        
        if(metodoDePago == Pago.MetodosDePago.EFECTIVO){
            metodo = "EFECTIVO";
        }
        
        if(moneda == Pago.Monedas.DOLARES_AMERICANOS){
            mon = "DOLARES AMERICANOS";
        }
        
        this.fecha.setText(fecha);
        this.metodoDePago.setText(metodo);
        this.monto.setText(Long.toString(monto));
        this.moneda.setText(mon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        fecha = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        metodoDePago = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        monto = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        moneda = new javax.swing.JLabel();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.X_AXIS));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 120));

        fecha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setText("Fecha");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(fecha)
                .addGap(10, 10, 10))
        );

        add(jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 120));

        metodoDePago.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        metodoDePago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        metodoDePago.setText("Metodo de Pago");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(metodoDePago, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(metodoDePago)
                .addGap(10, 10, 10))
        );

        add(jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setPreferredSize(new java.awt.Dimension(100, 120));

        monto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        monto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        monto.setText("Monto");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(monto, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(monto)
                .addGap(10, 10, 10))
        );

        add(jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setPreferredSize(new java.awt.Dimension(100, 120));

        moneda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        moneda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moneda.setText("Moneda");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(moneda, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(moneda)
                .addGap(10, 10, 10))
        );

        add(jPanel5);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fecha;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel metodoDePago;
    private javax.swing.JLabel moneda;
    private javax.swing.JLabel monto;
    // End of variables declaration//GEN-END:variables
}
