package demo.model;

public abstract class Animal {
    private String id;
    private String color;
    private String eat;

    public abstract String getInfo();

    public Animal() {
    }

    public Animal(String id, String color, String eat) {
        this.id = id;
        this.color = color;
        this.eat = eat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id='" + id + '\'' +
                ", color='" + color + '\'' +
                ", eat='" + eat + '\'' +
                '}';
    }


}
