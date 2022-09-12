package ss5_access_modifier_static_method_static_property.exercise.access_modifier2;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("Mai", "C07");
        Student student2 = new Student("Nga", "C07");
        System.out.println(student1.toString());
        System.out.println(student2.toString());

        student1.setName("Nhung");
        student1.setClasses("C08");
        student2.setName("Hoa");
        student2.setClasses("C05");
        System.out.println(student1.toString());
        System.out.println(student2.toString());

    }
}
