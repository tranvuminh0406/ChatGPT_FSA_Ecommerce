package training.g2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import training.g2.model.CartDetail;

public interface CartDetailRepository extends JpaRepository<CartDetail, Long> {
}
