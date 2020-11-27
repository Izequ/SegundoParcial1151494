package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.TiendaDao;
import model.Tienda;

/**
 * Servlet implementation class TiendaServlet
 */
@WebServlet("/TiendaServlet")
public class TiendaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TiendaDao TiendaDao;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TiendaServlet() {
        super();
		TiendaDao = new TiendaDao();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getServletPath();

		System.out.println(action);
		try {
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertTienda(request, response);
				break;
			case "/delete":
				deleteTienda(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updateTienda(request, response);
				break;
			default:
				listTienda(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("RegistroTienda.jsp");
		dispatcher.forward(request, response);
	}

	protected void insertTienda(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String clave=request.getParameter("clave");
		String descripcion=request.getParameter("descripcion");
		String email=request.getParameter("email");
		String facebook=request.getParameter("facebook");
		String imagen=request.getParameter("imagen");
		String lema=request.getParameter("lema");
		String nombre=request.getParameter("nombre");
		String propietario=request.getParameter("propietario");
		String web=request.getParameter("web");
		Tienda tienda=new Tienda();
		tienda.setClave(clave);
		tienda.setDescripcion(descripcion);
		tienda.setEmail(email);
		tienda.setFacebook(facebook);	
		tienda.setImagen(imagen);
		tienda.setLema(lema);
		tienda.setNombre(nombre);
		tienda.setPropietario(propietario);
		tienda.setWeb(web);
		TiendaDao.insert(tienda);
		response.sendRedirect("index.jsp");		
		
	}

	private void listTienda(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Tienda> listTienda = TiendaDao.list();
		request.setAttribute("listUser", listTienda);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Index.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		// User existingUser = userDAO.selectUser(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
		// request.setAttribute("user", existingUser);
		// dispatcher.forward(request, response);

	}

	private void updateTienda(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String country = request.getParameter("country");

		// User book = new User(id, name, email, country);
		// userDAO.updateUser(book);
		response.sendRedirect("list");
	}

	private void deleteTienda(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		// userDAO.deleteUser(id);
		response.sendRedirect("list");

	}
}
