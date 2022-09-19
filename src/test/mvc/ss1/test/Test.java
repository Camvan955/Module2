package test.mvc.ss1.test;


import test.mvc.ss1.model.CounterModel;

public class Test {
    public static void main(String[] args) {
        CounterModel ct = new CounterModel();
        System.out.println(ct.getValue()); // 0
        ct.increment();
        ct.increment();
        ct.increment();
        System.out.println(ct.getValue()); // 3
        ct.decrement();
        System.out.println(ct.getValue()); //2
        ct.setValue();
        System.out.println(ct.getValue());
        ct.setValue(2+3);
        System.out.println(ct.getValue());
    }
}
