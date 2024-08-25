package com.smart.banking.application.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {

    private int id;
    private String accountHolderName;
    private String accountNumber;
    private String ifscCode;
    private String phoneNumber;
    private String address;
    private String email;
    private int age;
    private String nominee;
    private double availableBalance;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", nominee='" + nominee + '\'' +
                ", availableBalance=" + availableBalance +
                '}';
    }
}
