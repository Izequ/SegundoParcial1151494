package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.ClienteDao;
import model.Cliente;
/**
 * Servlet implementation class ClienteServlet
 */
@WebServlet("/ClienteServlet")
public class ClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ClienteDao clienteDao; 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteServlet() {
        super();
        clienteDao = new ClienteDao();
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
				switch(action) {
					case "/new":
						showNewForm(request, response);
						break;
					case "/insert":
						insertCliente(request, response);
						break;
					case "/delete":
	                    deleteCliente(request, response);
	                    break;
	                case "/edit":
	                    showEditForm(request, response);
	                    break;
	                case "/update":
	                    updateCliente(request, response);
	                    break;
					default: 
						//listCliente(request, response);
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

	private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 RequestDispatcher dispatcher = request.getRequestDispatcher("ClienteForm.jsp");
	     dispatcher.forward(request, response);
	}
	
	private void insertCliente(HttpServletRequest request, HttpServletResponse response)
		    throws SQLException, IOException {
		        String nombre = request.getParameter("nombre");
		        String email = request.getParameter("email");
		        String clave = request.getParameter("clave");
		        Cliente newcliente = new Cliente();
		        newcliente.setNombre(nombre);
		        newcliente.setEmail(email);
		        newcliente.setClave(clave);
		        clienteDao.insert(newcliente);
		        response.sendRedirect("index");
		    }
	
	private void showEditForm(HttpServletRequest request, HttpServletResponse response)throws SQLException, ServletException, IOException {
		        int id = Integer.parseInt(request.getParameter("id"));
		        RequestDispatcher dispatcher = request.getRequestDispatcher("ClienteForm.jsp");
		    }
	
	private void updateCliente(HttpServletRequest request, HttpServletResponse response)
		    throws SQLException, IOException {
		        int id = Integer.parseInt(request.getParameter("id"));
		        String name = request.getParameter("name");
		        String email = request.getParameter("email");
		        String country = request.getParameter("country");

		      //  User book = new User(id, name, email, country);
		       // userDAO.updateUser(book);
		        response.sendRedirect("list");
		    }

	private void deleteCliente(HttpServletRequest request, HttpServletResponse response)
		    throws SQLException, IOException {
		        int id = Integer.parseInt(request.getParameter("id"));
		      //  userDAO.deleteUser(id);
		        response.sendRedirect("list");

		    }
}
