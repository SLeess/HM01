
package br.unimontes.hm01.view;

import br.unimontes.hm01.DAO.DAOException;
import br.unimontes.hm01.controller.FuncionarioControl;
import br.unimontes.hm01.interfaces.JTextFieldLimit;
import br.unimontes.hm01.model.Funcionario;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaCadastrarFuncionario extends javax.swing.JFrame {

    public TelaCadastrarFuncionario() {
        initComponents();
        tfCPF.setDocument(new JTextFieldLimit(11));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Borda = new javax.swing.JPanel();
        jPanel_TelaCadastrarFuncionario = new javax.swing.JPanel();
        jLabel_CPF = new javax.swing.JLabel();
        tfCPF = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        jLabel_Nome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton_Enviar = new javax.swing.JButton();
        jButton_Cancelar = new javax.swing.JButton();
        jButton_Limpar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton_Fechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Funcionário");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        jPanel_Borda.setBackground(new java.awt.Color(178, 153, 115));
        jPanel_Borda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel_TelaCadastrarFuncionario.setBackground(new java.awt.Color(178, 153, 115));
        jPanel_TelaCadastrarFuncionario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Novo Funcionário", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel_CPF.setText("CPF:");

        jLabel_Nome.setText("Nome:");

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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens.icons/hairstyle.icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_TelaCadastrarFuncionarioLayout = new javax.swing.GroupLayout(jPanel_TelaCadastrarFuncionario);
        jPanel_TelaCadastrarFuncionario.setLayout(jPanel_TelaCadastrarFuncionarioLayout);
        jPanel_TelaCadastrarFuncionarioLayout.setHorizontalGroup(
            jPanel_TelaCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TelaCadastrarFuncionarioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel_TelaCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jButton_Cancelar))
                .addGap(26, 26, 26)
                .addGroup(jPanel_TelaCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_TelaCadastrarFuncionarioLayout.createSequentialGroup()
                        .addComponent(jLabel_Nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_TelaCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_TelaCadastrarFuncionarioLayout.createSequentialGroup()
                                .addComponent(tfNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel_TelaCadastrarFuncionarioLayout.createSequentialGroup()
                                .addComponent(tfCPF)
                                .addGap(6, 6, 6)))
                        .addGroup(jPanel_TelaCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(jPanel_TelaCadastrarFuncionarioLayout.createSequentialGroup()
                        .addGroup(jPanel_TelaCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_CPF)
                            .addGroup(jPanel_TelaCadastrarFuncionarioLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jButton_Limpar)))
                        .addGap(36, 36, 36)
                        .addComponent(jButton_Enviar)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel_TelaCadastrarFuncionarioLayout.setVerticalGroup(
            jPanel_TelaCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TelaCadastrarFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_TelaCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_TelaCadastrarFuncionarioLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(jPanel_TelaCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Enviar)
                            .addComponent(jButton_Cancelar)
                            .addComponent(jButton_Limpar))
                        .addContainerGap())
                    .addGroup(jPanel_TelaCadastrarFuncionarioLayout.createSequentialGroup()
                        .addGroup(jPanel_TelaCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_CPF)
                            .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_TelaCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Nome)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                    .addComponent(jPanel_TelaCadastrarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jPanel_TelaCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel_Borda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelarActionPerformed
        // TODO add your handling code here:
        //jTextField_CPF.setText("");
        //jTextField_Nome.setText("");
        this.dispose();
    }//GEN-LAST:event_jButton_CancelarActionPerformed

    private void jButton_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LimparActionPerformed
        // TODO add your handling code here:
        tfCPF.setText("");
        tfNome.setText("");
    }//GEN-LAST:event_jButton_LimparActionPerformed

    private void jButton_EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EnviarActionPerformed
        if(tfCPF.getText().equals("") || tfNome.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Erro!\nOs campos de nome ou CPF estão escrivos indevidamente!\nPreencha os dados corretamente", "Erro de Cadastro", JOptionPane.WARNING_MESSAGE);
        }
        else{
            try {
                FuncionarioControl fc = new FuncionarioControl();
                fc.save(new Funcionario(tfCPF.getText(), tfNome.getText()));
                tfNome.setText("");
                tfCPF.setText("");
            } catch (DAOException | SQLException ex) {
                System.out.println("Funcionario " + ex.toString());
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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastrarFuncionario().setVisible(true);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_CPF;
    private javax.swing.JLabel jLabel_Nome;
    private javax.swing.JPanel jPanel_Borda;
    private javax.swing.JPanel jPanel_TelaCadastrarFuncionario;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
