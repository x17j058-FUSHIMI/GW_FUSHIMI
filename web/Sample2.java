package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Sample2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//記述方法の設定
		resp.setContentType("text/html;charset=Windows-31J");
		//HTML記述の宣言
		PrintWriter out = resp.getWriter();
		//記述開始
		out.println("<html>");
		out.println("<head><title>Session Servlet 2</title></head>");
		out.println("<body>");
		out.println("<h1>Session Servlet 2</h1>");
		//ここまで
		//セッションが開始しているかの確認
		HttpSession session = req.getSession(false);
		if (session == null) {
			out.println("<p>セッションが開始されていません</p>");
			out.println("</body>");
			out.println("</html>");
			return;
		}
		//セッションが継続されている場合の処理
		out.println("<p>セッションが継続しています</p>");
		//Sampleからnameを取得・表示
		out.println("<p>"+session.getAttribute("loginUser")+"</p>");
		out.println("</body>");
		out.println("</html>");
	}
}
