package br.unimontes.hm01.controller;

import br.unimontes.hm01.DAO.DAOException;
import java.util.List;

public interface Control<T> {
    int save(T entidade) throws DAOException;
    int update(T entidade) throws DAOException;
    int delete(T entidade) throws DAOException;
    List<T> findAll() throws DAOException;
    T findOne(T entidade) throws DAOException;
}
