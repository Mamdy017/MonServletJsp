package monservlet;

public class utilisateur {
private String nom;
private String prenom;
private String pseudo;
private String email;
private String password1;
public utilisateur(String nom, String prenom, String pseudo, String email, String password) {
	this.nom=nom;
	this.prenom=prenom;
	this.pseudo=pseudo;
	this.email=email;
	this.password1=password;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getPseudo() {
	return pseudo;
}
public void setPseudo(String pseudo) {
	this.pseudo = pseudo;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword1() {
	return password1;
}
public void setPassword1(String password1) {
	this.password1 = password1;
}


}
