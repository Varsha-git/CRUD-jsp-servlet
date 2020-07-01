package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ResultDao;
import model.Result;

/**
 * Servlet implementation class AddResultController
 */
@WebServlet(urlPatterns = { "/new" })
public class AddResultController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddResultController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/resultView.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Entering do post");
		String rollno = request.getParameter("rollno");
		String name = request.getParameter("name");
		String fname = request.getParameter("fname");
		String dbms = request.getParameter("dbms");
		String ds = request.getParameter("ds");
		String maths = request.getParameter("maths");

		Result rs = new Result();

		rs.setRollno(rollno);
		;
		rs.setName(name);
		rs.setFname(fname);
		rs.setDbms(dbms);
		rs.setData_structure(ds);
		rs.setDescrete_maths(maths);

		ResultDao resultdao = new ResultDao();
		try {
			resultdao.insertResult(rs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("adminlogin");
	}
}
