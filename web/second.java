package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class second extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//送信されてくるパラメータのコーディングの指定
		req.setCharacterEncoding("UTF-8");
		//送信されたパラメータの取得
		String param = req.getParameter("param");
		//エンコーティングと文字コードの設定
		resp.setContentType("text/html; charset = UTF-8");
		//ServletでHTMLを書くための準備をしている
		PrintWriter out = resp.getWriter();
		//HTML記述ナウ
			out.println("<html>");
			out.println("<head>");
			out.println("<body>");
			//取得したパラメータを画面へ出力
			out.println("<h1>" + param + "</h1>");
			out.println("</body>");
			out.println("</head>");
			out.println("</html>");
		//ここまで
		//接続解除的なノリ
		out.close();
	}
}
