package com.toyproject.server;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import javax.xml.ws.Response;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/zepar")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("get");
		String valueid = request.getParameter("id");
		String valuepw = request.getParameter("kpw");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("post");
		
		String valuekid = request.getParameter("kid");
		String valuekpw = request.getParameter("kpw");
		String valuekgen = request.getParameter("kgen");
		String[] valuekhabit = request.getParameterValues("khiabit");
		String valuekvirus = request.getParameter("kvirus");
		String valuekfile = request.getParameter("kfile");
		String valuektel = request.getParameter("ktel");
		String valuekintro = request.getParameter("kintro");
		
//		JOptionPane.showMessageDialog(null, valuekid+"+"+valuekpw+"+"+valuekgen+"+"+valuekhabit+"+"+valuekvirus+"+"+valuekfile+"+"+valuektel+"+"+valuekintro);
		System.out.println(valuekid+"+"+valuekpw+"+"+valuekgen+"+"+valuekvirus+"+"+valuekfile+"+"+valuektel+"+"+valuekintro);
		for(int i = 0;i<valuekhabit.length;i++) {			
			System.out.println(valuekhabit[i]);
		}
		response.getWriter().append("post post post");
		doGet(request, response);
	}

}
