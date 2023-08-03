package br.wbessi.hm01.view;

import br.unimontes.hm01.view.Login;
import br.wbessi.hm01.view.TelaPrincipal;

public class Main {
    private Login login;
    private TelaPrincipal telaPrincipal;

    public Main() {
        login = new Login(this);
    }
    
    public void mudarTela() {
        telaPrincipal = new TelaPrincipal();
        login.setVisible(false);
        telaPrincipal.setVisible(true);       
    }

    public void iniciar() {
        login.setVisible(true);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.iniciar();
    }
}
