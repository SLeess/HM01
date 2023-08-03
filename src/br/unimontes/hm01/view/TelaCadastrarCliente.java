package br.unimontes.hm01.view;

import br.unimontes.hm01.DAO.DAOException;
import br.unimontes.hm01.controller.ClienteControl;
import br.unimontes.hm01.interfaces.*;
import static br.unimontes.hm01.interfaces.LimitaCaracteres.TipoEntrada.*;
import br.unimontes.hm01.model.Cliente;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author wende
 */
public class TelaCadastrarCliente extends javax.swing.JFrame {
    public TelaCadastrarCliente() {
        initComponents();
        tfNome.setDocument(new LimitaCaracteres(20, NOME));
        tfSobrenome.setDocument(new LimitaCaracteres(50, NOME));
        tfEmail.setDocument(new LimitaCaracteres(100, EMAIL));
        tfTelefone.setDocument(new LimitaCaracteres(15, NUM));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Borda = new javax.swing.JPanel();
        jPanel_TelaCadastrarCliente = new javax.swing.JPanel();
        jLabel_Nome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel_Sobrenome = new javax.swing.JLabel();
        tfSobrenome = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        jLabel_Email = new javax.swing.JLabel();
        jLabel_Telefone = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jEnviar = new javax.swing.JButton();
        jCancelar = new javax.swing.JButton();
        jLimpar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton_Fechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Cliente");
        setUndecorated(true);
        setResizable(false);

        jPanel_Borda.setBackground(new java.awt.Color(178, 153, 115));
        jPanel_Borda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel_Borda.setToolTipText("");

        jPanel_TelaCadastrarCliente.setBackground(new java.awt.Color(178, 153, 115));
        jPanel_TelaCadastrarCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Novo Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel_Nome.setText("Nome:");

        jLabel_Sobrenome.setText("Sobrenome:");

        jLabel_Email.setText("E-mail:");

        jLabel_Telefone.setText("Telefone:");

        jLabel1.setText("*");

        jLabel2.setText("*");

        jEnviar.setText("Enviar");
        jEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEnviarMouseClicked(evt);
            }
        });
        jEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEnviarActionPerformed(evt);
            }
        });

        jCancelar.setText("Cancelar");
        jCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelarActionPerformed(evt);
            }
        });

        jLimpar.setText("Limpar");
        jLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimparActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens.icons/hair-cut.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_TelaCadastrarClienteLayout = new javax.swing.GroupLayout(jPanel_TelaCadastrarCliente);
        jPanel_TelaCadastrarCliente.setLayout(jPanel_TelaCadastrarClienteLayout);
        jPanel_TelaCadastrarClienteLayout.setHorizontalGroup(
            jPanel_TelaCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TelaCadastrarClienteLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel_TelaCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_TelaCadastrarClienteLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(jPanel_TelaCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TelaCadastrarClienteLayout.createSequentialGroup()
                                .addComponent(jLabel_Telefone)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TelaCadastrarClienteLayout.createSequentialGroup()
                                .addComponent(jLabel_Sobrenome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel_TelaCadastrarClienteLayout.createSequentialGroup()
                                .addGroup(jPanel_TelaCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Nome)
                                    .addComponent(jLabel_Email))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(jPanel_TelaCadastrarClienteLayout.createSequentialGroup()
                        .addComponent(jCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel_TelaCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_TelaCadastrarClienteLayout.createSequentialGroup()
                        .addComponent(jLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(jEnviar))
                    .addComponent(tfTelefone)
                    .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfSobrenome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfNome, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_TelaCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel_TelaCadastrarClienteLayout.setVerticalGroup(
            jPanel_TelaCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TelaCadastrarClienteLayout.createSequentialGroup()
                .addGroup(jPanel_TelaCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_TelaCadastrarClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel_TelaCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Nome)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGroup(jPanel_TelaCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_TelaCadastrarClienteLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel2))
                            .addGroup(jPanel_TelaCadastrarClienteLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_TelaCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Sobrenome))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_TelaCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Email))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_TelaCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Telefone)))
                    .addGroup(jPanel_TelaCadastrarClienteLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel_TelaCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCancelar)
                    .addComponent(jLimpar)
                    .addComponent(jEnviar))
                .addContainerGap())
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

        javax.swing.GroupLayout jPanel_BordaLayout = new javax.swing.GroupLayout(jPanel_Borda);
        jPanel_Borda.setLayout(jPanel_BordaLayout);
        jPanel_BordaLayout.setHorizontalGroup(
            jPanel_BordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BordaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_BordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_TelaCadastrarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BordaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_Fechar)))
                .addContainerGap())
        );
        jPanel_BordaLayout.setVerticalGroup(
            jPanel_BordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BordaLayout.createSequentialGroup()
                .addComponent(jButton_Fechar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_TelaCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Borda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Borda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jCancelarActionPerformed

    private void jLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimparActionPerformed
        // TODO add your handling code here:
        tfNome.setText("");
        tfSobrenome.setText("");
        tfEmail.setText("");
        tfTelefone.setText("");
    }//GEN-LAST:event_jLimparActionPerformed

    private void jEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEnviarMouseClicked
        
    }//GEN-LAST:event_jEnviarMouseClicked

    private void jEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEnviarActionPerformed
        int save = 0; String email = null, telefone = null;
        if(tfNome.getText().equals("") || tfSobrenome.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Erro!\nOs campos de nome ou sobrenome estão vazios!\nPreencha os dados corretamente", "Erro de Cadastro", JOptionPane.WARNING_MESSAGE);
        }
        else{
            if(!tfEmail.getText().equals("")) email = tfEmail.getText();
            if(!tfTelefone.getText().equals("")) telefone = tfTelefone.getText();
            try {
                ClienteControl c = new ClienteControl();
                save = c.save(new Cliente(tfNome.getText(), tfSobrenome.getText(), telefone, email));
                tfNome.setText("");
                tfSobrenome.setText("");
                tfEmail.setText("");
                tfTelefone.setText("");
            } catch (DAOException | SQLException ex) {
                    System.out.println("AQUI11111");
                    Logger.getLogger(TelaCadastrarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastrarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Fechar;
    private javax.swing.JButton jCancelar;
    private javax.swing.JButton jEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_Nome;
    private javax.swing.JLabel jLabel_Sobrenome;
    private javax.swing.JLabel jLabel_Telefone;
    private javax.swing.JButton jLimpar;
    private javax.swing.JPanel jPanel_Borda;
    private javax.swing.JPanel jPanel_TelaCadastrarCliente;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSobrenome;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
