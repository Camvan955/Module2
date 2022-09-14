package ss7_abstract_class_and_interface.exercise.interface_colorable;

public class Square extends Geometry implements Colorable {
   private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double setArea() {
        return getSide() * getSide();
    }

    @Override
    public double getArea() {
        return getSide()*getSide();
    }

    public void howToColor(){
        System.out.println("Color all four sides");
    }

}
