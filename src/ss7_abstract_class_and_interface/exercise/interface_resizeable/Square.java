package ss7_abstract_class_and_interface.exercise.interface_resizeable;

import ss6_inheritance.practice.shape.rectangle.Rectangcle;
import ss7_abstract_class_and_interface.exercise.interface_resizeable.Resizeable;

public class Square extends Rectangcle implements Resizeable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
    }

    public double setArea() {
        return getSide() * getSide();
    }

    @Override
    public String toString() {
        return "Hình vuông có độ dài cạnh là: "
                + getSide()
                + ", có chu vi là: "
                + setArea();
    }

    public void resize(double percent) {
        setSide(getSide() * percent / 100 + getSide());
    }
}
