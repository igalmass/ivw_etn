package igiivws.igiivws.editan_medical._common;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Service
public class MyTimeConverterService {
    public LocalDateTime convertStringToLocalDateTime(String timeAsString) {
        ZonedDateTime zdt = ZonedDateTime.parse(timeAsString);
        LocalDateTime ldt = zdt.toLocalDateTime();
        return ldt;
    }

}
