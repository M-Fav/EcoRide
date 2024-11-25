package EcoRide.example.EcoRide.Controller;

import EcoRide.example.EcoRide.Entity.Covoiturage;
import EcoRide.example.EcoRide.Entity.Voiture;
import EcoRide.example.EcoRide.Repository.CovoiturageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/covoiturages")
public class CovoiturageController {

    @Autowired
    private CovoiturageRepository covoiturageRepository;

    @GetMapping
    public List<Covoiturage> getAllCovoiturages() {
        return covoiturageRepository.findAll();
    }

    @GetMapping("/{covoiturageId}")
    public Covoiturage getCovoiturageById(@PathVariable Long covoiturageId) {
        return  covoiturageRepository.findById(covoiturageId).orElseThrow(() -> new RuntimeException("Covoiturage introuvable"));
    }

    @PostMapping
    public Covoiturage createCovoiturage(@RequestBody Covoiturage covoiturage) {
        return covoiturageRepository.save(covoiturage);
    }

    @PutMapping("/{covoiturageId}")
    public Covoiturage updateCovoiturage(@PathVariable Long covoiturageId, @RequestBody Covoiturage updateCovoiturage) {
        return covoiturageRepository.findById(covoiturageId).map(covoiturage -> {
            covoiturage.setDateArrivee(updateCovoiturage.getDateArrivee());
            covoiturage.setHeureArrivee(updateCovoiturage.getHeureArrivee());
            covoiturage.setDateDepart(updateCovoiturage.getDateDepart());
            covoiturage.setHeureDepart(updateCovoiturage.getHeureDepart());
            covoiturage.setLieuArrivee(updateCovoiturage.getLieuArrivee());
            covoiturage.setLieuDepart(updateCovoiturage.getLieuDepart());
            covoiturage.setStatut(updateCovoiturage.getStatut());
            covoiturage.setNbPlace(updateCovoiturage.getNbPlace());
            covoiturage.setPrixPersonne(updateCovoiturage.getPrixPersonne());
            return covoiturageRepository.save(covoiturage);
        }).orElseThrow(() -> new RuntimeException("Voiture introuvable pour mise à jour !"));
    }

    @DeleteMapping("/{covoiturageId}")
    public String deleteCovoiturage(@PathVariable Long covoiturageId) {
        covoiturageRepository.deleteById(covoiturageId);
        return "Covoiturage supprimé avec succès !";
    }

    @GetMapping("/test")
    public String test() {
        return "l'accès Covoiturage fonctionne !";
    }
}
