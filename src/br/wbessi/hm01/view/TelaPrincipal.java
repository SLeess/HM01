package br.wbessi.hm01.view;

import java.awt.Color;

/**
 *
 * @author Lee
 */
public class TelaPrincipal extends javax.swing.JFrame {
    int xMouse, yMouse;
    
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal = new javax.swing.JPanel();
        iconHM01 = new javax.swing.JPanel();
        ICON = new javax.swing.JLabel();
        barraBotoes = new javax.swing.JPanel();
        btCliente = new javax.swing.JPanel();
        txtCliente = new javax.swing.JLabel();
        btFuncionario = new javax.swing.JPanel();
        txtFuncionario = new javax.swing.JLabel();
        btServicos = new javax.swing.JPanel();
        txtServicos = new javax.swing.JLabel();
        jPbarraArrastavel = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        menuGeral = new javax.swing.JPanel();
        jPanel_Horarios3 = new javax.swing.JPanel();
        jPainel_Registros = new javax.swing.JScrollPane();
        jTable_Agenda = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema HM01");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(880, 500));
        setResizable(false);

        PainelPrincipal.setMaximumSize(new java.awt.Dimension(800, 600));
        PainelPrincipal.setMinimumSize(new java.awt.Dimension(800, 600));
        PainelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconHM01.setOpaque(false);

        ICON.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ICON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens.icons/cliente_icon.png"))); // NOI18N

        javax.swing.GroupLayout iconHM01Layout = new javax.swing.GroupLayout(iconHM01);
        iconHM01.setLayout(iconHM01Layout);
        iconHM01Layout.setHorizontalGroup(
            iconHM01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ICON, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        iconHM01Layout.setVerticalGroup(
            iconHM01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ICON, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        PainelPrincipal.add(iconHM01, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        barraBotoes.setOpaque(false);
        barraBotoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btCliente.setBackground(new java.awt.Color(248, 248, 248));
        btCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btCliente.setMaximumSize(new java.awt.Dimension(50, 30));
        btCliente.setMinimumSize(new java.awt.Dimension(50, 30));
        btCliente.setPreferredSize(new java.awt.Dimension(50, 30));
        btCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btClienteMouseEntered(evt);
            }
        });

        txtCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCliente.setText("Cliente");
        txtCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtCliente.setMaximumSize(new java.awt.Dimension(50, 30));
        txtCliente.setMinimumSize(new java.awt.Dimension(35, 15));
        txtCliente.setPreferredSize(new java.awt.Dimension(35, 15));
        txtCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtClienteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btClienteLayout = new javax.swing.GroupLayout(btCliente);
        btCliente.setLayout(btClienteLayout);
        btClienteLayout.setHorizontalGroup(
            btClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        btClienteLayout.setVerticalGroup(
            btClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        barraBotoes.add(btCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 50, 30));

        btFuncionario.setBackground(new java.awt.Color(248, 248, 248));
        btFuncionario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btFuncionario.setMaximumSize(new java.awt.Dimension(50, 30));
        btFuncionario.setMinimumSize(new java.awt.Dimension(50, 30));

        txtFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFuncionario.setText("Funcionário");
        txtFuncionario.setMaximumSize(new java.awt.Dimension(50, 30));
        txtFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtFuncionarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFuncionarioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btFuncionarioLayout = new javax.swing.GroupLayout(btFuncionario);
        btFuncionario.setLayout(btFuncionarioLayout);
        btFuncionarioLayout.setHorizontalGroup(
            btFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        btFuncionarioLayout.setVerticalGroup(
            btFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        barraBotoes.add(btFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 70, 30));

        btServicos.setBackground(new java.awt.Color(248, 248, 248));
        btServicos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btServicos.setMaximumSize(new java.awt.Dimension(50, 30));
        btServicos.setMinimumSize(new java.awt.Dimension(50, 30));

        txtServicos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtServicos.setText("Serviços");
        txtServicos.setMaximumSize(new java.awt.Dimension(50, 30));
        txtServicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtServicosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtServicosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btServicosLayout = new javax.swing.GroupLayout(btServicos);
        btServicos.setLayout(btServicosLayout);
        btServicosLayout.setHorizontalGroup(
            btServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtServicos, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );
        btServicosLayout.setVerticalGroup(
            btServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtServicos, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        barraBotoes.add(btServicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 60, 30));

        PainelPrincipal.add(barraBotoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 30));

        jPbarraArrastavel.setBackground(new java.awt.Color(250, 250, 250));
        jPbarraArrastavel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPbarraArrastavelMouseDragged(evt);
            }
        });
        jPbarraArrastavel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPbarraArrastavelMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPbarraArrastavelMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(204, 255, 255));
        exitBtn.setToolTipText("");
        exitBtn.setMaximumSize(new java.awt.Dimension(30, 30));
        exitBtn.setMinimumSize(new java.awt.Dimension(30, 30));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitTxtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPbarraArrastavelLayout = new javax.swing.GroupLayout(jPbarraArrastavel);
        jPbarraArrastavel.setLayout(jPbarraArrastavelLayout);
        jPbarraArrastavelLayout.setHorizontalGroup(
            jPbarraArrastavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPbarraArrastavelLayout.createSequentialGroup()
                .addContainerGap(850, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPbarraArrastavelLayout.setVerticalGroup(
            jPbarraArrastavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPbarraArrastavelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        PainelPrincipal.add(jPbarraArrastavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 30));

        menuGeral.setBackground(new java.awt.Color(144, 119, 89));

        jPanel_Horarios3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agenda", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel_Horarios3.setMaximumSize(new java.awt.Dimension(350, 450));
        jPanel_Horarios3.setMinimumSize(new java.awt.Dimension(350, 450));
        jPanel_Horarios3.setPreferredSize(new java.awt.Dimension(350, 450));

        jPainel_Registros.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, null, null));

        jTable_Agenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", null, null},
                {null, "", null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cliente", "Data", "Horário", "Funcionário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Agenda.setMaximumSize(new java.awt.Dimension(300, 64));
        jTable_Agenda.setMinimumSize(new java.awt.Dimension(300, 64));
        jTable_Agenda.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jPainel_Registros.setViewportView(jTable_Agenda);

        javax.swing.GroupLayout jPanel_Horarios3Layout = new javax.swing.GroupLayout(jPanel_Horarios3);
        jPanel_Horarios3.setLayout(jPanel_Horarios3Layout);
        jPanel_Horarios3Layout.setHorizontalGroup(
            jPanel_Horarios3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Horarios3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPainel_Registros, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_Horarios3Layout.setVerticalGroup(
            jPanel_Horarios3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Horarios3Layout.createSequentialGroup()
                .addComponent(jPainel_Registros, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuGeralLayout = new javax.swing.GroupLayout(menuGeral);
        menuGeral.setLayout(menuGeralLayout);
        menuGeralLayout.setHorizontalGroup(
            menuGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuGeralLayout.createSequentialGroup()
                .addContainerGap(471, Short.MAX_VALUE)
                .addComponent(jPanel_Horarios3, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        menuGeralLayout.setVerticalGroup(
            menuGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuGeralLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel_Horarios3, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        PainelPrincipal.add(menuGeral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 880, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPbarraArrastavelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPbarraArrastavelMouseEntered
        
    }//GEN-LAST:event_jPbarraArrastavelMouseEntered

    private void jPbarraArrastavelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPbarraArrastavelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPbarraArrastavelMousePressed

    private void jPbarraArrastavelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPbarraArrastavelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPbarraArrastavelMouseDragged

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(new Color(204,204,204));
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void exitTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMousePressed
        System.exit(1);
    }//GEN-LAST:event_exitTxtMousePressed

    private void btClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btClienteMouseEntered
        
    }//GEN-LAST:event_btClienteMouseEntered

    private void txtClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtClienteMouseExited
        btCliente.setBackground(new Color(249,249,249));
    }//GEN-LAST:event_txtClienteMouseExited

    private void txtClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtClienteMouseEntered
        btCliente.setBackground(new Color(180,180,180));
    }//GEN-LAST:event_txtClienteMouseEntered

    private void txtFuncionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFuncionarioMouseEntered
        btFuncionario.setBackground(new Color(180,180,180));
    }//GEN-LAST:event_txtFuncionarioMouseEntered

    private void txtFuncionarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFuncionarioMouseExited
        btFuncionario.setBackground(new Color(249,249,249));
    }//GEN-LAST:event_txtFuncionarioMouseExited

    private void txtServicosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtServicosMouseEntered
        btServicos.setBackground(new Color(180,180,180));
    }//GEN-LAST:event_txtServicosMouseEntered

    private void txtServicosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtServicosMouseExited
        btServicos.setBackground(new Color(249,249,249));
    }//GEN-LAST:event_txtServicosMouseExited

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
    private javax.swing.JLabel ICON;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JPanel barraBotoes;
    private javax.swing.JPanel btCliente;
    private javax.swing.JPanel btFuncionario;
    private javax.swing.JPanel btServicos;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel iconHM01;
    private javax.swing.JScrollPane jPainel_Registros;
    private javax.swing.JPanel jPanel_Horarios3;
    private javax.swing.JPanel jPbarraArrastavel;
    private javax.swing.JTable jTable_Agenda;
    private javax.swing.JPanel menuGeral;
    private javax.swing.JLabel txtCliente;
    private javax.swing.JLabel txtFuncionario;
    private javax.swing.JLabel txtServicos;
    // End of variables declaration//GEN-END:variables
}
