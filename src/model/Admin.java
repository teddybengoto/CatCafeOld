package model;

public class Admin extends Compte {

	public Admin(String login, String password, String nom, String prenom) {
		super(login, password, nom, prenom);
		
	}

public void ajouterUnChat()
{

}

public void ajouterEspace()
{

}

	@Override
	public String toString() {
		return "Admin [login=" + login + ", password=" + password + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

}
