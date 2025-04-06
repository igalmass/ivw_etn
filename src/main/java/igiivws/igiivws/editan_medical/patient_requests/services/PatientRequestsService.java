package igiivws.igiivws.editan_medical.patient_requests.services;

import igiivws.igiivws.editan_medical.patient_requests.dtos.PatientRequestCountDto;
import org.springframework.stereotype.Service;

@Service
public class PatientRequestsService {

    public PatientRequestCountDto getPatientRequestCount(Long patientId) {
        return PatientRequestCountDto.builder().patientId(patientId).build(); // todo: fill the real data from the repository
    }
}
