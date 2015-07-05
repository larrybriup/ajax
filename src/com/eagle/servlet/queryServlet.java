package com.eagle.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eagle.bean.Student;

public class queryServlet extends HttpServlet {
	private static Map<String,Student> db=new HashMap<String, Student>();
	static{
		db.put("1", new Student(1,"tom1",87));
		db.put("2", new Student(2,"tom2",89));
		db.put("3", new Student(3,"tom3",100));
		db.put("4", new Student(4,"tom4",66));
		db.put("5", new Student(5,"tom5",78));
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("in query");
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		String id = req.getParameter("id");
		resp.setContentType("text/xml;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		out.print("<students>");
			out.print("<student>");
			Student s=db.get(id);
			if(s!=null){
				out.print("<id>"+s.getId()+"</id>");
				out.print("<name>"+s.getName()+"</name>");
				out.print("<score>"+s.getScore()+"</score>");
			}
			out.print("</student>");
		out.print("</students>");
		
		out.flush();
		out.close();
		
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
