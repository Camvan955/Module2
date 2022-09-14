package ss7_abstract_class_and_interface.practice.animal_class_and_interface_edible.test;


import ss7_abstract_class_and_interface.practice.animal_class_and_interface_edible.Animal.Animal;
import ss7_abstract_class_and_interface.practice.animal_class_and_interface_edible.Animal.Chicken;
import ss7_abstract_class_and_interface.practice.animal_class_and_interface_edible.Animal.Tiger;
import ss7_abstract_class_and_interface.practice.animal_class_and_interface_edible.Ediable.Edible;
import ss7_abstract_class_and_interface.practice.animal_class_and_interface_edible.Fruit.Apple;
import ss7_abstract_class_and_interface.practice.animal_class_and_interface_edible.Fruit.Fruit;
import ss7_abstract_class_and_interface.practice.animal_class_and_interface_edible.Fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal: animals) {
            System.out.println(animal.makeSound());

            if(animal instanceof Chicken) {
                Edible edible= (Chicken) animal;
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0]= new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
