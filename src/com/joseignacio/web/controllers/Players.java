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

import com.joseignacio.web.models.Player;
import com.joseignacio.web.models.Team;

/**
 * Servlet implementation class Players
 */
@WebServlet("/Players")
public class Players extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Players() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/NewPlayer.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		ArrayList<Team> lista = (ArrayList<Team>) session.getAttribute("lista");
		
		String equipoSelec = request.getParameter("equipoSelec");
		String namePlayer = request.getParameter("txtNamePlayer");
		String lastPlayer = request.getParameter("txtLastPlayer");
		int age = Integer.parseInt(request.getParameter("txtAge"));
		Player player = new Player(namePlayer,lastPlayer,age);
		
		if(request.getParameter("btnSubmitPlayerNew") != null) {
			for (Team team : lista) {
				if(team.getName().equals(equipoSelec)) {
					team.getPlayers().add(player);
					
				}
			}
			session.setAttribute("lista", lista);
		}

		response.sendRedirect("Teams?id=0");
	}

}
