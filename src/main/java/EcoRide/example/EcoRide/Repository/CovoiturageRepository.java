package EcoRide.example.EcoRide.Repository;

import EcoRide.example.EcoRide.Entity.Covoiturage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CovoiturageRepository extends JpaRepository<Covoiturage, Long> {
}
