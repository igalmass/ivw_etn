package igiivws.igiivws.editan_medical.patients.services;

import igiivws.igiivws.editan_medical.patients.dtos.PatientDto;
import igiivws.igiivws.editan_medical.patients.entities.PatientEntity;
import org.hibernate.annotations.SecondaryRow;
import org.springframework.stereotype.Service;

@Service
public class PatientDtoToEntityConverter {
    public PatientEntity convertDtoToEntity(PatientDto dto) {
        return new PatientEntity()
                .builder()
                .id(dto.getId())
                .age(dto.getAge())
                .name(dto.getName())
                .gender(dto.getGender().name())
                .build();
    }
}
