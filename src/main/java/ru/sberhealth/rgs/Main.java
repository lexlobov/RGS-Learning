package ru.sberhealth.rgs;

public class Main {

    public static void main(String[] args) {
        BuilderExample customer = new BuilderExample()
                .withName("Sarah")
                .withLastName("Jones")
                .withPhoneNumber("+79995550173")
                .withHomeTown("Springfield");

        BuilderExample customer2 = new BuilderExample()
                .withName("Jack")
                .withLastName("Heeley")
                .withTimeZone(180);
    }
}
