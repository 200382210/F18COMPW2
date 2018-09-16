package Models;

import javafx.scene.image.Image;

import java.sql.SQLException;
import java.util.ArrayList;

public class MobilePhone {
    
    private String make,model,os;
    private double screenSize,memory, frontCameraRes, rearCameraRes,price;
    private Image phoneImage;

    public MobilePhone(String make, String model, String os) {
        setmake(make);
        setmodel(model);
        setos(os);
    }

    public MobilePhone(String make, String model, String os, double screenSize, double memory, double frontCameraRes, double rearCameraRes, double price) {
        this(make, model, os);
        setScreenSize(screenSize);
        setMemory(memory);
        setFrontCameraRes(frontCameraRes);
        setRearCameraRes(rearCameraRes);
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) throws SQLException {
        ArrayList<String> validMakes=DBConnect.getPhoneManufacturers();
        if(validMakes.contains(make))
        this.make = make;
        else
            throw new IllegalArgumentException("Valid makes are: "+validMakes);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        if(model.isEmpty() )
        this.model = model;
        else
            throw new IllegalArgumentException("Models cannot be empty");
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        if(model.isEmpty() )
        this.os = os;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public double getFrontCameraRes() {
        return frontCameraRes;
    }

    public void setFrontCameraRes(double frontCameraRes) {
        this.frontCameraRes = frontCameraRes;
    }

    public double getRearCameraRes() {
        return rearCameraRes;
    }

    public void setRearCameraRes(double rearCameraRes) {
        this.rearCameraRes = rearCameraRes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Image getPhoneImage() {
        return phoneImage;
    }

    public void setPhoneImage(Image phoneImage) {
        this.phoneImage = phoneImage;
    }
}
