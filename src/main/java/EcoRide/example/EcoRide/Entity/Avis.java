package EcoRide.example.EcoRide.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Avis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long avisId;
    private String commentaire;
    private String note;
    private String statut;

    public Avis() {}

    public Avis(String commentaire, String note, String statut) {
        this.commentaire = commentaire;
        this.note = note;
        this.statut = statut;
    }

    public long getAvisId() {
        return avisId;
    }

    public void setAvisId(long avisId) {
        this.avisId = avisId;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}
