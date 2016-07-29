import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="testServlet", urlPatterns={"/test"})
public class TestServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		PrintWriter out= response.getWriter();
		try{
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Priyank</Title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>my name is priyank</h1>");
		out.println("</body>");
		out.println("</html>");
		}
		finally{
			out.close();
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
			{
				PrintWriter out= response.getWriter();
				String a= request.getParameter("numa");
				String b= request.getParameter("numb");
				try{
				
				out.println("<html>");
				out.println("<head>");
				out.println("<title>Priyank</Title>");
				out.println("</head>");
				
				out.println("<body>");
				out.println("<h1>Result is</h1>");
				out.println("Cought You, you entered"+a+", "+b);
				out.println("</body>");
				out.println("</html>");
				}
				finally{
					out.close();
				}
				
			}
	
}
