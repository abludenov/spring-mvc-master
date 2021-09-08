package web.model;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class Car {
    private String carProduce;
    private String carModel;
    private int carSerialNumber;

    public Car() {
    }

    public Car(String carProduce, String carModel, int carSerialNumber) {
        this.carProduce = carProduce;
        this.carModel = carModel;
        this.carSerialNumber = carSerialNumber;
    }

    public String getCarProduce() {
        return carProduce;
    }

    public void setCarProduce(String carProduce) {
        this.carProduce = carProduce;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarSerialNumber() {
        return carSerialNumber;
    }

    public void setCarSerialNumber(int carSerialNumber) {
        this.carSerialNumber = carSerialNumber;
    }

    @Override
    public String toString() {
        return "Car: " + carProduce + " " + carModel + ", carSerialNumber: " + carSerialNumber;
    }
}
