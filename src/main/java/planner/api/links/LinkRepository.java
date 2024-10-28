package planner.api.links;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface LinkRepository extends JpaRepository <Link, UUID>{
     List<Link> findByTripId(UUID tripId);

}