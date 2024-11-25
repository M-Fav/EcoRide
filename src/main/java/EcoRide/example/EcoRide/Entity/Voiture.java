package EcoRide.example.EcoRide.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Voiture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long voitureId;
    private String modele;
    private String immatriculation;
    private String energie;
    private String couleur;
    private String datePremiereImmatriculation;

    public Voiture() {}

    public Voiture(String modele, String immatriculation, String energie, String couleur, String datePremiereImmatriculation) {
        this.modele = modele;
        this.immatriculation = immatriculation;
        this.energie = energie;
        this.couleur = couleur;
        this.datePremiereImmatriculation = datePremiereImmatriculation;
    }

    public long getVoitureId() {
        return voitureId;
    }

    public void setVoitureId(long voitureId) {
        this.voitureId = voitureId;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getEnergie() {
        return energie;
    }

    public void setEnergie(String energie) {
        this.energie = energie;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getDatePremiereImmatriculation() {
        return datePremiereImmatriculation;
    }

    public void setDatePremiereImmatriculation(String datePremiereImmatriculation) {
        this.datePremiereImmatriculation = datePremiereImmatriculation;
    }
}
