package igiivws.igiivws.editan_medical.patients.dtos;

import igiivws.igiivws.editan_medical.patients.consts.GenderEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class PatientDto {
    private Long id;
    private String name;
    private int age;
    private GenderEnum gender;
    // private
}
