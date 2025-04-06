package igiivws.igiivws.editan_medical.heart_rates.services;

import igiivws.igiivws.editan_medical.heart_rates.dtos.HeartRateDto;
import igiivws.igiivws.editan_medical.heart_rates.repositories.HeartRatesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HeartRatesService {
    private final HeartRatesRepository heartRatesRepository;
    private final HeartRateDtoToEntityConverter heartRateDtoToEntityConverter;

    public List<HeartRateDto> getHeartRatesAbove(long minimumHeartRate) {
        return null; // todo: get data from repository
    }

    public void addHeartRateReading(HeartRateDto dto) {
        heartRatesRepository.save(heartRateDtoToEntityConverter.convertDtoToEntity(dto));
    }
}
