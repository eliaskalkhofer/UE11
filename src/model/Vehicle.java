/**
 * @class: Vehicle
 * @author: Elias Kalkhofer
 * @date: 14.01.2021
 */

package model;

public class Vehicle {
    private String color;
    private String owner;
    private String manufacturer;
    private String model;
    private String licensePlate;

    public Vehicle() {
    }

    public String getColor() {
        return this.color;
    }

    public String getOwner() {
        return this.owner;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String toString() {
        return "Fahrzeug: \nFarbe = " + this.color + "\nBesitzer = " + this.owner + "\nHersteller = " + this.manufacturer + "\nModell = " + this.model + "\nKennzeichen = " + this.licensePlate + "\n";
    }
}
