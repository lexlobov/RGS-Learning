package ru.sberhealth.rgs;

import lombok.AllArgsConstructor;
import lombok.Getter;

// добавил для примера геттер с использованием библиотеки Lombok, как в проекте.
// Lombok позволяет значительно сократить ко-во кода используя аннотации
@Getter
@AllArgsConstructor
public enum CarTypes {

    TRUCK("truck"),
    PASSENGER("passenger");

    public final String carType;
}
