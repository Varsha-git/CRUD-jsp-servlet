package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ResultDao;
import model.Result;

/**
 * Servlet implementation class ViewAllController
 */
@WebServlet("/allresults")
public class ViewAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewAllController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ResultDao resultDAO = new ResultDao();
		List<Result> listresult = null;
		try {
			listresult = resultDAO.selectAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Result rslist : listresult) {
			System.out.println(rslist.getRollno());
			System.out.println(rslist.getName());
			System.out.println(rslist.getFname());
			System.out.println(rslist.getDbms());
			System.out.println(rslist.getData_structure());
			System.out.println(rslist.getDescrete_maths());

		}
		request.setAttribute("listresult", listresult);
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/addResultView.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
