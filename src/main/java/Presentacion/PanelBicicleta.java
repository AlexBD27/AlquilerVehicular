/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Presentacion;

import Dominio.*;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ANGIE
 */
public class PanelBicicleta extends javax.swing.JPanel {

    private DefaultTableModel model;

    public PanelBicicleta() {
        initComponents();
        model = (DefaultTableModel) Tbl_bicicleta.getModel();
        inicializarTabla();
    }

    private void inicializarTabla() {
        model = new DefaultTableModel();
        model.addColumn("Identificador");
        model.addColumn("Descripción");
        model.addColumn("Precio por Hora");
        Tbl_bicicleta.setModel(model);
    }
        public JTable getTbl_bicicleta() {
        return Tbl_bicicleta;
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
        Tbl_bicicleta = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tbl_bicicleta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        Tbl_bicicleta.setMinimumSize(new java.awt.Dimension(650, 560));
        Tbl_bicicleta.setPreferredSize(new java.awt.Dimension(300, 80));
        jScrollPane1.setViewportView(Tbl_bicicleta);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 580, 130));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LISTADO DE BICICLETAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 580, 40));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tbl_bicicleta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
public void mostrarBicicletas(List<Bicicleta> listaBicicletas) {
    DefaultTableModel model = (DefaultTableModel) Tbl_bicicleta.getModel();
    model.setRowCount(0);

    for (Bicicleta bicicleta : listaBicicletas) {
        model.addRow(new Object[]{bicicleta.getIdentificador(), bicicleta.getDescripcion(), bicicleta.getPrecioHora(), /*otros atributos específicos de PanelBicicleta*/});
    }
}


}
