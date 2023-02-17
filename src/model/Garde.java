package model;

import java.time.LocalDate;

public class Garde {
  private LocalDate dateDebut;
  private LocalDate dateFin;
  private double prix;
  private int placeDispo;
  private Chat chat;
  private Client user;

  public Garde(LocalDate dateDebut, LocalDate dateFin, double prix, int placeDispo,Chat chat, Client user) {
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.prix = prix;
		this.placeDispo = placeDispo;
		this.chat = chat;
    this.user=user;
	}

}
