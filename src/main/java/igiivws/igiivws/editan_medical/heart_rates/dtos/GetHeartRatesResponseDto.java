package igiivws.igiivws.editan_medical.heart_rates.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetHeartRatesResponseDto {
    private String code;
    private String message;
    private List<HeartRateDto> model;
}
