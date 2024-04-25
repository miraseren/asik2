import Classes.MyArrayList;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        checkMyArrayList();
    }

    private static <T> void checkMyArrayList() {
        MyArrayList<T> myArrayList = new MyArrayList<T>() {
            @Override
            public Iterator iterator() {
                return null;
            }
        };
        myArrayList.add(11.5);
        myArrayList.add(10);
        myArrayList.add(9);
        myArrayList.add(8.7);
        myArrayList.add(7);
        myArrayList.add(0);
        myArrayList.set(0,2);
        myArrayList.addLast(-123);
        myArrayList.addFirst(123);
        for(int i = 0; i < myArrayList.size(); i++) {
            System.out.print( myArrayList.get(i) + " ");
        }
        System.out.println();
        myArrayList.sort();
        for(int i = 0; i < myArrayList.size(); i++) {
            System.out.print( myArrayList.get(i) + " ");
        }
        myArrayList.removeLast();
        myArrayList.removeFirst();
        myArrayList.remove(3);

        System.out.println();
        System.out.println(myArrayList.getLast());
        System.out.println(myArrayList.getFirst());
        System.out.println(myArrayList.get(3));

        System.out.println(myArrayList.indexOf(0));
        myArrayList.add(11.5);
        myArrayList.add(11.5);
        System.out.println(myArrayList.lastIndexOf(11.5));
        System.out.println();
        System.out.println(myArrayList.exists(6) ? "6 exists" : "6 doesn't exist");
        myArrayList.clear();
    }
}
