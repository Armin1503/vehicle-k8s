package at.htlleonding.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;

    // region Constructors
    public Vehicle() {
    }

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    // endregion

    // region Getter and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    // endregion

    @Override
    public String toString() {
        return String.format("%d: %s %s", id, brand, model);
    }
}
