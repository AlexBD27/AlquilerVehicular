/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author ANGIE
 */
public class VistaAlquiler extends javax.swing.JFrame implements ActionListener {

    private PresentadorGeneral pGeneral;
    private Bicicleta pBicicleta;
    private PanelCarro pCarro;
    private PanelMoto pMoto;

    private DefaultComboBoxModel comboBoxTipoVehiculo = new DefaultComboBoxModel();

    public VistaAlquiler(PresentadorGeneral p) {
        initComponents();
        this.pGeneral = p;
        this.pCarro = new PanelCarro();
        this.pBicicleta = new Bicicleta();
        this.pMoto = new PanelMoto();
        this.CmbBx_tipoVehiculo.addActionListener(this);
        llenarComboBoxTipoVehiculo();
    }
    
    public void iniciar() {
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);// visualiza la ventana
    }

    private void llenarComboBoxTipoVehiculo() {
        CmbBx_tipoVehiculo.addItem("Tipo de Vehiculo");
        CmbBx_tipoVehiculo.addItem("Carro");
        CmbBx_tipoVehiculo.addItem("Moto");
        CmbBx_tipoVehiculo.addItem("Bicicleta");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Lbl_vehiculo = new javax.swing.JLabel();
        CmbBx_tipoVehiculo = new javax.swing.JComboBox<>();
        txtFld_horasFacturadas = new javax.swing.JTextField();
        lbl_horasFacturadas = new javax.swing.JLabel();
        txtFld_hora = new javax.swing.JTextField();
        lbl_horaRecogida = new javax.swing.JLabel();
        txtFld_idVehiculo = new javax.swing.JTextField();
        lbl_idVehiculo = new javax.swing.JLabel();
        bttn_alquilar = new javax.swing.JButton();
        pnl_header = new javax.swing.JPanel();
        lbl_unsLogo = new javax.swing.JLabel();
        lbl_unidadMedica = new javax.swing.JLabel();
        Pnl_vehiculosBase = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Datos del Vehiculo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 200, -1));

        Lbl_vehiculo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lbl_vehiculo.setText("Seleccionar Vehiculo:");
        jPanel1.add(Lbl_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 170, -1));

        CmbBx_tipoVehiculo.setActionCommand("Tipo de Vehiculo");
        jPanel1.add(CmbBx_tipoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 120, 30));

        txtFld_horasFacturadas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFld_horasFacturadas.setPreferredSize(new java.awt.Dimension(71, 30));
        jPanel1.add(txtFld_horasFacturadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 310, -1));

        lbl_horasFacturadas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_horasFacturadas.setText("Horas facturadas:");
        jPanel1.add(lbl_horasFacturadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        txtFld_hora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFld_hora.setPreferredSize(new java.awt.Dimension(71, 30));
        jPanel1.add(txtFld_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 310, -1));

        lbl_horaRecogida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_horaRecogida.setText("Hora recogida:");
        jPanel1.add(lbl_horaRecogida, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        txtFld_idVehiculo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFld_idVehiculo.setPreferredSize(new java.awt.Dimension(71, 30));
        jPanel1.add(txtFld_idVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 310, -1));

        lbl_idVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_idVehiculo.setText("ID:");
        jPanel1.add(lbl_idVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        bttn_alquilar.setBackground(new java.awt.Color(51, 153, 255));
        bttn_alquilar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttn_alquilar.setForeground(new java.awt.Color(255, 255, 255));
        bttn_alquilar.setText("ALQUILAR");
        bttn_alquilar.setPreferredSize(new java.awt.Dimension(75, 35));
        bttn_alquilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_alquilarActionPerformed(evt);
            }
        });
        jPanel1.add(bttn_alquilar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 310, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 460, 490));

        pnl_header.setBackground(new java.awt.Color(255, 255, 255));
        pnl_header.setPreferredSize(new java.awt.Dimension(1220, 70));
        pnl_header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnl_header.add(lbl_unsLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 13, 110, 45));

        lbl_unidadMedica.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_unidadMedica.setText("Alquiler de Vehiculos");
        pnl_header.add(lbl_unidadMedica, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        getContentPane().add(pnl_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        javax.swing.GroupLayout Pnl_vehiculosBaseLayout = new javax.swing.GroupLayout(Pnl_vehiculosBase);
        Pnl_vehiculosBase.setLayout(Pnl_vehiculosBaseLayout);
        Pnl_vehiculosBaseLayout.setHorizontalGroup(
            Pnl_vehiculosBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        Pnl_vehiculosBaseLayout.setVerticalGroup(
            Pnl_vehiculosBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        getContentPane().add(Pnl_vehiculosBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 690, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttn_alquilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_alquilarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttn_alquilarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbBx_tipoVehiculo;
    private javax.swing.JLabel Lbl_vehiculo;
    private javax.swing.JPanel Pnl_vehiculosBase;
    private javax.swing.JButton bttn_alquilar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_horaRecogida;
    private javax.swing.JLabel lbl_horasFacturadas;
    private javax.swing.JLabel lbl_idVehiculo;
    private javax.swing.JLabel lbl_unidadMedica;
    private javax.swing.JLabel lbl_unsLogo;
    private javax.swing.JPanel pnl_header;
    private javax.swing.JTextField txtFld_hora;
    private javax.swing.JTextField txtFld_horasFacturadas;
    private javax.swing.JTextField txtFld_idVehiculo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Tipo de Vehiculo" -> {
                switch (CmbBx_tipoVehiculo.getSelectedIndex()) {
                    case 1 -> {
                        pGeneral.getpVehiculo().cambiarTipoVehiculo(Pnl_vehiculosBase, pCarro);
                        pGeneral.getpVehiculo().setTipoVehiculo("CARRO");
                    }
                    case 2 -> {
                        pGeneral.getpVehiculo().cambiarTipoVehiculo(Pnl_vehiculosBase, pMoto);
                        pGeneral.getpVehiculo().setTipoVehiculo("MOTO");
                    }
                    case 3 -> {
                        pGeneral.getpVehiculo().cambiarTipoVehiculo(Pnl_vehiculosBase, pBicicleta);
                        pGeneral.getpVehiculo().setTipoVehiculo("BICICLETA");
                    }
                }
            }
        }
    }
}
