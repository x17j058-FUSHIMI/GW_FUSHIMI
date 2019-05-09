package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//送信されてくるパラメータのコーディングの指定
		req.setCharacterEncoding("UTF-8");
		//送信されたパラメータの取得
		String name = req.getParameter("name");
		String age = req.getParameter("old");
		String sex = req.getParameter("sex");
		String ran = req.getParameter("ran");
		String ran1 = req.getParameter("ran1");
		String ran2 = req.getParameter("ran2");
		String mess = req.getParameter("mess");
		//ここまで

		//エンコーティングと文字コードの設定
		resp.setContentType("text/html; charset = UTF-8");
		//ServletでHTMLを書くための準備をしている
		PrintWriter out = resp.getWriter();
		//HTML記述ナウ
		out.println("<html>");
		out.println("<head>");
		out.println("<body>");
		//取得したパラメータを画面へ出力
		//名前のパラメータ表示
		out.println("<h2>お名前</h2>");
		out.println(name);
		//年齢のパラメータ表示
		out.println("<h2>年齢</h2>");
		out.println(age + "代");
		//性別のパラメータ表示
		out.println("<h2>性別</h2>");
		out.println(sex);
		//興味のある言語パラメータ表示
		out.println("<h2>興味のある言語</h2>");
		//Javaの値がnullでないなら画面に表示
		if(ran != null) {
			out.print("Java言語");
			//他に興味がある場合は「,」を表示
			if(ran1 != null) {
				out.print(",");
			}else if(ran2 != null){
				out.print(",");
			}
		}
		//PHPの値がnullでないなら画面に表示
		if(ran1 != null) {
			out.print("PHP言語");
			//他に興味がある場合は「,」を表示
			if(ran2 != null){
				out.print(",");
			}
		}
		//C言語の値がnullでないなら画面に表示
		if(ran2 != null) {
			out.print("C言語");
		}
		//何か一言パラメータ表示
		out.println("<h2>何か一言</h2>");
		out.print(mess);
		out.println("</body>");
		out.println("</head>");
		out.println("</html>");
		//ここまで
		//接続解除的なノリ
		out.close();
	}
}
