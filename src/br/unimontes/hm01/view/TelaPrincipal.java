/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.unimontes.hm01.view;


public class TelaPrincipal extends javax.swing.JFrame {
    int xMouse, yMouse;
    TelaCadastrarCliente telaCadastrarCliente;
    TelaCadastrarServico telaCadastrarServico;
    TelaCadastrarFuncionario telaCadastrarFuncionario;
    TelaListarClientes telaListarClientes;
    TelaMuintoObrigado telaMuintoObrigado;

    
    public TelaPrincipal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCentral = new javax.swing.JPanel();
        jLabel_Imagem = new javax.swing.JLabel();
        jMenuFuncionalidades = new javax.swing.JMenuBar();
        jMenu_Icon = new javax.swing.JMenu();
        jMenuItem_MuintoObrigado = new javax.swing.JMenuItem();
        jMenu_Ferramentas = new javax.swing.JMenu();
        jMenu_Cliente = new javax.swing.JMenu();
        jMenuItem_CadastrarCliente = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu_Funcionario = new javax.swing.JMenu();
        jMenuItem_CadastrarFuncionario = new javax.swing.JMenuItem();
        jMenu_Servico = new javax.swing.JMenu();
        jMenuItem_CadastrarServico = new javax.swing.JMenuItem();
        jMenu_Sobre = new javax.swing.JMenu();
        btSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HM01 - not null");
        setIconImages(null);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(880, 500));
        setMinimumSize(new java.awt.Dimension(880, 500));
        setName("TelaPrincipal"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(880, 500));
        setResizable(false);

        jPanelCentral.setBackground(new java.awt.Color(178, 153, 115));
        jPanelCentral.setPreferredSize(new java.awt.Dimension(880, 500));

        jLabel_Imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens.icons/stylist (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCentralLayout.createSequentialGroup()
                .addContainerGap(292, Short.MAX_VALUE)
                .addComponent(jLabel_Imagem)
                .addGap(172, 172, 172))
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel_Imagem)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jMenuFuncionalidades.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenuFuncionalidadesMouseDragged(evt);
            }
        });
        jMenuFuncionalidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuFuncionalidadesMousePressed(evt);
            }
        });

        jMenu_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens.icons/barber-pole.png"))); // NOI18N
        jMenu_Icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_IconActionPerformed(evt);
            }
        });

        jMenuItem_MuintoObrigado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_MuintoObrigadoActionPerformed(evt);
            }
        });
        jMenu_Icon.add(jMenuItem_MuintoObrigado);

        jMenuFuncionalidades.add(jMenu_Icon);

        jMenu_Ferramentas.setText("Ferramentas");
        jMenu_Ferramentas.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        jMenu_Cliente.setText("Cliente");

        jMenuItem_CadastrarCliente.setText("Cadastrar Cliente");
        jMenuItem_CadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_CadastrarClienteActionPerformed(evt);
            }
        });
        jMenu_Cliente.add(jMenuItem_CadastrarCliente);

        jMenuItem1.setText("Listar Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu_Cliente.add(jMenuItem1);

        jMenu_Ferramentas.add(jMenu_Cliente);

        jMenu_Funcionario.setText("Funcionário");

        jMenuItem_CadastrarFuncionario.setText("Cadastrar Funcionário");
        jMenuItem_CadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_CadastrarFuncionarioActionPerformed(evt);
            }
        });
        jMenu_Funcionario.add(jMenuItem_CadastrarFuncionario);

        jMenu_Ferramentas.add(jMenu_Funcionario);

        jMenu_Servico.setText("Serviço");

        jMenuItem_CadastrarServico.setText("Cadastrar Serviço");
        jMenuItem_CadastrarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_CadastrarServicoActionPerformed(evt);
            }
        });
        jMenu_Servico.add(jMenuItem_CadastrarServico);

        jMenu_Ferramentas.add(jMenu_Servico);

        jMenuFuncionalidades.add(jMenu_Ferramentas);

        jMenu_Sobre.setText("Sobre");
        jMenu_Sobre.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jMenuFuncionalidades.add(jMenu_Sobre);

        btSair.setText("Sair");
        btSair.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        btSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btSairMousePressed(evt);
            }
        });
        jMenuFuncionalidades.add(btSair);

        setJMenuBar(jMenuFuncionalidades);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_CadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_CadastrarClienteActionPerformed
        // TODO add your handling code here:
        telaCadastrarCliente = new TelaCadastrarCliente();
        telaCadastrarCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem_CadastrarClienteActionPerformed

    private void jMenuItem_CadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_CadastrarFuncionarioActionPerformed
        // TODO add your handling code here:
        telaCadastrarFuncionario = new TelaCadastrarFuncionario();
        telaCadastrarFuncionario.setVisible(true);
    }//GEN-LAST:event_jMenuItem_CadastrarFuncionarioActionPerformed

    private void jMenuItem_CadastrarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_CadastrarServicoActionPerformed
        // TODO add your handling code here:
        telaCadastrarServico = new TelaCadastrarServico();
        telaCadastrarServico.setVisible(true);
    }//GEN-LAST:event_jMenuItem_CadastrarServicoActionPerformed

    private void btSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMousePressed
        System.exit(1);
    }//GEN-LAST:event_btSairMousePressed

    private void jMenuFuncionalidadesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuFuncionalidadesMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jMenuFuncionalidadesMousePressed

    private void jMenuFuncionalidadesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuFuncionalidadesMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jMenuFuncionalidadesMouseDragged

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        telaListarClientes = new TelaListarClientes();
        telaListarClientes.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu_IconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_IconActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu_IconActionPerformed

    private void jMenuItem_MuintoObrigadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_MuintoObrigadoActionPerformed
        // TODO add your handling code here:
        telaMuintoObrigado = new TelaMuintoObrigado();
        telaMuintoObrigado.setVisible(true);
    }//GEN-LAST:event_jMenuItem_MuintoObrigadoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btSair;
    private javax.swing.JLabel jLabel_Imagem;
    private javax.swing.JMenuBar jMenuFuncionalidades;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem_CadastrarCliente;
    private javax.swing.JMenuItem jMenuItem_CadastrarFuncionario;
    private javax.swing.JMenuItem jMenuItem_CadastrarServico;
    private javax.swing.JMenuItem jMenuItem_MuintoObrigado;
    private javax.swing.JMenu jMenu_Cliente;
    private javax.swing.JMenu jMenu_Ferramentas;
    private javax.swing.JMenu jMenu_Funcionario;
    private javax.swing.JMenu jMenu_Icon;
    private javax.swing.JMenu jMenu_Servico;
    private javax.swing.JMenu jMenu_Sobre;
    private javax.swing.JPanel jPanelCentral;
    // End of variables declaration//GEN-END:variables
}
