package br.unimontes.hm01.view;

import br.unimontes.hm01.DAO.DAOException;
import br.unimontes.hm01.controller.ClienteControl;
import br.unimontes.hm01.model.Cliente;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lee
 */
public class TelaListarClientes extends javax.swing.JFrame {
    private ClienteControl Ct;
    public TelaListarClientes() {
        initComponents();
        try {
            Ct = new ClienteControl();
            Ct.carregar(jTableClientes);
            jTableClientes.getTableHeader().setReorderingAllowed(false);
        } catch (SQLException ex) {
            System.out.println("MeuDeus");
            Logger.getLogger(TelaListarClientes.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            btAtualizar.setVisible(false);
            cbExcluir.setVisible(false);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfSobrenome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfId = new javax.swing.JTextField();
        jID = new javax.swing.JLabel();
        btBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        btResetar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cbExcluir = new javax.swing.JCheckBox();
        jButton_Fechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(880, 500));
        setUndecorated(true);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(178, 153, 115));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBackground(new java.awt.Color(178, 153, 115));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Clientes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.setPreferredSize(new java.awt.Dimension(907, 567));

        jPanel2.setBackground(new java.awt.Color(178, 153, 115));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Nome:");

        tfNome.setMaximumSize(new java.awt.Dimension(6, 20));
        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Sobrenome:");

        Email.setText("Email:");

        jLabel5.setText("Telefone:");

        tfTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfTelefoneFocusGained(evt);
            }
        });

        tfEmail.setMaximumSize(new java.awt.Dimension(6, 20));

        tfId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfIdFocusGained(evt);
            }
        });

        jID.setText("ID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jID, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfSobrenome))
                .addGap(69, 69, 69))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfSobrenome)
                        .addComponent(jLabel3)))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email)
                    .addComponent(jLabel5)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jID))
                .addGap(54, 54, 54))
        );

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens.icons/search.png"))); // NOI18N
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Sobrenome", "Email", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClientes);

        btResetar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens.icons/reload (1).png"))); // NOI18N
        btResetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetarActionPerformed(evt);
            }
        });

        btAtualizar.setText("Update no Banco");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(178, 153, 115));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbExcluir.setText("Excluir");
        cbExcluir.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cbExcluirStateChanged(evt);
            }
        });
        cbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbExcluirActionPerformed(evt);
            }
        });
        jPanel3.add(cbExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 71, 27));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btResetar)
                        .addGap(126, 126, 126)
                        .addComponent(btBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAtualizar)
                        .addGap(37, 37, 37)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 832, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btResetar)
                            .addComponent(btBuscar)
                            .addComponent(btAtualizar))
                        .addGap(0, 39, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton_Fechar.setText("X");
        jButton_Fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_FecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_FecharMouseExited(evt);
            }
        });
        jButton_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_FecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_Fechar)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jButton_Fechar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTelefoneFocusGained

    }//GEN-LAST:event_tfTelefoneFocusGained

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        int id = -1;
        if(!"".equals(tfId.getText()))
            id = Integer.parseInt(tfId.getText());
        
        try {
            Ct.findSelected(new Cliente(id, tfNome.getText(), tfSobrenome.getText(), tfTelefone.getText(), tfEmail.getText()), this.jTableClientes);
        } catch (SQLException ex) {
            Logger.getLogger(TelaListarClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        int row = jTableClientes.getSelectedRow();
        String email = "", telefone = "";
                
        DefaultTableModel model = (DefaultTableModel) jTableClientes.getModel();
        tfId.setEditable(false);
        
        tfId.setText(model.getValueAt(row, 0).toString());
        tfNome.setText(model.getValueAt(row, 1).toString());
        tfSobrenome.setText(model.getValueAt(row, 2).toString());
        
        if(model.getValueAt(row, 3) != null) email = model.getValueAt(row, 3).toString();
        if(model.getValueAt(row, 4) != null) telefone = model.getValueAt(row, 4).toString();
        
            tfEmail.setText(email);
            tfTelefone.setText(telefone);
        
        btBuscar.setVisible(false);
        btAtualizar.setVisible(true);
        cbExcluir.setVisible(true);
    }//GEN-LAST:event_jTableClientesMouseClicked

    private void jTableClientesAtt(){
        int row = jTableClientes.getSelectedRow();
        String email = "", telefone = "";
        DefaultTableModel model = (DefaultTableModel) jTableClientes.getModel();
        
        tfId.setEditable(false);
        if(model.getValueAt(row, 3) != null) email = model.getValueAt(row, 3).toString();
        if(model.getValueAt(row, 4) != null) telefone = model.getValueAt(row, 4).toString();
        tfId.setText(model.getValueAt(row, 0).toString());
        tfNome.setText(model.getValueAt(row, 1).toString());
        tfSobrenome.setText(model.getValueAt(row, 2).toString());
        tfEmail.setText(email);
        tfTelefone.setText(telefone);
    }
    
    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void btResetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetarActionPerformed
        resetarTela();
    }//GEN-LAST:event_btResetarActionPerformed

    private void resetarTela(){
        Ct.carregar(jTableClientes);
        tfId.setEditable(true);
        btBuscar.setVisible(true);
        btAtualizar.setVisible(false);
        cbExcluir.setVisible(false);
        
        tfId.setText("");
        tfNome.setText("");
        tfSobrenome.setText("");
        tfTelefone.setText("");
        tfEmail.setText("");
    }
    
    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        try {
            if(cbExcluir.isSelected()){
                Ct.delete(new Cliente(Integer.parseInt(tfId.getText())));
            }
            else{
                if(tfNome.getText().equals("") || tfSobrenome.getText().equals("")){
                    JOptionPane.showMessageDialog(rootPane, "Erro!\nOs campos de nome ou sobrenome estão vazios!\nPreencha os dados corretamente", "Erro de Cadastro", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    Ct.update(new Cliente(Integer.parseInt(tfId.getText()), tfNome.getText(), tfSobrenome.getText(), tfTelefone.getText(), tfEmail.getText()));
                }
            }
        } catch (DAOException ex) {
            System.out.println("Baah " + ex.toString());
        } finally{
            resetarTela();
        }
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void tfIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfIdFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdFocusGained

    private void cbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbExcluirActionPerformed
        if(cbExcluir.isSelected() == true){
            tfNome.setEditable(false);
            tfSobrenome.setEditable(false);
            tfEmail.setEditable(false);
            tfTelefone.setEditable(false);
            jTableClientesAtt();
        }
        else{
            tfNome.setEditable(true);
            tfSobrenome.setEditable(true);
            tfEmail.setEditable(true);
            tfTelefone.setEditable(true);
        }
    }//GEN-LAST:event_cbExcluirActionPerformed

    private void cbExcluirStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cbExcluirStateChanged
        
    }//GEN-LAST:event_cbExcluirStateChanged

    private void jButton_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FecharActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_FecharActionPerformed

    private void jButton_FecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_FecharMouseEntered
        // TODO add your handling code here:
        jButton_Fechar.setBackground(Color.red);
        jButton_Fechar.setForeground(Color.white);
    }//GEN-LAST:event_jButton_FecharMouseEntered

    private void jButton_FecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_FecharMouseExited
        // TODO add your handling code here:
        jButton_Fechar.setBackground(Color.white);
        jButton_Fechar.setForeground(Color.black);
    }//GEN-LAST:event_jButton_FecharMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaListarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Email;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btResetar;
    private javax.swing.JCheckBox cbExcluir;
    private javax.swing.JButton jButton_Fechar;
    private javax.swing.JLabel jID;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSobrenome;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
