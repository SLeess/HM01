package br.unimontes.hm01.controller;

//extra part

import br.unimontes.hm01.DAO.DAOException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public interface Control<T> {
    int save(T entidade) throws DAOException;
    int update(T entidade) throws DAOException;
    int delete(T entidade) throws DAOException;
    List<T> findAll() throws DAOException;
    T findOne(T entidade) throws DAOException;
    DefaultTableModel carregar(JTable table);
    public void findSelected(T a, JTable table) throws SQLException;
}
