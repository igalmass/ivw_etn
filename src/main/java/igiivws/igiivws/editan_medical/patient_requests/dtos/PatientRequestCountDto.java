package igiivws.igiivws.editan_medical.patient_requests.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PatientRequestCountDto {
    private long patientId;
    private int requestCount;
}
