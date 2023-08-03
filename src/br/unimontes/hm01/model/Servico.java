
package br.unimontes.hm01.model;

import br.unimontes.hm01.DAO.ServicoDAO;
import java.util.ArrayList;

public class Servico implements ServicoDAO{
    private Integer idServico;
    private String nome;
    private String descricao;
    private Float preco;
    private ArrayList<Agendamento> agendamentos = new ArrayList<>();


    public Servico(Integer idServico, String nome, String descricao, Float preco){
        this.idServico = idServico;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    @Override
    public Integer getIdServico() {
        return this.idServico;
    }

    @Override
    public void setIdServico(Integer idServico) {
        this.idServico = idServico;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public Float getPreco() {
        return this.preco;
    }

    @Override
    public void setPreco(Float preco) {
        this.preco = preco;
    }

    @Override
    public Agendamento getAgendamento(String data, String hora) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Agendamento> getAgendamentos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setAgendamento(Agendamento agendamento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setAgendamentos(ArrayList<Agendamento> agendamentos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
