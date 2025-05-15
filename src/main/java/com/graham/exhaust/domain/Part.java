package com.graham.exhaust.domain;

import com.graham.exhaust.validators.ValidMaximumProduct;
import com.graham.exhaust.validators.ValidMinimumProduct;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 *
 *
 *
 */
@Entity
@ValidMinimumProduct
@ValidMaximumProduct
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="part_type",discriminatorType = DiscriminatorType.INTEGER)
@Table(name="Parts")
public abstract class Part implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String name;
    @Min(value = 0, message = "Price value must be positive")
    double price;
    @Min(value = 0, message = "Inventory value must be positive")
    int inv;

    @ManyToMany
    @JoinTable(name="product_part", joinColumns = @JoinColumn(name="part_id"),
            inverseJoinColumns=@JoinColumn(name="product_id"))
    Set<Product> products= new HashSet<>();

    public Part() {
    }

    @Min(value = 0, message = "Minimum inventory must be a positive value.")
    int minInv;

    @Min(value = 0, message = "Maximum inventory must be a positive value.")
    @Max(value = 100, message = "Maximum inventory must not exceed set maximum value.")
    int maxInv;

    public Part(String name, double price, int inv) {
        this.name = name;
        this.price = price;
        this.inv = inv;
        this.minInv = 0; // default is 0
        this.maxInv = 0; // default is 100
    }

    public Part(long id, String name, double price, int inv, int minInv, int maxInv) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inv = inv;
        this.minInv = minInv; // default is 0
        this.maxInv = maxInv; // default is 100
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInv() {
        return inv;
    }

    public void setInv(int inv) {
        this.inv = inv;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public int getMinInv() {return minInv;}

    public void setMinInv(int minInv) {this.minInv = minInv;}

    public int getMaxInv() {return maxInv;}

    public void setMaxInv(int maxInv) {this.maxInv = maxInv;}

    public String toString(){
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Part part = (Part) o;

        return id == part.id;
    }

    public void inventoryVerification() {
        if (this.inv < this.minInv) {
            throw new RuntimeException("Inventory value is below the minimum requirement.");
        }
        else if (this.inv > this.maxInv) {
            throw new RuntimeException("Inventory value is above the maximum allowable.");
        }
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
