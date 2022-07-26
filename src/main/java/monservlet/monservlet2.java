package monservlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.*;
/**
 * Servlet implementation class monservelet2
 */
@WebServlet("/monservlet2")
public class monservlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public monservlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/Login.jsp").forward(request, response);
		
//		HttpSession session = request.getSession();
//		
//		utilisateur user=(utilisateur) session.getAttribute("utilisateur");
//		if(user==null) {
//			this.getServletContext().getRequestDispatcher("/WEB-INF/Login.jsp").forward(request, response);
//		}else {
//			this.getServletContext().getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request, response);
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String pseudo = request.getParameter("pseudo");
//		String password=request.getParameter("password");
//		String erreur;
//		
//		HttpSession session = request.getSession();
//		if(pseudo==null) {
//			session.setAttribute("utilisateur", null);
//			this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);			
//		  }else {
//			  if(pseudo.equals("") || password.equals("")){
//				  erreur ="les champs sont obligatoires";
//				  request.setAttribute("erreur_mdp", erreur);
//				  this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);	
//			  }else {
//				  
//				  try {
//					  utilisateur[] uesrs = null;
//					for(utilisateur user: uesrs) { 
//						  if (user.getPseudo().equals(pseudo)&& user.getPassword1().equals(password)) { 
//							  this.getServletContext().getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request, response);
//							  
//							  utilisateur user1 = new utilisateur(user.getNom(),user.getPrenom(),user.getPseudo(),user.getEmail(),user.getPassword1());
//							  session.setAttribute("utilisateur",user1);
//							  break;
//						  }
//						}
					  
//					  erreur ="mdp";
//					  request.setAttribute("erreur_mdp", erreur);
//					  this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);	
//				  }catch(Exception e){
//					  erreur ="incorrecte";
//					  request.setAttribute("erreur_mdp", erreur);
//					  this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);	
//				  }
//			  }
//		  }
		}
	}
