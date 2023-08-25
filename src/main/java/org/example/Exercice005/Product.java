package org.example.Exercice005;

public class Product {

    private int id;

    public static int baseEvolutionRate;

    private String name;

    private String category;
    private int sellin;
    private int quality;

    public Product(String name, String category, int sellin, int quality){
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

    public int getSellin() {
        return sellin;
    }

    public void setSellin(int sellin) {
        this.sellin = sellin;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getQualityEvolutionRate() {
        return qualityEvolutionRate;
    }

    public void setQualityEvolutionRate(int qualityEvolutionRate) {
        this.qualityEvolutionRate = qualityEvolutionRate;
    }
}
