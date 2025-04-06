package igiivws.igiivws.editan_medical.patients.services;

import igiivws.igiivws.editan_medical.patients.dtos.PatientDto;
import igiivws.igiivws.editan_medical.patients.entities.PatientEntity;
import igiivws.igiivws.editan_medical.patients.repositories.PatientsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientsService {
    private final PatientDtoToEntityConverter patientDtoToEntityConverter;
    private final PatientsRepository patientsRepository;
    public void addPatient(PatientDto patientDto) {
        PatientEntity patientEntity = patientDtoToEntityConverter.convertDtoToEntity(patientDto);
        patientsRepository.save(patientEntity);
    }
}
