package com.alkemy.ong.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Setter
@Getter
public class ContactDto {

    @NotEmpty(message = "El mail es mandatorio")
    @Size(min = 3, max = 255)
    public String name;

    @Positive
    @NotEmpty(message = "El teléfono es mandatorio")
    @Size(min = 3, max = 255)
    public Long phone;

    @NotEmpty
    @Size(min = 3, max = 255)
    @Email
    public String email;

}
