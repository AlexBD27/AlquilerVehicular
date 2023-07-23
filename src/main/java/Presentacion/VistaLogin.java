package Presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class VistaLogin extends javax.swing.JFrame implements ActionListener{

    private PresentadorGeneral pGeneral;
    
    public VistaLogin(PresentadorGeneral pGeneral) {
        this.pGeneral = pGeneral;
        initComponents();
        this.bttn_login.addActionListener(this);
        this.bttn_registro.addActionListener(this);
    }

    public void iniciar(){
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    public String getDni(){
        return txtFld_DNI.getText();
    }

    public void mensaje(String salida){
        JOptionPane.showMessageDialog(null, salida);
    }
    
//    public void actionIniciarSesion(){
//        pGeneral.getpLogin().setDNI(this.getDni());
//        pGeneral.getpLogin().iniciarSesion();
//        mensaje(pGeneral.getpLogin().mensaje());
//        if (pGeneral.getpLogin().Acceso()){
//            this.dispose();
//            pGeneral.mostrarVistaAlquiler();
//        }
//    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_header = new javax.swing.JPanel();
        lbl_unsLogo = new javax.swing.JLabel();
        lbl_unidadMedica = new javax.swing.JLabel();
        pnl_login = new javax.swing.JPanel();
        lbl_nombre = new javax.swing.JLabel();
        bttn_login = new javax.swing.JButton();
        txtFld_DNI = new javax.swing.JTextField();
        bttn_registro = new javax.swing.JButton();
        lbl_foto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_header.setBackground(new java.awt.Color(255, 255, 255));
        pnl_header.setPreferredSize(new java.awt.Dimension(1220, 70));
        pnl_header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnl_header.add(lbl_unsLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 13, 110, 45));

        lbl_unidadMedica.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_unidadMedica.setText("Sistema de Alquiler de Vehiculos");
        pnl_header.add(lbl_unidadMedica, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        pnl_login.setBackground(new java.awt.Color(255, 255, 255));
        pnl_login.setPreferredSize(new java.awt.Dimension(450, 540));

        lbl_nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_nombre.setText("DNI:");

        bttn_login.setBackground(new java.awt.Color(51, 153, 255));
        bttn_login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttn_login.setForeground(new java.awt.Color(255, 255, 255));
        bttn_login.setText("INICIAR SESION");
        bttn_login.setPreferredSize(new java.awt.Dimension(75, 35));
        bttn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_loginActionPerformed(evt);
            }
        });

        txtFld_DNI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFld_DNI.setPreferredSize(new java.awt.Dimension(71, 30));

        bttn_registro.setBackground(new java.awt.Color(204, 204, 204));
        bttn_registro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttn_registro.setForeground(new java.awt.Color(255, 255, 255));
        bttn_registro.setText("Registrarse");
        bttn_registro.setPreferredSize(new java.awt.Dimension(75, 35));
        bttn_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_registroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_loginLayout = new javax.swing.GroupLayout(pnl_login);
        pnl_login.setLayout(pnl_loginLayout);
        pnl_loginLayout.setHorizontalGroup(
            pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_loginLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nombre)
                    .addComponent(txtFld_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttn_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnl_loginLayout.setVerticalGroup(
            pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_loginLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(lbl_nombre)
                .addGap(18, 18, 18)
                .addComponent(txtFld_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(bttn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(bttn_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(pnl_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnl_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(pnl_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnl_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttn_loginActionPerformed

    private void bttn_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_registroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttn_registroActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttn_login;
    private javax.swing.JButton bttn_registro;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_unidadMedica;
    private javax.swing.JLabel lbl_unsLogo;
    private javax.swing.JPanel pnl_header;
    private javax.swing.JPanel pnl_login;
    private javax.swing.JTextField txtFld_DNI;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "Iniciar Sesion" -> {
                this.bttn_login.setEnabled(true);
                pGeneral.getpLogin().setDNI(this.getDni());
                pGeneral.getpLogin().iniciarSesion();
                mensaje(pGeneral.getpLogin().mensaje());
                if (pGeneral.getpLogin().Acceso()){
                    this.dispose();
                    pGeneral.mostrarVistaAlquiler();
                }
            }
            case "Registrarse" -> {
                this.bttn_registro.setEnabled(true);
                this.dispose();
                pGeneral.mostrarVistaRegistro();
            }
        }
    }
}
