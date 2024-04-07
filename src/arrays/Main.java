package arrays;

public class Main {
    public static void main(String[] args) {
        OwnArray array = new OwnArray(2);
        array.Insert(56);
        array.Insert(64);
        array.Insert(78);
        System.out.println(array);
        System.out.println(array.indexOf(64));
        // array.removeAt(1);
        System.out.println(array.max());
        System.out.println(array.min());
        array.reverse();
        System.out.println(array);
    }
}
