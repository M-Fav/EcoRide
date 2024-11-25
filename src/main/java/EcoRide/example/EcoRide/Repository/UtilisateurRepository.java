package EcoRide.example.EcoRide.Repository;

import EcoRide.example.EcoRide.Entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
