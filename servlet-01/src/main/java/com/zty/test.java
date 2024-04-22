package com.zty;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/test/t1")
public class test extends HelloServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("name");
        String password = req.getParameter("pwd");
        resp.setContentType("text/html; charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        System.out.println(username+password);
        if(username.equals("admin")&&password.equals("admin")){
            resp.getWriter().write("登录成功");
        }else{
            resp.sendRedirect("/servlet_01_war/index.jsp");
        }

    }
}
