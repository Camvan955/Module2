package ss5_access_modifier_static_method_static_property.exercise.access_modifier2;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Vân", "C07");
        student.setName("Đức");
        System.out.println(student.getName());
        student.setClasses("C007");
        System.out.println(student.getClasses());
    }
}
