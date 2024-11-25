package EcoRide.example.EcoRide.Controller;

import EcoRide.example.EcoRide.Entity.Utilisateur;
import EcoRide.example.EcoRide.Repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utilisateurs")
public class UtilisateurController {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @GetMapping
    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    @GetMapping("/{utilisateurId}")
    public Utilisateur getUtilisateurById(@PathVariable Long utilisateurId) {
        return  utilisateurRepository.findById(utilisateurId).orElseThrow(() -> new RuntimeException("Utilisateur introuvable"));
    }

    @PostMapping
    public Utilisateur createUtilisateur(@RequestBody Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @PutMapping("/{utilisateurId}")
    public Utilisateur updateUtilisateur(@PathVariable Long utilisateurId, @RequestBody Utilisateur updateUtilisateur) {
        return utilisateurRepository.findById(utilisateurId).map(utilisateur -> {
            utilisateur.setNom(updateUtilisateur.getNom());
            utilisateur.setPassword(updateUtilisateur.getPassword());
            utilisateur.setPrenom(updateUtilisateur.getPrenom());
            utilisateur.setDateNaissance(updateUtilisateur.getDateNaissance());
            utilisateur.setPhoto(updateUtilisateur.getPhoto());
            utilisateur.setTelephone(updateUtilisateur.getTelephone());
            utilisateur.setPseudo(updateUtilisateur.getPseudo());
            return utilisateurRepository.save(utilisateur);
        }).orElseThrow(() -> new RuntimeException("Utilisateur introuvable pour mise à jour !"));
    }

    @DeleteMapping("/{utilisateurId}")
    public String deleteUtilisateur(@PathVariable Long utilisateurId) {
        utilisateurRepository.deleteById(utilisateurId);
        return "Utilisateur supprimé avec succès !";
    }

    @GetMapping("/test")
    public String test() {
        return "l'accès Utilisateur fonctionne !";
    }
}
