package br.unimontes.hm01.DAO;

/**
 *
 * @author Lee
 */
public interface AgendamentoDAO {
    public String getData();
    public void setData(String data);
    public String getHora();
    public void setHora(String hora);
    public Integer getIdCliente();
    public void setIdCliente(Integer idCliente);
}
