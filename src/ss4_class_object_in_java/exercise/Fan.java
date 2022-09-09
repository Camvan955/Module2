package ss4_class_object_in_java.exercise;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }

    public String toString() {
        if (isOn()) {
            return " Speed " + getSpeed()+ " Color " + getColor() + " Radius " + getRadius() + " fan is on";
        } else {
            return " Color " + getColor() + " Radius " + getRadius() + " fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.SLOW);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println("fan1: " + fan1);
        System.out.println("fan2: " + fan2);
    }

}
