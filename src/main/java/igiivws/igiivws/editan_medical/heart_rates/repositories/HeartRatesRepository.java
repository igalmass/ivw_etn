package igiivws.igiivws.editan_medical.heart_rates.repositories;

import igiivws.igiivws.editan_medical.heart_rates.entities.HeartRateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeartRatesRepository extends JpaRepository<HeartRateEntity, Long> {

}
