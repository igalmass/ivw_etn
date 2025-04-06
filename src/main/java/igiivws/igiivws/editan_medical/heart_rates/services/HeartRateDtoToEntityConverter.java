package igiivws.igiivws.editan_medical.heart_rates.services;

import igiivws.igiivws.editan_medical._common.MyTimeConverterService;
import igiivws.igiivws.editan_medical.heart_rates.dtos.HeartRateDto;
import igiivws.igiivws.editan_medical.heart_rates.entities.HeartRateEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HeartRateDtoToEntityConverter {
    private final MyTimeConverterService myTimeConverterService;

    public HeartRateEntity convertDtoToEntity(HeartRateDto heartRateDto) {
        return HeartRateEntity
                .builder()
                .patientId(heartRateDto.getPatientId())
                .heartRate(heartRateDto.getHeartRate())
                .time(myTimeConverterService.convertStringToLocalDateTime(heartRateDto.getTime()))
                .build();
    }
}
