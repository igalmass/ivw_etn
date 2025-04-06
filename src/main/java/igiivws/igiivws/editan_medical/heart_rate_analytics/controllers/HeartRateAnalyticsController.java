package igiivws.igiivws.editan_medical.heart_rate_analytics.controllers;

import igiivws.igiivws.editan_medical.heart_rate_analytics.dtos.HeartRateAnalyticsDto;
import igiivws.igiivws.editan_medical.heart_rate_analytics.services.HeartRateAnalyticsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/heart_rate_analytics")
@RequiredArgsConstructor
@Slf4j
public class HeartRateAnalyticsController {
    private final HeartRateAnalyticsService heartRateAnalyticsService;

    @GetMapping("/getHeartRateAnalytics")
    public ResponseEntity<HeartRateAnalyticsDto> getHeartRateAnalytics(@RequestParam Long patientId, @RequestParam String fromTime, @RequestParam String tillTime) {

        HeartRateAnalyticsDto dto = heartRateAnalyticsService.getHeartRateAnalytics(patientId, fromTime, tillTime);

        return ResponseEntity.ok().body(dto);

    }

}
