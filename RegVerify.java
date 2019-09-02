package homePage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegVerify
 */
@WebServlet("/RegVerify")
public class RegVerify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegVerify() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user=request.getParameter("username");
		String sname=request.getParameter("name");
		String pass=request.getParameter("password");
		if(user.isEmpty()||sname.isEmpty()||pass.isEmpty()) {
			//
			request.setAttribute("error", true);
			RequestDispatcher rd=request.getRequestDispatcher("register1.jsp");
			rd.forward(request, response);
		}
		else {
			//System.out.println("ok");
			//dbstuff
			//RequestDispatcher rd1=request.getRequestDispatcher("RegSuccess");
			response.sendRedirect("RegSuccess");
			//rd1.forward(request, response);
		}
		//doGet(request, response);
	}

}
