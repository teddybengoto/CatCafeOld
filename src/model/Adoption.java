package model;
import java.time.LocalDate;


public class Adoption {

	private LocalDate date;
	private double prix;
	private String Condition;
	private Client user;
	private Chat chat;

	

	public Adoption(LocalDate date, double prix, String condition, Client user, Chat chat) {
		super();
		this.date = date;
		this.prix = prix;
		Condition = condition;
		this.user = user;
		this.chat = chat;
	}
	
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getCondition() {
		return Condition;
	}

	public void setCondition(String condition) {
		Condition = condition;
	}
    
	public Client getUser() {
		return user;
	}

	public void setUser(Client user) {
		this.user = user;
	}

	public Chat getChat() {
		return chat;
	}
    
	public void setChat(Chat chat) {
		this.chat = chat;
	}
		
}