package com.eagle.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectServlet extends HttpServlet {
	private String[][] str={
			{"长沙","吉首","怀化"},
			{"武汉","襄阳","宜昌"},
			{"郑州","周口","开封","平顶山"}
		};
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("in SelectServlet");
	req.setCharacterEncoding("UTF-8");
	resp.setCharacterEncoding("UTF-8");
	
	String v = req.getParameter("v");
	int index=Integer.parseInt(v);
	resp.setContentType("text/xml;charset=utf-8");
	PrintWriter out = resp.getWriter();
	
	out.print("<options>");
		for(String city:str[index]){
			out.print("<option>"+city+"</option>");
		}
	out.print("</options>");
	out.flush();
	out.close();
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
