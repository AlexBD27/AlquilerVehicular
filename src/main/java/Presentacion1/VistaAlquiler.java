/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion1;

/**
 *
 * @author ANGIE
 */
public class VistaAlquiler extends javax.swing.JFrame {

    /**
     * Creates new form VistaAlquiler
     */
    public VistaAlquiler() {
        initComponents();
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
        Pnl_vehiculos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Datos del Vehiculo");

        Lbl_vehiculo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lbl_vehiculo.setText("Seleccionar Vehiculo:");

        CmbBx_tipoVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carro", "Moto", "Bicicleta", " " }));

        txtFld_horasFacturadas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFld_horasFacturadas.setPreferredSize(new java.awt.Dimension(71, 30));

        lbl_horasFacturadas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_horasFacturadas.setText("Horas facturadas:");

        txtFld_hora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFld_hora.setPreferredSize(new java.awt.Dimension(71, 30));

        lbl_horaRecogida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_horaRecogida.setText("Hora recogida:");

        txtFld_idVehiculo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFld_idVehiculo.setPreferredSize(new java.awt.Dimension(71, 30));

        lbl_idVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_idVehiculo.setText("ID:");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(Lbl_vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(CmbBx_tipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(lbl_idVehiculo))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(txtFld_idVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(lbl_horaRecogida))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(txtFld_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(lbl_horasFacturadas))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(txtFld_horasFacturadas, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(bttn_alquilar, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_vehiculo)
                    .addComponent(CmbBx_tipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(lbl_idVehiculo)
                .addGap(10, 10, 10)
                .addComponent(txtFld_idVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lbl_horaRecogida)
                .addGap(10, 10, 10)
                .addComponent(txtFld_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lbl_horasFacturadas)
                .addGap(10, 10, 10)
                .addComponent(txtFld_horasFacturadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(bttn_alquilar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_header.setBackground(new java.awt.Color(255, 255, 255));
        pnl_header.setPreferredSize(new java.awt.Dimension(1220, 70));

        lbl_unidadMedica.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_unidadMedica.setText("Alquiler de Vehiculos");

        javax.swing.GroupLayout pnl_headerLayout = new javax.swing.GroupLayout(pnl_header);
        pnl_header.setLayout(pnl_headerLayout);
        pnl_headerLayout.setHorizontalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_headerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl_unsLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(340, 340, 340)
                .addComponent(lbl_unidadMedica))
        );
        pnl_headerLayout.setVerticalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_headerLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lbl_unsLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnl_headerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_unidadMedica))
        );

        javax.swing.GroupLayout Pnl_vehiculosLayout = new javax.swing.GroupLayout(Pnl_vehiculos);
        Pnl_vehiculos.setLayout(Pnl_vehiculosLayout);
        Pnl_vehiculosLayout.setHorizontalGroup(
            Pnl_vehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        Pnl_vehiculosLayout.setVerticalGroup(
            Pnl_vehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(Pnl_vehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(pnl_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pnl_vehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttn_alquilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_alquilarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttn_alquilarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbBx_tipoVehiculo;
    private javax.swing.JLabel Lbl_vehiculo;
    private javax.swing.JPanel Pnl_vehiculos;
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
}
