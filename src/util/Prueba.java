package util;

import dao.ClienteDao;
import dao.ServicioDao;
import dao.TiendaDao;
import model.Cliente;
import model.Servicio;
import model.Tienda;

public class Prueba {

public static void main(String[] args) {
	
		
		Cliente c = new Cliente();
		c.setId(2);
		c.setNombre("Ricardo Arjona");
		c.setEmail("Ricardo@gmail.com");
		c.setClave("1234");
		ClienteDao cdao = new ClienteDao();
		cdao.insert(c);
		
		
		Tienda t = new Tienda();
		t.setId(4);
		t.setClave("1234");
		t.setDescripcion("blablabla no se");
		t.setEmail("otroemail@gmail.com");
		t.setFacebook("link");
		t.setImagen("otrolink");
		t.setLema("nuestro servicio es el mejor");
		t.setNombre("nombre test");
		TiendaDao tdao = new TiendaDao();
		tdao.insert(t);
		
		Servicio s = new Servicio();
		s.setId(10);
		s.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipisicing elit. Itaque earum nostrum suscipit ducimus nihil provident, perferendis rem illo, voluptate atque, sit eius in voluptates, nemo repellat fugiat excepturi! Nemo, esse.");
		s.setNombre("Partes mecanicas");
		s.setTiendaBean(t);
		ServicioDao sdao = new ServicioDao();
		sdao.insert(s);

	}
}
