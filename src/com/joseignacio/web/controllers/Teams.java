package com.joseignacio.web.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.joseignacio.web.models.Team;

/**
 * Servlet implementation class Teams
 */
@WebServlet("/Teams")
public class Teams extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Teams() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/NewTeam.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		ArrayList<Team> lista = (ArrayList<Team>) session.getAttribute("lista");
		int idCap = Integer.parseInt(request.getParameter("idTeam"));
		String nameTeamNew = request.getParameter("nameTeamNew");
		Team team = new Team(nameTeamNew);
		
		
		if(request.getParameter("btnSubmitTeamNew") != null) {
			
			if (lista == null) {
				lista = new ArrayList<Team>();
				lista.add(team);
				session.setAttribute("lista", lista);

				team = lista.get(0);
				System.out.println(team.getName());
				session.setAttribute("team", team);
				
			} else {
				lista.add(team);
				session.setAttribute("lista", lista);
				team = lista.get(0);
				System.out.println(team.getName());
				session.setAttribute("team", team);
			}
		}

		RequestDispatcher rd = request.getRequestDispatcher("/Home");
		rd.forward(request, response);
		
	}

}
