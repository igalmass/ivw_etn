package igiivws.igiivws.editan_medical.heart_rate_analytics.services;

import igiivws.igiivws.editan_medical.heart_rate_analytics.dtos.HeartRateAnalyticsDto;
import org.springframework.stereotype.Service;

@Service
public class HeartRateAnalyticsService {
    public HeartRateAnalyticsDto getHeartRateAnalytics(Long patientId, String fromTime, String tillTime) {
        // todo: calculate the result from the database
        return new HeartRateAnalyticsDto();
    }
}
