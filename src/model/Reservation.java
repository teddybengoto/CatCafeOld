package model;

import java.time.LocalDate;

public class Reservation {

    private int effectif ;
    private LocalDate jour;
    private LocalDate heure;
    private Client user;
    private Espace espace;




    public Reservation(int effectif, LocalDate jour, LocalDate heure, Client user, Espace espace) {
        this.effectif = effectif;
        this.jour = jour;
        this.heure = heure;
        this.user = user;
        this.espace = espace;
    }
 


    public int getEffectif() {
        return this.effectif;
    }

    public void setEffectif(int effectif) {
        this.effectif = effectif;
    }

    public LocalDate getJour() {
        return this.jour;
    }

    public void setJour(LocalDate jour) {
        this.jour = jour;
    }

    public LocalDate getHeure() {
        return this.heure;
    }

    public void setHeure(LocalDate heure) {
        this.heure = heure;
    }

    public Client getUser() {
        return this.user;
    }

    public void setUser(Client user) {
        this.user = user;
    }
    
}
