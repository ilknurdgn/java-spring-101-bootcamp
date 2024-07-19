package lectureNotes.week1.day2;

import java.util.ArrayList;
import java.util.List;

public class StackMemoryError {
      public static void main(String[] args) {
        //  stackOverflowExc(0);
        heapMemoryExc();

        List<Integer> test = new ArrayList<>();

    }

    public static void stackOverflowExc(int number) {
        System.out.println("Number: " + number);
        if (number == 1) {
            System.out.println();
        } else {
            stackOverflowExc(number += 10000000);
        }
    }

    public static void heapMemoryExc() {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (true) {
            String name = new String("Emine");
            System.out.println(i + ". " + name);
            //  list.add(name);
            i++;
        }
    }
}
