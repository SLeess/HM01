package br.unimontes.hm01.model;

import br.unimontes.hm01.DAO.AgendamentoDAO;

public class Agendamento implements AgendamentoDAO {
    private String data;
    private String hora;
    private Integer idCliente;

    public Agendamento(String data, String hora) {
        this.data = data;
        this.hora = hora;
    }

    public Agendamento(String data, String hora, Integer idCliente) {
        this.data = data;
        this.hora = hora;
        this.idCliente = idCliente;
    }
    
    @Override
    public String getData() {
        return data;
    }

    @Override
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String getHora() {
        return hora;
    }

    @Override
    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public Integer getIdCliente() {
        return idCliente;
    }

    @Override
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
}
