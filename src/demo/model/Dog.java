package demo.model;

public class Dog extends Animal {
    private String bark;



    public Dog() {
    }

    public Dog(String bark) {
        this.bark = bark;
    }

    public Dog(String id, String color,String eat, String bark) {
        super(id, color,eat);
        this.bark = bark;
    }

    public String getBark() {
        return bark;
    }

    public void setBark(String bark) {
        this.bark = bark;
    }

    @Override
    public String toString() {
        return "Dog{" +super.toString()+
                "bark='" + bark + '\'' +
                '}';
    }
    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s", super.getId(),super.getColor(),super.getEat(),getBark());
    }
}
