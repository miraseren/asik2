import Classes.MyArrayList;
import Classes.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        checkMyArrayList();
        checkMyLinkedList();
    }

    private static void checkMyLinkedList() {
    }

    private static <T> void checkMyArrayList() {
        MyArrayList<T> myArrayList =  new MyArrayList<T>();
        private static void checkMyArrayList() {
            MyArrayList myArrayList = new MyArrayList();
            myArrayList.add(12);
            myArrayList.add(11.5);
            myArrayList.add(9.3);
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
        private static void checkMyLinkedList() {
            MyLinkedList myLinkedList = new MyLinkedList();
            myLinkedList.add(11);
            myLinkedList.add(10.5);
            myLinkedList.add(9);
            myLinkedList.add(8);
            myLinkedList.add(7);
            myLinkedList.add(0);
            myLinkedList.addLast(-123);
            myLinkedList.addFirst(123);
            for (Object item : myLinkedList) {
                System.out.print(item + " ");
            }
            System.out.println();

            myLinkedList.sort();
            for (Object item : myLinkedList) {
                System.out.print(item + " ");
            }

            myLinkedList.removeLast();
            myLinkedList.removeFirst();
            myLinkedList.remove(3);

            System.out.println();
            System.out.println(myLinkedList.getLast());
            System.out.println(myLinkedList.getFirst());
            System.out.println(myLinkedList.get(3));

            System.out.println(myLinkedList.indexOf(0));
            myLinkedList.add(11);
            myLinkedList.add(11);
            System.out.println(myLinkedList.lastIndexOf(11));
            System.out.println();
            System.out.println(myLinkedList.exists(6) ? "6 exists" : "6 doesn't exist");
            myLinkedList.clear();
        }
    }