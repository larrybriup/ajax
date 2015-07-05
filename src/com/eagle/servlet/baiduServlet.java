package com.eagle.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class baiduServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		String val = req.getParameter("v");
		resp.setContentType("text/xml;charset=utf-8");
		
		
		PrintWriter out = resp.getWriter();
		out.print("<messages>");
		for(int i=0;i<10;i++){
			int num=(int)(Math.random()*1001);
			String msg=val+num;
			out.print("<msg>"+msg+"</msg>");
		}
		out.print("</messages>");
		
		out.flush();
		out.close();
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
