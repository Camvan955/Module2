package ss7_abstract_class_and_interface.practice.animal_class_and_interface_edible.Animal;

import ss7_abstract_class_and_interface.practice.animal_class_and_interface_edible.Ediable.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return null;
    }
}
