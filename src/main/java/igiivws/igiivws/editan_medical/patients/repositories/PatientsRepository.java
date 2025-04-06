package igiivws.igiivws.editan_medical.patients.repositories;


import igiivws.igiivws.editan_medical.patients.entities.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientsRepository extends JpaRepository<PatientEntity, Long> {

}
