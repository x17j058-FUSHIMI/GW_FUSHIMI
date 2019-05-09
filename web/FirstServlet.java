package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

	//URLにgetの値を表示するメソッドのオーバーライド
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//エンコーティングと文字コードの設定
		resp.setContentType("text/html; charset = UTF-8");

		//ServletでHTMLを書くための準備をしている
		PrintWriter out = resp.getWriter();

		//変数名.の形式でHTMLが書ける
		out.println("<html>");
		out.println("<head><title>サンプルページ</title></head>");
		out.println("<body>");
		out.println("<h1>HelloWorld!</h1>");
		out.println("</body>");
		out.println("</html>");
		//終了宣言
		out.close();
	}
}
