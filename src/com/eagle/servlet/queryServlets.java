package com.eagle.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eagle.bean.Student;

public class queryServlets extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("in querys");
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/xml;charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		out.print("<students>");
		out.print("<student id='1' name='tom1' score='45'>");
		out.print("</student>");
		out.print("<student id='2' name='tom2' score='67'>");
		out.print("</student>");
		out.print("<student id='3' name='tom3' score='89'>");
		out.print("</student>");
	out.print("</students>");
//	out.print("<students>");
//	out.print("<student>");
//	out.print("<id>1</id>");
//	out.print("<name>tom1</name>");
//	out.print("<score>34</score>");
//	out.print("</student>");
//	out.print("<student>");
//	out.print("<id>2</id>");
//	out.print("<name>tom2</name>");
//	out.print("<score>78</score>");
//	out.print("</student>");
//	out.print("<student>");
//	out.print("<id>3</id>");
//	out.print("<name>tom3</name>");
//	out.print("<score>45</score>");
//	out.print("</student>");
//	out.print("</students>");
		out.flush();
		out.close();
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
