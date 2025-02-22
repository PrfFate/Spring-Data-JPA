package com.aliacar.dto;



import java.util.Date;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU {

    @NotEmpty(message = "Firstname alani boş birakilamaz!!")
    @Size(min = 3,max = 10,message = "Firstname en az 3 en fazla 10 karakter olmalidir!!")
    private String firstName;

    @Size(min = 3,max = 30,message = "Uygun bir lastName giriniz!!")
    private String lastName;

    private Date birthOfDate;

    @Email(message = "Email formatinda adres giriniz!")
    private String email;

    @NotEmpty(message = "Tckn alani boş birakilamaz!!")
    @Size(min = 11,max = 11,message ="Uygun bir tckn giriniz!!" )
    private String tckn;
}
