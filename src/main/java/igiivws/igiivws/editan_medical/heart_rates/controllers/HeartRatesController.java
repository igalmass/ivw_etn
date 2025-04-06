package igiivws.igiivws.editan_medical.heart_rates.controllers;

import igiivws.igiivws.editan_medical.heart_rates.dtos.GetHeartRatesResponseDto;
import igiivws.igiivws.editan_medical.heart_rates.dtos.HeartRateDto;
import igiivws.igiivws.editan_medical.heart_rates.services.HeartRatesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/heart_rates")
@RequiredArgsConstructor
@Slf4j
public class HeartRatesController {
    private final HeartRatesService heartRatesService;

    @GetMapping("/getHeartRatesAbove100") // todo: get the 100 as a parameters
    public ResponseEntity<GetHeartRatesResponseDto> getHeartRatesAbove100() {
        try {
            List<HeartRateDto> heartRateDtoList = heartRatesService.getHeartRatesAbove(100L);

            return ResponseEntity.ok().body(
                    GetHeartRatesResponseDto
                            .builder()
                            .code("OK")
                            .message("OK")
                            .model(heartRateDtoList)
                            .build());
        } catch (Exception e) {
            log.error(e.getMessage());
            return ResponseEntity.internalServerError().body(
                    new GetHeartRatesResponseDto()
                            .builder()
                            .code("ERROR")
                            .message("ERROR")
                            .build()
            );
        }
    }





}
