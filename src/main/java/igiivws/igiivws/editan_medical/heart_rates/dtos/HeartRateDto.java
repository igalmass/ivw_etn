package igiivws.igiivws.editan_medical.heart_rates.dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HeartRateDto {
    private Long patientId;
    private String time;
    private Long heartRate;
}
