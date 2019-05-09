package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DispatchServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		セッションの取得
		HttpSession session = req.getSession(true);
//		セッションに値を格納
		session.setAttribute("name", "高尾山");
		req.setAttribute("age", "20");
//		ここまで

		//遷移するためのテンプレ
		RequestDispatcher rd = req.getRequestDispatcher("/page/test.jsp");
		rd.forward(req, resp);
	}
}
