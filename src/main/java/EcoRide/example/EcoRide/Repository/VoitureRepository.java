package EcoRide.example.EcoRide.Repository;

import EcoRide.example.EcoRide.Entity.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture, Long> {
}
