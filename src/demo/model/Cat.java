package demo.model;

public class Cat extends Animal {
    private double weight;

    public Cat() {
    }

    public Cat(double weight) {
        this.weight = weight;
    }

    public Cat(String id, String color, String eat, double weight) {
        super(id, color, eat);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s",super.getId(),super.getColor(),super.getEat(),getWeight());
    }

}
