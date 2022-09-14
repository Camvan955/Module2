package ss7_abstract_class_and_interface.exercise.interface_resizeable;

public class InterfaceResizeableTest {
    public static void main(String[] args) {
        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0] = new Circle();
        resizeables[1] = new Rectangle();
        resizeables[2] = new Square();
        int x = (int)(Math.random()*100);
        for(Resizeable resizeable:resizeables){
            resizeable.resize(x);

            System.out.println(resizeable);
        }
        System.out.println("increate: "+x+"%");
    }
}
