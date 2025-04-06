package igiivws.igiivws.editan_medical.heart_rate_analytics.dtos;

import lombok.Data;

@Data

public class HeartRateAnalyticsDto {
    private Long patientId;
    private Long avg;
    private Long max;
    private Long min;
}
