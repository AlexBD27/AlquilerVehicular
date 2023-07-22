/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Presentacion;

import Dominio.Moto;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ANGIE
 */
public class PanelMoto extends javax.swing.JPanel {
private DefaultTableModel model;
    /**
     * Creates new form Carro
     */
    public PanelMoto() {
        initComponents();
        model = (DefaultTableModel) Tbl_moto.getModel();
        inicializarTabla();
    }
    
        private void inicializarTabla() {
        model = new DefaultTableModel();
        model.addColumn("Identificador");
        model.addColumn("Descripción");
        model.addColumn("Precio por Hora");
        Tbl_moto.setModel(model);
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
        Tbl_moto = new javax.swing.JTable();
        TxtFld_buscarCarro = new javax.swing.JTextField();
        Bttn_buscar = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(690, 570));
        setPreferredSize(new java.awt.Dimension(690, 570));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tbl_moto.setModel(new javax.swing.table.DefaultTableModel(
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
        Tbl_moto.setMinimumSize(new java.awt.Dimension(650, 570));
        jScrollPane1.setViewportView(Tbl_moto);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 580, -1));
        add(TxtFld_buscarCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 320, 30));

        Bttn_buscar.setText("Buscar");
        add(Bttn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 140, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bttn_buscar;
    private javax.swing.JTable Tbl_moto;
    private javax.swing.JTextField TxtFld_buscarCarro;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
public void mostrarMotos(List<Moto> listaMotos) {
        DefaultTableModel model = (DefaultTableModel) Tbl_moto.getModel();
        model.setRowCount(0);

        for (Moto moto : listaMotos) {
            model.addRow(new Object[]{moto.getIdentificador(), moto.getDescripcion(), moto.getPrecioHora(), /*otros atributos específicos de Moto*/});
        }
    }

}
