/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unimontes.hm01.DAO;

import br.unimontes.hm01.model.Agendamento;
import java.util.ArrayList;

/**
 *
 * @author wende
 */
public interface ServicoDAO {
    public Integer getIdServico();
    public void setIdServico(Integer idServico);
    
    public String getNome();
    public void setNome(String nome);
    
    public String getDescricao();
    public void setDescricao(String descricao);
    
    public Float getPreco();
    public void setPreco(Float preco);
    
    public Agendamento getAgendamento(String data, String hora);
    public ArrayList<Agendamento> getAgendamentos();
    public void setAgendamento(Agendamento agendamento);
    public void setAgendamentos(ArrayList<Agendamento> agendamentos);
}
