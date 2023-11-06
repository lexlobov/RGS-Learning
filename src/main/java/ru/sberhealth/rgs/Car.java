package ru.sberhealth.rgs;

public class Car {

    private String model;
    private double horsePower;
    private String type;
    private int wheels;

        public Car(String model, double horsePower){
            this.model = model;
            this.horsePower = horsePower;
        };

        public void setModel(String model){
            this.model = model;
        };

        public void setHorsePower(double horsePower){
            this.horsePower = horsePower;
    };

        public void setCarType(CarTypes carTypes){
            this.type = carTypes.getCarType();
    };

        public void setWheels(int wheels){
            this.wheels = wheels;
    };

        public String getModel(){
            return model;
    };

        public double getHorsePower(){
            return horsePower;
    };

        public String getCarType(){
            return type;
    };

        public int getWheels(){
            return wheels;
    };

        public Car(){

        };

        @Override
        public String toString(){
            return ("Car:\n" +
                    "model: "+ model + "\n"+
                    "horsePower: " + horsePower + "\n" +
                    "type: " + type + "\n" +
                    "wheels: " + wheels);
            }
    }
