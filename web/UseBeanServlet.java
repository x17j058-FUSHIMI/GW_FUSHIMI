package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UseBeanServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//JavaBeanのインスタンスの生成
		EmpBean bean = new EmpBean();
		//setterメソッドを使用してフィールドに値を格納
		bean.setName("高尾山");
		bean.setAge(20);
		//合言葉をempで設定したインスタンスをぶちこむ
		req.setAttribute("emp", bean);
		//遷移先の情報をrdに格納している
		RequestDispatcher rd = req.getRequestDispatcher("/page/useBean.jsp");
		//遷移の実行
		rd.forward(req, resp);
	}
}
