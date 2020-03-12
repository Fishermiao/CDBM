package com.cdbm.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class add extends javax.servlet.http.HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        System.out.println(username);
        resp.getWriter().write("哈哈哈aaa哈哈哈哈哈哈");
        resp.getWriter().write("don't quit");
        resp.getWriter().write("don't quit");
        resp.getWriter().write("don't quit");
        resp.getWriter().write("don't quit");
        resp.getWriter().write("don't quit");
        resp.getWriter().write("don't quit");
        resp.getWriter().write("don't quit");


    }
}
