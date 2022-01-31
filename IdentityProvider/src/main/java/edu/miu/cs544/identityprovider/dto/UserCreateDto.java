package edu.miu.cs544.identityprovider.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class UserCreateDto {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    @JsonFormat(pattern = "MM/dd/yyyy")
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private LocalDate dateOfBirth;
    private String imageUrl;
    private String password;
}
