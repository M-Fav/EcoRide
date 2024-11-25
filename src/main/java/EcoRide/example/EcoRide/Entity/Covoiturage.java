package EcoRide.example.EcoRide.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Covoiturage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long covoiturageId;
    private Date dateDepart;
    private Date heureDepart;
    private String lieuDepart;
    private Date dateArrivee;
    private Date heureArrivee;
    private String lieuArrivee;
    private String statut;
    private int nbPlace;
    private float prixPersonne;

    public Covoiturage() {}

    public Covoiturage(Date dateDepart, Date heureDepart, String lieuDepart, Date dateArrivee, Date heureArrivee, String lieuArrivee, String statut, int nbPlace, float prixPersonne) {
        this.dateDepart = dateDepart;
        this.heureDepart = heureDepart;
        this.lieuDepart = lieuDepart;
        this.dateArrivee = dateArrivee;
        this.heureArrivee = heureArrivee;
        this.lieuArrivee = lieuArrivee;
        this.statut = statut;
        this.nbPlace = nbPlace;
        this.prixPersonne = prixPersonne;
    }

    public long getCovoiturageId() {
        return covoiturageId;
    }

    public void setCovoiturageId(long covoiturageId) {
        this.covoiturageId = covoiturageId;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public Date getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(Date heureDepart) {
        this.heureDepart = heureDepart;
    }

    public String getLieuDepart() {
        return lieuDepart;
    }

    public void setLieuDepart(String lieuDepart) {
        this.lieuDepart = lieuDepart;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public Date getHeureArrivee() {
        return heureArrivee;
    }

    public void setHeureArrivee(Date heureArrivee) {
        this.heureArrivee = heureArrivee;
    }

    public String getLieuArrivee() {
        return lieuArrivee;
    }

    public void setLieuArrivee(String lieuArrivee) {
        this.lieuArrivee = lieuArrivee;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public int getNbPlace() {
        return nbPlace;
    }

    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }

    public float getPrixPersonne() {
        return prixPersonne;
    }

    public void setPrixPersonne(float prixPersonne) {
        this.prixPersonne = prixPersonne;
    }
}
