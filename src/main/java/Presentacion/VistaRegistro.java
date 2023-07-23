package Presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaRegistro extends javax.swing.JFrame implements ActionListener{

    private PresentadorGeneral pGeneral;
    
    public VistaRegistro(PresentadorGeneral pGeneral) {
        this.pGeneral = pGeneral;
        initComponents();
        this.bttn_ingresar.addActionListener(this);
    }

    public void iniciar() {
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public void actionIngresar(){
        
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_header.setBackground(new java.awt.Color(255, 255, 255));
        pnl_header.setPreferredSize(new java.awt.Dimension(1220, 70));
        pnl_header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnl_header.add(lbl_unsLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 13, 110, 45));

        lbl_unidadMedica.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_unidadMedica.setText("Formulario de Datos del Cliente");
        pnl_header.add(lbl_unidadMedica, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        pnl_login.setBackground(new java.awt.Color(255, 255, 255));
        pnl_login.setPreferredSize(new java.awt.Dimension(450, 540));

        lbl_nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_nombre.setText("Nombre:");

        txtFld_fechanac.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFld_fechanac.setPreferredSize(new java.awt.Dimension(71, 30));

        lbl_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_id.setText("DNI:");

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

        lbl_fechaNac.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_fechaNac.setText("Fecha de nacimiento:");

        txtFld_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFld_nombre.setPreferredSize(new java.awt.Dimension(71, 30));

        txtFld_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFld_id.setPreferredSize(new java.awt.Dimension(71, 30));

        javax.swing.GroupLayout pnl_loginLayout = new javax.swing.GroupLayout(pnl_login);
        pnl_login.setLayout(pnl_loginLayout);
        pnl_loginLayout.setHorizontalGroup(
            pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_loginLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nombre)
                    .addComponent(txtFld_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_id)
                    .addComponent(txtFld_id, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_fechaNac)
                    .addComponent(txtFld_fechanac, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnl_loginLayout.setVerticalGroup(
            pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_loginLayout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(lbl_nombre)
                .addGap(10, 10, 10)
                .addComponent(txtFld_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lbl_id)
                .addGap(10, 10, 10)
                .addComponent(txtFld_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lbl_fechaNac)
                .addGap(10, 10, 10)
                .addComponent(txtFld_fechanac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(bttn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(pnl_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnl_header, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(pnl_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_ingresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttn_ingresarActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttn_ingresar;
    private javax.swing.JLabel lbl_fechaNac;
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

    @Override
    public void actionPerformed(ActionEvent e) {
        actionIngresar();
    }
}
