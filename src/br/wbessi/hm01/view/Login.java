package br.wbessi.hm01.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Login extends javax.swing.JFrame{
    int xMouse, yMouse;
    
    //private JTextField messageTxt;
    Timer timer;
    private final int qtd = 6;
    private final int messageTxtX = 60;
    private final int messageTxtY = 370;
    private int vibrationCount;
            
    public Login() {
        initComponents();
        
        //messageTxt = new JTextField(20);
        messageTxt.setEditable(false);
        messageTxt.setForeground(Color.RED);
        messageTxt.setVisible(false);
        //add(messageTxt);
        
        userTxt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Verifica se o caractere digitado é aceito
                messageTxt.setVisible(false);
                messageTxt.setLocation(60,370);
                char character = e.getKeyChar();
                String regex = "[a-zA-Z0-9_]";
                
                if (String.valueOf(character).matches(regex)) {
                    // Acrescenta o caractere ao textField
                    userTxt.setText(userTxt.getText() + character);
                }
                else{
                    exibirMensagem("Caractere inválido!");
                }
                e.consume(); // Ignora o caractere digitado
            }
            
            @Override
            public void keyPressed(KeyEvent e) {
                // Não é necessário implementar nada aqui
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Não é necessário implementar nada aqui
            }
        });
        
        // Configuração do Timer para o efeito de vibração
        timer = new Timer(50, new ActionListener() {
            private int offsetX = 0;
            private boolean moveRight = true;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (vibrationCount >= 8) {
                    // Finaliza o efeito de vibração após um certo número de iterações
                    stopVibration();
                } else {
                    // Move o JTextField para a esquerda e para a direita
                    if (moveRight) {
                        messageTxt.setLocation(messageTxt.getX() + qtd, messageTxt.getY());
                        offsetX += qtd;
                    } else {
                        messageTxt.setLocation(messageTxt.getX() - qtd, messageTxt.getY());
                        offsetX -= qtd;
                    }

                    // Inverte a direção do movimento quando alcançar um deslocamento máximo
                    if (Math.abs(offsetX) >= 10) {
                        moveRight = !moveRight;
                        vibrationCount++;
                    }
                }
            }
        });
        timer.setRepeats(false);
    }
    
    public void exibirMensagem(String mensagem) {
        messageTxt.setText(mensagem);
        messageTxt.setVisible(true);
        timer.restart();
    }
    
    public void startVibration() {
        vibrationCount = 0;
        timer.start();
    }

    public void stopVibration() {
        timer.stop();
        messageTxt.setLocation(messageTxtX, messageTxtY);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        barraFuncionalidades = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        logoname = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        jLogo = new javax.swing.JLabel();
        jSessao = new javax.swing.JLabel();
        jUsuario = new javax.swing.JLabel();
        separatorLogin = new javax.swing.JSeparator();
        userTxt = new javax.swing.JTextField();
        jSenha = new javax.swing.JLabel();
        separatorLogin1 = new javax.swing.JSeparator();
        passTxt = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JPanel();
        loginBtnTxt = new javax.swing.JLabel();
        messageTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login HM01 System");
        setAutoRequestFocus(false);
        setLocationByPlatform(true);
        setName("fPrincipal"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setName(""); // NOI18N
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraFuncionalidades.setBackground(new java.awt.Color(255, 255, 255));
        barraFuncionalidades.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        barraFuncionalidades.setOpaque(false);
        barraFuncionalidades.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraFuncionalidadesMouseDragged(evt);
            }
        });
        barraFuncionalidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraFuncionalidadesMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barraFuncionalidadesLayout = new javax.swing.GroupLayout(barraFuncionalidades);
        barraFuncionalidades.setLayout(barraFuncionalidadesLayout);
        barraFuncionalidadesLayout.setHorizontalGroup(
            barraFuncionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraFuncionalidadesLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 840, Short.MAX_VALUE))
        );
        barraFuncionalidadesLayout.setVerticalGroup(
            barraFuncionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraFuncionalidadesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(barraFuncionalidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 40));

        logoname.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        logoname.setForeground(new java.awt.Color(255, 255, 255));
        logoname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoname.setText("HM01 System");
        bg.add(logoname, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 290, -1));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens.icons/barbeirao.png"))); // NOI18N
        bg.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 290, 160));

        city.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens.icons/city.png"))); // NOI18N
        city.setText("jLabel1");
        bg.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 290, 500));

        jLogo.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens.icons/favicon.png"))); // NOI18N
        jLogo.setText("LOGO");
        bg.add(jLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 130, 50));

        jSessao.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jSessao.setText("INICIAR SESSÃO");
        bg.add(jSessao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 210, 30));

        jUsuario.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jUsuario.setText("USUÁRIO");
        bg.add(jUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 70, 30));
        bg.add(separatorLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 400, 30));

        userTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        userTxt.setForeground(new java.awt.Color(120, 120, 120));
        userTxt.setText("(Escreva o nome de usuário)");
        userTxt.setBorder(null);
        userTxt.setMaximumSize(new java.awt.Dimension(154, 15));
        userTxt.setMinimumSize(new java.awt.Dimension(154, 15));
        userTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTxtMousePressed(evt);
            }
        });
        userTxt.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                userTxtInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });
        bg.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 246, 400, 30));

        jSenha.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jSenha.setText("SENHA");
        bg.add(jSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 70, 30));
        bg.add(separatorLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 400, 30));

        passTxt.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        passTxt.setForeground(new java.awt.Color(120, 120, 120));
        passTxt.setText("**********");
        passTxt.setBorder(null);
        passTxt.setMaximumSize(new java.awt.Dimension(40, 15));
        passTxt.setMinimumSize(new java.awt.Dimension(40, 15));
        passTxt.setPreferredSize(new java.awt.Dimension(40, 15));
        passTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTxtMousePressed(evt);
            }
        });
        passTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTxtActionPerformed(evt);
            }
        });
        bg.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 326, 400, 30));

        loginBtn.setBackground(new java.awt.Color(178, 153, 115));

        loginBtnTxt.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        loginBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtnTxt.setText("ENTRAR");
        loginBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginBtnLayout = new javax.swing.GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 140, 40));

        messageTxt.setBorder(null);
        messageTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTxtActionPerformed(evt);
            }
        });
        bg.add(messageTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 250, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void barraFuncionalidadesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraFuncionalidadesMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraFuncionalidadesMousePressed

    private void barraFuncionalidadesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraFuncionalidadesMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barraFuncionalidadesMouseDragged

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void loginBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseEntered
        loginBtn.setBackground(new Color(121, 96, 58));
    }//GEN-LAST:event_loginBtnTxtMouseEntered

    private void loginBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseExited
        loginBtn.setBackground(new Color(178,153,115));
    }//GEN-LAST:event_loginBtnTxtMouseExited

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed

    }//GEN-LAST:event_userTxtActionPerformed

    private void userTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed
        if(userTxt.getText().equals("(Escreva o nome de usuário)")){
            userTxt.setText("");
            userTxt.setForeground(Color.black);
        }
        if(String.valueOf(passTxt.getPassword()).isEmpty()){
            passTxt.setText("**********");
            passTxt.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_userTxtMousePressed

    private void loginBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseClicked
        if(!userTxt.getText().equals("(Escreva o nome de usuário)") && 
                !(String.valueOf(passTxt.getPassword()).equals("**********") || String.valueOf(passTxt.getPassword()).isEmpty())){
            Login.validarSenha(userTxt.getText(), String.valueOf(passTxt.getPassword()));
            javax.swing.JOptionPane.showMessageDialog(this, "Dados de Ingresso digitados:\nUsuário: " + userTxt.getText() + "\nSenha: "+ String.valueOf(passTxt.getPassword()), "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            javax.swing.JOptionPane.showMessageDialog(this, "Usuário ou senha inválidos", "ERRO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_loginBtnTxtMouseClicked

    private void passTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTxtActionPerformed

    private void passTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed
        if(String.valueOf(passTxt.getPassword()).equals("**********")){
            passTxt.setText("");
            passTxt.setForeground(Color.black);
        }
        if(userTxt.getText().isEmpty()){
            userTxt.setText("(Escreva o nome de usuário)");
            userTxt.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_passTxtMousePressed

    private void userTxtInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_userTxtInputMethodTextChanged
      
    }//GEN-LAST:event_userTxtInputMethodTextChanged

    private void messageTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageTxtActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    public static boolean validarSenha (String login, String senha) {
        //- Nao pode ser zero ou nulo
        //- Tamanho minimo de 8 caracteres
        //- Nao pode comecar com os 3 primeiros digitos do login do usuario
        //- Tem que ter no minimo 2 letras e 2 numeros na senha
        if(login.length() >= 8  && senha.length() >= 8){
            
            
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraFuncionalidades;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel city;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel jLogo;
    private javax.swing.JLabel jSenha;
    private javax.swing.JLabel jSessao;
    private javax.swing.JLabel jUsuario;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JLabel loginBtnTxt;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoname;
    private javax.swing.JTextField messageTxt;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JSeparator separatorLogin;
    private javax.swing.JSeparator separatorLogin1;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables

}
