package examples;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LifeCyle")
public class LifeCyle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int initCount=1;
	int serviceCount=1;
	int destroyCount=1;
	
	//웹 브라우저에서 첫 실행할때만 호출됨
	@Override
	public void init( ) throws ServletException {
		System.out.println("init 메소드가 첫 요청만 호출됨: "+initCount++);
	}
	
	//servers 탭에서 tomcat 을 stop 해야 메소드 호출
	@Override
	public void destroy() {
		System.out.println("destroy 메소드는 톰켓 종료될때만 호출됨: "+destroyCount++);
	}
	
	//service 메소드가 호출되면 doGet 메소드는 호출안됨
	//웹 브라우저에서 실행할때마다 호출됨
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service 메소드가 요청될때마다 호출됨: "+serviceCount++);
		}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


}
