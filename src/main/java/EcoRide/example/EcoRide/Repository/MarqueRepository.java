package EcoRide.example.EcoRide.Repository;

import EcoRide.example.EcoRide.Entity.Marque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarqueRepository extends JpaRepository<Marque, Long> {
}
