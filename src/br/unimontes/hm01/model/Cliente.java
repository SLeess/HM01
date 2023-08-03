package br.unimontes.hm01.model;

import br.unimontes.hm01.DAO.ClienteDAO;
import java.util.ArrayList;

public class Cliente implements ClienteDAO{
    private Integer idCliente;
    private String nome;
    private String sobrenome;
    private String telefone;
    private String email;
    private ArrayList<Agendamento> agendamentos = new ArrayList<>();

    public Cliente(Integer idCliente, String nome, String sobrenome, String telefone, String email) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.email = email;
    }
    
    public Cliente(Integer idCliente){
        this.idCliente = idCliente;
    }

    public Cliente(String nome, String sobrenome, String telefone, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.email = email;
        this.idCliente = null;
    }

    @Override
    public Integer getIdCliente() {
        return idCliente;
    }

    @Override
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public Agendamento getAgendamento(String data, String hora) {
        for (Agendamento agendamento : agendamentos) {
            if (agendamento.getData().equals(data) && agendamento.getHora().equals(hora)) {
                return agendamento;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    @Override
    public void setAgendamento(Agendamento agendamento){
        this.agendamentos.add(agendamento);
    }
    
    @Override
    public void setAgendamentos(ArrayList<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }
}
