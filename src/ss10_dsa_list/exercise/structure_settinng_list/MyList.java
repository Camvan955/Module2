package ss10_dsa_list.exercise.structure_settinng_list;

import java.util.Arrays;

public class MyList<E> {
    public Object[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACTITY = 10;

    // private Object elements[];

    //sức chứa mặc định khi khởi tạo constructor kh có tham số
    public MyList() {
        elements = new Object[DEFAULT_CAPACTITY];
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity" + capacity);
        }
    }

    public void add(int index, E e) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index:" + index);
        } else if (elements.length == index) {
            this.ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = e;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = e;
            size++;
        }

    }

    public int size() {
        return this.size;
    }

    public void clean() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public boolean add(E e) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = e;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("mincapacity" + minCapacity);
        }
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public int indexOf(E e) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(e)) {
                return i;
            }
        }
        return index;
    }

    public boolean contains (E e) {
        return this.indexOf(e) >= 0;
    }

    public MyList<E> clone() {
        MyList<E> v= new MyList<>();
        v.elements = Arrays.copyOf(elements,size);
        v.size = this.size;
        return v;
    }

//    public E remove(int index) {
//        if (index < 0 || index > elements.length) {
//            throw new IllegalArgumentException("Error index:" + index);
//
//            E element = (E) elements(index){
//                for (int i = 0; i < size-1; i++) {
//                    elements[i] = elements[i+1];
//
//                }
//                elements[size -1 ] = null;
//                size --;
//                return element;
//            }
//        }
//    }

}


