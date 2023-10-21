package ru.sberhealth.rgs;

import java.util.Objects;

public class Human {
    String name;
    String lastName;
    int age;
    String homeCountry;
    String profession;

    public Human(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Human() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(lastName, human.lastName) && Objects.equals(homeCountry, human.homeCountry) && Objects.equals(profession, human.profession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age, homeCountry, profession);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", homeCountry='" + homeCountry + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}
