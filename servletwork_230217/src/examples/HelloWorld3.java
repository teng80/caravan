package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorld3")
public class HelloWorld3 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		객체생성
//		resp.setContentType("text/html;charset=euc-kr");
//		resp.setContentType("text/html;charset=EUC-KR");
//		resp.setContentType("text/html;charset=UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();

//		내용뿌리기
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hello~</title>");
		out.println("<body>");		
		out.println("<h1>안녕하세요~!!!</h1>");		
		out.println("</body>");
		out.println("</head>");
		out.println("</html>");

//		자원반납
		out.close();
	}
}
