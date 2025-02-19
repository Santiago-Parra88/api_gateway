package ups.edu.ec.integracionAplicaciones.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ups.edu.ec.integracionAplicaciones.model.Auto;

@Repository
public interface AutoRepository extends JpaRepository<Auto, Integer> {

}
