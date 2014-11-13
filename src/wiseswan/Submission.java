package wiseswan;


import java.io.*;
import java.sql.*;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Submission extends HttpServlet

{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	
	{
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	
	{
		String pageparam	=	request.getParameter("pagename");
		PrintWriter out = response.getWriter();
		
		System.out.println(pageparam);
		if(pageparam.equals("submit"))
		{
			String SetName = request.getParameter("setname");
			String SetDesc = request.getParameter("setdesc");
			String SetLimit = request.getParameter("setlimit");
			String IsFree = request.getParameter("isfree");
			String SetMarks = request.getParameter("settotalmarks");
			
		
		
		CreateSet sets	=	new CreateSet();
		
		sets.setsetname(SetName);
		sets.setsetdesc(SetDesc);
		sets.setsetlimit(SetLimit);
		sets.setisfree(IsFree);
		sets.settotalmarks(SetMarks);
		
		try 
		
		{
			DbManager.Insert(sets);
			//response.sendRedirect("redirect.jsp");
			ArrayList<String> dbvalues = DbManager.Fetch();
			DbManager.Close();
			request.setAttribute("message", "TEST");
			request.setAttribute("dbvalues", dbvalues);
	        request.getRequestDispatcher("/redirect.jsp").forward(request, response);
			
		} catch ( ClassNotFoundException | SQLException | NullPointerException e) {
			
			e.printStackTrace();
			response.setContentType("text/html");
			out.print("<html><body><br><br><br><h2><font color='red'>"+e.getMessage()+"</font></h2></html>");
			out.flush();
			out.close();
			
		}
		
		}
		
	}

}
