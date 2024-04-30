package com.example.EmployeeManagement.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MyDataModel {
    private String fullName;
    private String nameWithInitials;
    private String address;
    private String reversedAddress;
    private String contactNumberLocalFormat;
    private String contactNumberInternationalFormat;
    private String contactNumberType;
    private String gender;
    private Date birthday;
    private int age;
    private String membershipType;
    private double membershipValueBeforeTax;
    private double finalAmountAfterTax;
}
