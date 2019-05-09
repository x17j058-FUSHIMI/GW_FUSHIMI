package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Sample extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		//セッションの開始
		HttpSession session = request.getSession(true);
		//セッションに値を格納
		session.setAttribute("loginUser", "FUSHIMI");
		//記述方法の設定
		resp.setContentType("text/html;charset=Windows-31J");
		//HTML記述の宣言
		PrintWriter out = resp.getWriter();
		//内容記述
			out.println("<html>");
			out.println("<head><title>Session Servlet 1</title></head>");
			out.println("<body>");
			out.println("<h1>Session Servlet 1</h1>");
			out.println("<p>セッションを開始しました</p>");
			out.println("</body>");
			out.println("</html>");
		//ここまで
	}
}
