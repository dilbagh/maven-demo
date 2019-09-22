package in.dsbakshi.demos.web.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.dsbakshi.demos.services.NameSplitterService;
import in.dsbakshi.demos.utility.SplitName;

/**
 * Servlet implementation class NameSplitterServlet
 */
public class NameSplitterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private NameSplitterService nameSplitterService;

	/**
	 * Default constructor.
	 */
	public NameSplitterServlet() {
		nameSplitterService = new NameSplitterService();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		SplitName splittedName = nameSplitterService.getSplittedName(name);
		request.setAttribute("splittedName", splittedName);
		RequestDispatcher splitResultDispatcher = request.getRequestDispatcher("split-result.jsp");
		splitResultDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
