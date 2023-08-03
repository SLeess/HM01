/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unimontes.hm01.model;

import br.unimontes.hm01.DAO.FuncionarioDAO;
import java.util.ArrayList;

/**
 *
 * @author wende
 */
public class Funcionario implements FuncionarioDAO{
    private String CPF;
    private String nome;
    private ArrayList<Agendamento> agendamentos = new ArrayList<>();

    public Funcionario(String CPF, String nome){
        this.CPF = CPF;
        this.nome = nome;
    }
    
    @Override
    public String getCPF() {
        return this.CPF;
    }

    @Override
    public void setCPF(String CPF) {
        this.CPF = CPF;
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
