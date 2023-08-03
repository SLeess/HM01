package br.unimontes.hm01.DAO;


import br.unimontes.hm01.model.Agendamento;
import java.util.ArrayList;

public interface ClienteDAO {
    public Integer getIdCliente();
    public void setIdCliente(Integer idCliente);
    public String getNome();
    public void setNome(String nome);
    public String getSobrenome();
    public void setSobrenome(String sobrenome);
    public String getTelefone();
    public void setTelefone(String telefone);
    public String getEmail();
    public void setEmail(String email);
    public Agendamento getAgendamento(String data, String hora);
    public ArrayList<Agendamento> getAgendamentos();
    public void setAgendamento(Agendamento agendamento);
    public void setAgendamentos(ArrayList<Agendamento> agendamentos);
}
