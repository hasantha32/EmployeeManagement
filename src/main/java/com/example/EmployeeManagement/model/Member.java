package com.example.EmployeeManagement.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Member {
    @Id
    private String id;

    private String fullName;

    private String address;

    private String mobile;

    private String gender;

    private Date birthday;

    private String membershipType;
}
