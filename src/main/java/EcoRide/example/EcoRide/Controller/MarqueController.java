package EcoRide.example.EcoRide.Controller;

import EcoRide.example.EcoRide.Entity.Marque;
import EcoRide.example.EcoRide.Repository.MarqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marques")
public class MarqueController {

    @Autowired
    private MarqueRepository marqueRepository;

    @GetMapping
    public List<Marque> getAllMarques() {
        return marqueRepository.findAll();
    }

    @GetMapping("/{marqueId}")
    public Marque getMarqueById(@PathVariable Long marqueId) {
        return  marqueRepository.findById(marqueId).orElseThrow(() -> new RuntimeException("Marque introuvable"));
    }

    @PostMapping
    public Marque createMarque(@RequestBody Marque marque) {
        return marqueRepository.save(marque);
    }

    @PutMapping("/{marqueId}")
    public Marque updateMarque(@PathVariable Long marqueId, @RequestBody Marque updateMarque) {
        return marqueRepository.findById(marqueId).map(marque -> {
            marque.setLibelle(updateMarque.getLibelle());
            return marqueRepository.save(marque);
        }).orElseThrow(() -> new RuntimeException("Marque introuvable pour mise à jour !"));
    }

    @DeleteMapping("/{marqueId}")
    public String deleteMarque(@PathVariable Long marqueId) {
        marqueRepository.deleteById(marqueId);
        return "Marque supprimée avec succès !";
    }

    @GetMapping("/test")
    public String test() {
        return "l'accès Marque fonctionne !";
    }
}
