package EcoRide.example.EcoRide.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long utilisateurId;
    private String nom;
    private String prenom;
    private String password;
    private String telephone;
    private String dateNaissance;
    private byte[] photo;
    private String pseudo;

    public Utilisateur() {}

    public Utilisateur(String nom, String prenom, String password, String telephone, String dateNaissance, byte[] photo, String pseudo) {
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
        this.telephone = telephone;
        this.dateNaissance = dateNaissance;
        this.photo = photo;
        this.pseudo = pseudo;
    }

    public long getUtilisateurId() {
        return utilisateurId;
    }

    public void setUtilisateurId(long utilisateurId) {
        this.utilisateurId = utilisateurId;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
}
