/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Juann Inga
 */
public class VistaAdmin extends javax.swing.JInternalFrame{

    /**
     * Creates new form VistaAdmins
     */
    public VistaAdmin() {
        initComponents();
        this.setSize(1301, 665);
        this.setTitle("Administradores");
    }

    public JButton getBtnAceptarAd() {
        return btnAceptarAd;
    }

    public void setBtnAceptarAd(JButton btnAceptarAd) {
        this.btnAceptarAd = btnAceptarAd;
    }

    public JButton getBtnActualizarEx() {
        return btnActualizarEx;
    }

    public void setBtnActualizarEx(JButton btnActualizarEx) {
        this.btnActualizarEx = btnActualizarEx;
    }

    public JButton getBtnCancelarAd() {
        return btnCancelarAd;
    }

    public void setBtnCancelarAd(JButton btnCancelarAd) {
        this.btnCancelarAd = btnCancelarAd;
    }

    public JButton getBtnEditarEx() {
        return btnEditarEx;
    }

    public void setBtnEditarEx(JButton btnEditarEx) {
        this.btnEditarEx = btnEditarEx;
    }

    public JButton getBtnEliminarEx() {
        return btnEliminarEx;
    }

    public void setBtnEliminarEx(JButton btnEliminarEx) {
        this.btnEliminarEx = btnEliminarEx;
    }

    public JButton getBtnExaminarAd() {
        return btnExaminarAd;
    }

    public void setBtnExaminarAd(JButton btnExaminarAd) {
        this.btnExaminarAd = btnExaminarAd;
    }

    public JButton getBtnNuevoEx() {
        return btnNuevoEx;
    }

    public void setBtnNuevoEx(JButton btnNuevoEx) {
        this.btnNuevoEx = btnNuevoEx;
    }

    public JComboBox<String> getCmbGeneroAd() {
        return cmbGeneroAd;
    }

    public void setCmbGeneroAd(JComboBox<String> cmbGeneroAd) {
        this.cmbGeneroAd = cmbGeneroAd;
    }

    public JComboBox<String> getCmbTipoUsuarioAd() {
        return cmbTipoUsuarioAd;
    }

    public void setCmbTipoUsuarioAd(JComboBox<String> cmbTipoUsuarioAd) {
        this.cmbTipoUsuarioAd = cmbTipoUsuarioAd;
    }

    public JDialog getDlgAdmin() {
        return dlgAdmin;
    }

    public void setDlgAdmin(JDialog dlgAdmin) {
        this.dlgAdmin = dlgAdmin;
    }

    public JDateChooser getDtcFechaAd() {
        return dtcFechaAd;
    }

    public void setDtcFechaAd(JDateChooser dtcFechaAd) {
        this.dtcFechaAd = dtcFechaAd;
    }

    public JLabel getLblFotoAd() {
        return lblFotoAd;
    }

    public void setLblFotoAd(JLabel lblFotoAd) {
        this.lblFotoAd = lblFotoAd;
    }

    public JTable getTblAdmin() {
        return tblAdmin;
    }

    public void setTblAdmin(JTable tblAdmin) {
        this.tblAdmin = tblAdmin;
    }

    public JTextField getTxtApellidoAd() {
        return txtApellidoAd;
    }

    public void setTxtApellidoAd(JTextField txtApellidoAd) {
        this.txtApellidoAd = txtApellidoAd;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
    }

    public JTextField getTxtCedulaAd() {
        return txtCedulaAd;
    }

    public void setTxtCedulaAd(JTextField txtCedulaAd) {
        this.txtCedulaAd = txtCedulaAd;
    }

    public JTextField getTxtCodigoAd() {
        return txtCodigoAd;
    }

    public void setTxtCodigoAd(JTextField txtCodigoAd) {
        this.txtCodigoAd = txtCodigoAd;
    }

    public JTextField getTxtContraseniaAd() {
        return txtContraseniaAd;
    }

    public void setTxtContraseniaAd(JTextField txtContraseniaAd) {
        this.txtContraseniaAd = txtContraseniaAd;
    }

    public JTextField getTxtCorreoAd() {
        return txtCorreoAd;
    }

    public void setTxtCorreoAd(JTextField txtCorreoAd) {
        this.txtCorreoAd = txtCorreoAd;
    }

    public JTextField getTxtDireccionAd() {
        return txtDireccionAd;
    }

    public void setTxtDireccionAd(JTextField txtDireccionAd) {
        this.txtDireccionAd = txtDireccionAd;
    }

    public JTextField getTxtNombreAd() {
        return txtNombreAd;
    }

    public void setTxtNombreAd(JTextField txtNombreAd) {
        this.txtNombreAd = txtNombreAd;
    }

    public JTextField getTxtTelefonoAd() {
        return txtTelefonoAd;
    }

    public void setTxtTelefonoAd(JTextField txtTelefonoAd) {
        this.txtTelefonoAd = txtTelefonoAd;
    }
    

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgAdmin = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCedulaAd = new javax.swing.JTextField();
        txtNombreAd = new javax.swing.JTextField();
        txtApellidoAd = new javax.swing.JTextField();
        txtDireccionAd = new javax.swing.JTextField();
        txtCorreoAd = new javax.swing.JTextField();
        txtTelefonoAd = new javax.swing.JTextField();
        dtcFechaAd = new com.toedter.calendar.JDateChooser();
        lblFotoAd = new javax.swing.JLabel();
        btnExaminarAd = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCodigoAd = new javax.swing.JTextField();
        txtContraseniaAd = new javax.swing.JTextField();
        cmbGeneroAd = new javax.swing.JComboBox<>();
        cmbTipoUsuarioAd = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        btnAceptarAd = new javax.swing.JButton();
        btnCancelarAd = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdmin = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnNuevoEx = new javax.swing.JButton();
        btnActualizarEx = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnEditarEx = new javax.swing.JButton();
        btnEliminarEx = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(166, 138, 163));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Cédula:");

        jLabel5.setText("Nombre:");

        jLabel6.setText("Apellido:");

        jLabel7.setText("Género:");

        jLabel8.setText("Dirección:");

        jLabel9.setText("Correo:");

        jLabel10.setText("Telefono:");

        jLabel11.setText("Foto:");

        jLabel12.setText("Fecha/Nac:");

        txtCedulaAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaAdActionPerformed(evt);
            }
        });

        txtDireccionAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionAdActionPerformed(evt);
            }
        });

        lblFotoAd.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnExaminarAd.setText("Examinar...");

        jLabel13.setText("Código:");

        jLabel14.setText("Contraseña:");

        cmbGeneroAd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Masculino", "Femenino" }));

        cmbTipoUsuarioAd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Super Administrador", "Administrador", "Operador", " " }));

        jLabel15.setText("Tipo de Usuario:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel13))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtApellidoAd, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombreAd, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCedulaAd)
                            .addComponent(txtCodigoAd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefonoAd, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbGeneroAd, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(dtcFechaAd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCorreoAd, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDireccionAd, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFotoAd, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cmbTipoUsuarioAd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtContraseniaAd, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnExaminarAd, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtCodigoAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCedulaAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNombreAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtApellidoAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(dtcFechaAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtDireccionAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtCorreoAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cmbTipoUsuarioAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtContraseniaAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblFotoAd, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExaminarAd)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTelefonoAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbGeneroAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        btnAceptarAd.setText("Aceptar");

        btnCancelarAd.setText("Cancelar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAceptarAd, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelarAd, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarAd)
                    .addComponent(btnCancelarAd))
                .addContainerGap())
        );

        javax.swing.GroupLayout dlgAdminLayout = new javax.swing.GroupLayout(dlgAdmin.getContentPane());
        dlgAdmin.getContentPane().setLayout(dlgAdminLayout);
        dlgAdminLayout.setHorizontalGroup(
            dlgAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dlgAdminLayout.setVerticalGroup(
            dlgAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel2.setBackground(new java.awt.Color(100, 64, 125));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administradores");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        tblAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cedula", "Nombre", "Apellido", "Genero", "Fecha/Nac", "Dirección", "Correo", "Teléfono", "Foto"
            }
        ));
        jScrollPane1.setViewportView(tblAdmin);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnNuevoEx.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevoEx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nuevo.png"))); // NOI18N
        btnNuevoEx.setText("Nuevo Registro");
        btnNuevoEx.setFocusable(false);

        btnActualizarEx.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActualizarEx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/actualizar.png"))); // NOI18N
        btnActualizarEx.setText("Actualizar");
        btnActualizarEx.setFocusable(false);
        btnActualizarEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarExActionPerformed(evt);
            }
        });

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        btnEditarEx.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditarEx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editar.png"))); // NOI18N
        btnEditarEx.setText("Editar");
        btnEditarEx.setFocusable(false);
        btnEditarEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarExActionPerformed(evt);
            }
        });

        btnEliminarEx.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminarEx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eliminar.png"))); // NOI18N
        btnEliminarEx.setText("Eliminar");
        btnEliminarEx.setFocusable(false);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/searchmagnifierinterfacesymbol1_79893.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(67, 67, 67)
                .addComponent(btnNuevoEx)
                .addGap(18, 18, 18)
                .addComponent(btnActualizarEx)
                .addGap(18, 18, 18)
                .addComponent(btnEditarEx, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarEx)
                .addContainerGap(438, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscar)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevoEx)
                            .addComponent(btnActualizarEx)
                            .addComponent(btnEditarEx)
                            .addComponent(btnEliminarEx))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaAdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaAdActionPerformed

    private void txtDireccionAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionAdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionAdActionPerformed

    private void btnActualizarExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarExActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarExActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnEditarExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarExActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarExActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarAd;
    private javax.swing.JButton btnActualizarEx;
    private javax.swing.JButton btnCancelarAd;
    private javax.swing.JButton btnEditarEx;
    private javax.swing.JButton btnEliminarEx;
    private javax.swing.JButton btnExaminarAd;
    private javax.swing.JButton btnNuevoEx;
    private javax.swing.JComboBox<String> cmbGeneroAd;
    private javax.swing.JComboBox<String> cmbTipoUsuarioAd;
    private javax.swing.JDialog dlgAdmin;
    private com.toedter.calendar.JDateChooser dtcFechaAd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFotoAd;
    private javax.swing.JTable tblAdmin;
    private javax.swing.JTextField txtApellidoAd;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCedulaAd;
    private javax.swing.JTextField txtCodigoAd;
    private javax.swing.JTextField txtContraseniaAd;
    private javax.swing.JTextField txtCorreoAd;
    private javax.swing.JTextField txtDireccionAd;
    private javax.swing.JTextField txtNombreAd;
    private javax.swing.JTextField txtTelefonoAd;
    // End of variables declaration//GEN-END:variables
}
