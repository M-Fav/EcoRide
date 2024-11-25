package EcoRide.example.EcoRide.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Marque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long marqueId;
    private String libelle;

    public Marque() {}

    public Marque(String libelle) {
        this.libelle = libelle;
    }

    public long getMarqueId() {
        return marqueId;
    }

    public void setMarqueId(long marqueId) {
        this.marqueId = marqueId;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
