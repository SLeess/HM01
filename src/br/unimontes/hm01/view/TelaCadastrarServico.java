
package br.unimontes.hm01.view;

import br.unimontes.hm01.DAO.DAOException;
import br.unimontes.hm01.controller.ServicoControl;
import br.unimontes.hm01.interfaces.JTextFieldLimit;
import br.unimontes.hm01.model.Servico;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaCadastrarServico extends javax.swing.JFrame {
    public TelaCadastrarServico() {
        initComponents();
        tfDescricao.setDocument(new JTextFieldLimit(255));
        tfNome.setDocument(new JTextFieldLimit(20));
        tfPreco.setDocument(new JTextFieldLimit(6));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Borda = new javax.swing.JPanel();
        jPanel_TelaCadastrarServico = new javax.swing.JPanel();
        jLabel_Nome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel_Descricao = new javax.swing.JLabel();
        tfPreco = new javax.swing.JTextField();
        jLabel_Preco = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfDescricao = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton_Enviar = new javax.swing.JButton();
        jButton_Cancelar = new javax.swing.JButton();
        jButton_Limpar = new javax.swing.JButton();
        jPanel_icones = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton_Fechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Serviço");
        setUndecorated(true);
        setResizable(false);

        jPanel_Borda.setBackground(new java.awt.Color(178, 153, 115));
        jPanel_Borda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel_TelaCadastrarServico.setBackground(new java.awt.Color(178, 153, 115));
        jPanel_TelaCadastrarServico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Novo Serviço", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel_Nome.setText("Nome:");

        jLabel_Descricao.setText("Descrição:");

        tfPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrecoActionPerformed(evt);
            }
        });

        jLabel_Preco.setText("Preço:");

        tfDescricao.setColumns(20);
        tfDescricao.setRows(5);
        jScrollPane1.setViewportView(tfDescricao);

        jLabel1.setText("*");

        jLabel2.setText("*");

        jButton_Enviar.setText("Enviar");
        jButton_Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EnviarActionPerformed(evt);
            }
        });

        jButton_Cancelar.setText("Cancelar");
        jButton_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelarActionPerformed(evt);
            }
        });

        jButton_Limpar.setText("Limpar");
        jButton_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LimparActionPerformed(evt);
            }
        });

        jPanel_icones.setBackground(new java.awt.Color(178, 153, 115));
        jPanel_icones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens.icons/comb.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens.icons/hair-dryer.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens.icons/scissor.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens.icons/shaving-brush.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens.icons/stylist (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel_iconesLayout = new javax.swing.GroupLayout(jPanel_icones);
        jPanel_icones.setLayout(jPanel_iconesLayout);
        jPanel_iconesLayout.setHorizontalGroup(
            jPanel_iconesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_iconesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_iconesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_iconesLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel_iconesLayout.createSequentialGroup()
                        .addGroup(jPanel_iconesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_iconesLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(jPanel_iconesLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel7))
                            .addGroup(jPanel_iconesLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel_iconesLayout.setVerticalGroup(
            jPanel_iconesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_iconesLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_iconesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_iconesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel_TelaCadastrarServicoLayout = new javax.swing.GroupLayout(jPanel_TelaCadastrarServico);
        jPanel_TelaCadastrarServico.setLayout(jPanel_TelaCadastrarServicoLayout);
        jPanel_TelaCadastrarServicoLayout.setHorizontalGroup(
            jPanel_TelaCadastrarServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TelaCadastrarServicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_TelaCadastrarServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_TelaCadastrarServicoLayout.createSequentialGroup()
                        .addComponent(jButton_Cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Enviar))
                    .addGroup(jPanel_TelaCadastrarServicoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel_icones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel_TelaCadastrarServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Descricao)
                            .addComponent(jLabel_Nome)
                            .addComponent(jLabel_Preco))
                        .addGroup(jPanel_TelaCadastrarServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TelaCadastrarServicoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_TelaCadastrarServicoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel_TelaCadastrarServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton_Limpar)
                                    .addGroup(jPanel_TelaCadastrarServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                        .addComponent(tfPreco)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_TelaCadastrarServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel_TelaCadastrarServicoLayout.setVerticalGroup(
            jPanel_TelaCadastrarServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TelaCadastrarServicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_TelaCadastrarServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_TelaCadastrarServicoLayout.createSequentialGroup()
                        .addGroup(jPanel_TelaCadastrarServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Nome)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel_TelaCadastrarServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Descricao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_TelaCadastrarServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Preco)
                            .addComponent(jLabel2)))
                    .addComponent(jPanel_icones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel_TelaCadastrarServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Enviar)
                    .addComponent(jButton_Cancelar)
                    .addComponent(jButton_Limpar))
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
                    .addComponent(jPanel_TelaCadastrarServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jPanel_TelaCadastrarServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Borda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Borda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelarActionPerformed
        // TODO add your handling code here:
        tfNome.setText("");
        tfDescricao.setText("");
        tfPreco.setText("");
        this.dispose();
    }//GEN-LAST:event_jButton_CancelarActionPerformed

    private void tfPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPrecoActionPerformed

    private void jButton_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LimparActionPerformed
        tfNome.setText("");
        tfDescricao.setText("");
        tfPreco.setText("");
    }//GEN-LAST:event_jButton_LimparActionPerformed

    private void jButton_EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EnviarActionPerformed
        String descricao = null;
        if(tfNome.getText().equals("") || tfPreco.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Erro!\nOs campos de nome, preço ou descrição estão vazios!\nPreencha os dados corretamente", "Erro de Cadastro", JOptionPane.WARNING_MESSAGE);
        }
        else{
            if(!tfDescricao.getText().equals("")) descricao = tfDescricao.getText();
            
            try {
                ServicoControl c = new ServicoControl();
                c.save(new Servico(null, tfNome.getText(), descricao, Float.parseFloat(tfPreco.getText())));
                tfNome.setText("");
                tfDescricao.setText("");
                tfPreco.setText("");
            } catch (DAOException | SQLException ex) {
                    System.out.println("Servico " + ex.toString());
            }
        }
    }//GEN-LAST:event_jButton_EnviarActionPerformed

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

    private void jButton_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FecharActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_FecharActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastrarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastrarServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cancelar;
    private javax.swing.JButton jButton_Enviar;
    private javax.swing.JButton jButton_Fechar;
    private javax.swing.JButton jButton_Limpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Descricao;
    private javax.swing.JLabel jLabel_Nome;
    private javax.swing.JLabel jLabel_Preco;
    private javax.swing.JPanel jPanel_Borda;
    private javax.swing.JPanel jPanel_TelaCadastrarServico;
    private javax.swing.JPanel jPanel_icones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tfDescricao;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPreco;
    // End of variables declaration//GEN-END:variables
}
