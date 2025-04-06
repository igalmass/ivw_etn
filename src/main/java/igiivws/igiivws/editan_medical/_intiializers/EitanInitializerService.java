package igiivws.igiivws.editan_medical._intiializers;

import igiivws.igiivws.editan_medical.heart_rates.dtos.HeartRateDto;
import igiivws.igiivws.editan_medical.heart_rates.services.HeartRatesService;
import igiivws.igiivws.editan_medical.patients.consts.GenderEnum;
import igiivws.igiivws.editan_medical.patients.dtos.PatientDto;
import igiivws.igiivws.editan_medical.patients.services.PatientsService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EitanInitializerService {
    private final PatientsService patientsService;
    private final HeartRatesService heartRatesService;

    @PostConstruct
    public void postConstruct() {
        initPatients();
        initHeartRates();

    }

    private void initHeartRates() {
        heartRatesService.addHeartRateReading(HeartRateDto.builder().patientId(1L).time("2024-03-01T08:00:00Z").heartRate(85L).build());
        heartRatesService.addHeartRateReading(HeartRateDto.builder().patientId(1L).time("2024-03-01T10:30:00Z").heartRate(85L).build());
        heartRatesService.addHeartRateReading(HeartRateDto.builder().patientId(1L).time("2024-03-01T13:45:00Z").heartRate(85L).build());
        heartRatesService.addHeartRateReading(HeartRateDto.builder().patientId(1L).time("2024-03-02T09:15:00Z").heartRate(85L).build());
        heartRatesService.addHeartRateReading(HeartRateDto.builder().patientId(1L).time("2024-03-02T11:00:00Z").heartRate(85L).build());
    }

    private void initPatients() {
        patientsService.addPatient(PatientDto.builder().id(1L).name("Alice Johnson").age(34).gender(GenderEnum.FEMALE).build());
        patientsService.addPatient(PatientDto.builder().id(2L).name("Bob Smith").age(45).gender(GenderEnum.MALE).build());
    }
}
