package org.example.Exercice005;

import java.time.LocalDate;

public class Product {

    private int id;

    public static int baseEvolutionRate;

    private String name;

    private String category;
    private double sellin;
    private double quality;

    public Product(){
    }


    public Product(String name, String category, double sellin, double quality, ){
        this.name = name;
        this.category = category;
        this.sellin = sellin;
        this.quality = quality;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getSellin() {
        return sellin;
    }

    public void setSellin(double sellin) {
        this.sellin = sellin;
    }

    public double getQuality() {
        return quality;
    }

    public void setQuality(double quality) {
        this.quality = quality;
    }



    public double factorQuality() {
        if (category == "Dairy" && name != "Brie vieilli") {
            switch ((int) sellin) {
                case 1:
                    return -2;
                case 2:
                    return -4;
                default:
                    return -1;
            }
        } else {
            switch ((int) sellin) {
                case 1:
                    return -2;
                case 2:
                    return -4;
            }
        }
    }

}
