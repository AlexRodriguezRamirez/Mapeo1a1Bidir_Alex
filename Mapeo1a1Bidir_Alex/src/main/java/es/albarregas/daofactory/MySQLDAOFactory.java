package es.albarregas.daofactory;


import es.albarregas.dao.IPaisDAO;
import es.albarregas.dao.PresidenteDAO;
import es.albarregas.dao.IPresidenteDAO;
import es.albarregas.dao.PaisDAO;


public class MySQLDAOFactory extends DAOFactory{

    @Override
    public IPresidenteDAO getPresidenteDAO() {
        return new PresidenteDAO();
    }

    @Override
    public IPaisDAO getPaisDAO() {
        return new PaisDAO();
    }
}
