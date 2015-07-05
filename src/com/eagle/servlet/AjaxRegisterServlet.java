package com.eagle.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjaxRegisterServlet extends HttpServlet {
	private String[] db={"choda","tom","linda","kitty","三炮"};
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("in AjaxRegisterServlet");
		req.setCharacterEncoding("UTF-8");
		
		resp.setCharacterEncoding("UTF-8");
		String username = req.getParameter("username");
		System.out.println(username);
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		String msg="用户名可用";
		for(String fname:db){
			if(fname.equals(username)){
				msg="用户名已经被占用";
				break;
			}
		}
		out.println(msg);
		
		out.flush();
		out.close();
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
