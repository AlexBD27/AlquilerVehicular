package Presentacion;

public class VistaRegistro extends javax.swing.JFrame {


    public VistaRegistro() {
        initComponents();

    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_header = new javax.swing.JPanel();
        lbl_unsLogo = new javax.swing.JLabel();
        lbl_unidadMedica = new javax.swing.JLabel();
        pnl_login = new javax.swing.JPanel();
        lbl_nombre = new javax.swing.JLabel();
        txtFld_fechanac = new javax.swing.JTextField();
        lbl_id = new javax.swing.JLabel();
        bttn_ingresar = new javax.swing.JButton();
        lbl_fechaNac = new javax.swing.JLabel();
        txtFld_nombre = new javax.swing.JTextField();
        txtFld_id = new javax.swing.JTextField();
        lbl_foto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_header.setBackground(new java.awt.Color(255, 255, 255));
        pnl_header.setPreferredSize(new java.awt.Dimension(1220, 70));
        pnl_header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnl_header.add(lbl_unsLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 13, 110, 45));

        lbl_unidadMedica.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_unidadMedica.setText("Formulario de Datos del Cliente");
        pnl_header.add(lbl_unidadMedica, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        getContentPane().add(pnl_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        pnl_login.setBackground(new java.awt.Color(255, 255, 255));
        pnl_login.setPreferredSize(new java.awt.Dimension(450, 540));
        pnl_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_nombre.setText("Nombre:");
        pnl_login.add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        txtFld_fechanac.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFld_fechanac.setPreferredSize(new java.awt.Dimension(71, 30));
        pnl_login.add(txtFld_fechanac, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 310, -1));

        lbl_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_id.setText("ID:");
        pnl_login.add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        bttn_ingresar.setBackground(new java.awt.Color(51, 153, 255));
        bttn_ingresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttn_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        bttn_ingresar.setText("INGRESAR");
        bttn_ingresar.setPreferredSize(new java.awt.Dimension(75, 35));
        bttn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_ingresarActionPerformed(evt);
            }
        });
        pnl_login.add(bttn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 310, 40));

        lbl_fechaNac.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_fechaNac.setText("Fecha de nacimiento:");
        pnl_login.add(lbl_fechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        txtFld_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFld_nombre.setPreferredSize(new java.awt.Dimension(71, 30));
        pnl_login.add(txtFld_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 310, -1));

        txtFld_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFld_id.setPreferredSize(new java.awt.Dimension(71, 30));
        pnl_login.add(txtFld_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 310, -1));

        getContentPane().add(pnl_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, -1, -1));
        getContentPane().add(lbl_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 700, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_ingresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttn_ingresarActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttn_ingresar;
    private javax.swing.JLabel lbl_fechaNac;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_unidadMedica;
    private javax.swing.JLabel lbl_unsLogo;
    private javax.swing.JPanel pnl_header;
    private javax.swing.JPanel pnl_login;
    private javax.swing.JTextField txtFld_fechanac;
    private javax.swing.JTextField txtFld_id;
    private javax.swing.JTextField txtFld_nombre;
    // End of variables declaration//GEN-END:variables
}
