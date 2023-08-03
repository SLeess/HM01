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
public interface FuncionarioDAO {
    public String getCPF();
    public void setCPF(String CPF);
    
    public String getNome();
    public void setNome(String nome);
    
    public Agendamento getAgendamento(String data, String hora);
    public ArrayList<Agendamento> getAgendamentos();
    public void setAgendamento(Agendamento agendamento);
    public void setAgendamentos(ArrayList<Agendamento> agendamentos);
}
