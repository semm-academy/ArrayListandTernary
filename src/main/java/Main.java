import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        // Iterable --> Collections --> List --> ArrayList

        int[] array = {1, 6, 3, 5, 0, 15, 2};
        int[] array2 = new int[5];
        int[] array3;
        int array4[];

        array[0] = 5;

//        Arrays.sort(array);
//
//        for (int item : array) {
//            System.out.print(item + " ");
//        }

        // Array de sinirlar belli olmalidir.
        // Sadece tek tip data tutabilir.
        // Remove islemi zordur.


//        System.out.println("\n-------------");

        // ArrayList sinirli olma sorununu cozer.
        // Coklu tipte veri tutabilir.
        // Remove islemi cok kolay.

//        ArrayList<Integer> list = new ArrayList();
//        list.add(5);
//        list.add(3);
//        list.add(4);
//        list.add(7);
//        list.add(3);
//
//        list.remove(Integer.valueOf(7));

//        list.clear();

//        list.add(4, 100);
//        list.set(4, 50);

//        System.out.println(list.get(4));


//        System.out.println(list.isEmpty());

//        Collections.sort(list);

//        Object[] listArray = list.toArray();

//        System.out.println(list.size());
//
//        for (int item : list) {
//            System.out.print(item + " ");
//        }



//        int num = 5;
//
//        if (num > 4) {
//            System.out.println("num 4 den buyuktur");
//        } else {
//            System.out.println("num 4 den kucuktur");
//        }
//
//        boolean isEmpty = false;
//                                        // TRUE            FALSE
//                                        // ----            -----
//        System.out.println(isEmpty ? "Evet Bos" : "Hayir bos degil");


        int x = 5;
                                    // TRUE         FALSE
        System.out.println(x > 2 ? (x < 4 ? 10 : 8) : 7);

        if (x > 2) {
            if (x < 4) {
                System.out.println(10);
            } else {
                System.out.println(8);
            }
        } else {
            System.out.println(7);
        }

    }
}
