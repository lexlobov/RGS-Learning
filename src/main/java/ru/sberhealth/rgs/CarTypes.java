package ru.sberhealth.rgs;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CarTypes {

    TRUCK("truck"),
    PASSENGER("passenger");

    public final String carType;
}
