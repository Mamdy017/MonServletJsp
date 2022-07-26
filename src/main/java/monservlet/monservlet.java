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
 * Servlet implementation class monservlet
 */
@WebServlet("/monservlet")
public class monservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public monservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/inscrire.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		 List<utilisateur> liste = (List)session.getAttribute("liste");
	        if(liste == null) {
	        	liste= new ArrayList();}
 
		String nom = request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String pseudo= request.getParameter("pseudo");
		String email= request.getParameter("email");
		String password= request.getParameter("password1");
		String pass= request.getParameter("password2");	
		
		request.setAttribute("nom", nom);
		
		String erreur;
		
		if(
			!"".equals(nom) && !"".equals(prenom)
			&& !"".equals(pseudo) && !"".equals(email)
			&& !"".equals(password) && !"".equals(pass)) {
			
			
			if (password.equals(pass)) {	        
		       
		        	utilisateur user = new utilisateur(nom, prenom, pseudo,email,password);
		        	
		        	request.setAttribute("utilisateur",user);
		        	liste.add(user);		        	
		        	session.setAttribute("liste",liste);
		        	
		      
				
				this.getServletContext().getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request, response);
			}else {
				erreur = "mot de passe non identique";
				request.setAttribute("erreur_mdp", erreur);
				this.getServletContext().getRequestDispatcher("/WEB-INF/inscrire.jsp").forward(request, response);
			}
		}
		else {
			erreur ="les champs sont obligatoires";
			request.setAttribute("erreur_mdp", erreur);
			this.getServletContext().getRequestDispatcher("/WEB-INF/inscrire.jsp").forward(request, response);
		}
		
	}

}
