package ru.sberhealth.rgs.request;

import lombok.Data;

@Data
public class CreateUserRequest {
    private String name;
    private String job;
}
