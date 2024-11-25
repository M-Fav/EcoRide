package EcoRide.example.EcoRide.Repository;

import EcoRide.example.EcoRide.Entity.Avis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvisRepository extends JpaRepository<Avis, Long> {
}
