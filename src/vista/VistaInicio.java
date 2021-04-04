/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import javax.swing.JDesktopPane;

/**
 *
 * @author Juann Inga
 */
public class VistaInicio extends javax.swing.JFrame {

    /**
     * Creates new form VistaInicio
     */
    public VistaInicio() {
        initComponents();
    }

    public JDesktopPane getDesktop() {
        return Desktop;
    }

    public void setDesktop(JDesktopPane Desktop) {
        this.Desktop = Desktop;
    }

    public JButton getTblCrudAdmin() {
        return tblCrudAdmin;
    }

    public void setTblCrudAdmin(JButton tblCrudAdmin) {
        this.tblCrudAdmin = tblCrudAdmin;
    }

    public JButton getTblCrudContratos() {
        return tblCrudContratos;
    }

    public void setTblCrudContratos(JButton tblCrudContratos) {
        this.tblCrudContratos = tblCrudContratos;
    }

    public JButton getTblCrudFacturas() {
        return tblCrudFacturas;
    }

    public void setTblCrudFacturas(JButton tblCrudFacturas) {
        this.tblCrudFacturas = tblCrudFacturas;
    }

    public JButton getTblCrudMedidores() {
        return tblCrudMedidores;
    }

    public void setTblCrudMedidores(JButton tblCrudMedidores) {
        this.tblCrudMedidores = tblCrudMedidores;
    }

    public JButton getTblCrudPersonas() {
        return tblCrudPersonas;
    }

    public void setTblCrudPersonas(JButton tblCrudPersonas) {
        this.tblCrudPersonas = tblCrudPersonas;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        tblCrudPersonas = new javax.swing.JButton();
        tblCrudMedidores = new javax.swing.JButton();
        tblCrudContratos = new javax.swing.JButton();
        tblCrudFacturas = new javax.swing.JButton();
        tblCrudAdmin = new javax.swing.JButton();
        Desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        tblCrudPersonas.setText("Personas");
        tblCrudPersonas.setFocusable(false);
        tblCrudPersonas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tblCrudPersonas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(tblCrudPersonas);

        tblCrudMedidores.setText("Medidores");
        tblCrudMedidores.setFocusable(false);
        tblCrudMedidores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tblCrudMedidores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(tblCrudMedidores);

        tblCrudContratos.setText("Contratos");
        tblCrudContratos.setFocusable(false);
        tblCrudContratos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tblCrudContratos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(tblCrudContratos);

        tblCrudFacturas.setText("Facturas");
        tblCrudFacturas.setFocusable(false);
        tblCrudFacturas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tblCrudFacturas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(tblCrudFacturas);

        tblCrudAdmin.setText("Administradores");
        tblCrudAdmin.setFocusable(false);
        tblCrudAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tblCrudAdmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(tblCrudAdmin);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
            .addComponent(Desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Desktop))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton tblCrudAdmin;
    private javax.swing.JButton tblCrudContratos;
    private javax.swing.JButton tblCrudFacturas;
    private javax.swing.JButton tblCrudMedidores;
    private javax.swing.JButton tblCrudPersonas;
    // End of variables declaration//GEN-END:variables
}