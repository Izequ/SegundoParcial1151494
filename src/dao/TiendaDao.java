package dao;


import model.Tienda;
import util.Conexion;

public class TiendaDao extends Conexion<Tienda> implements GenericDao<Tienda>{

	public TiendaDao() {
		super(Tienda.class);
	}
}
