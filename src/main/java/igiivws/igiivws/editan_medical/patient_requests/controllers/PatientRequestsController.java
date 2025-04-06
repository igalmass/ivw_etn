package igiivws.igiivws.editan_medical.patient_requests.controllers;


import igiivws.igiivws.editan_medical.patient_requests.dtos.PatientRequestCountDto;
import igiivws.igiivws.editan_medical.patient_requests.services.PatientRequestsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/patient_requests")
@RequiredArgsConstructor
@Slf4j
public class PatientRequestsController {
    private final PatientRequestsService patientRequestsService;

    @GetMapping("getPatientRequestCount")
    public ResponseEntity<PatientRequestCountDto> getPatientRequestCount(@RequestParam Long patientId) {
        PatientRequestCountDto patientRequestCount = patientRequestsService.getPatientRequestCount(patientId);
        return ResponseEntity.ok(patientRequestCount);

    }
}
