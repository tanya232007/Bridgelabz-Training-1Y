package Assignment14;

import java.util.ArrayList;
import java.util.List;

    public class Question3 {
        public void autoBoxing() {
            List<Integer> list = new ArrayList<>();

            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            System.out.println("List=" + list);
            int sum = 0;
            for (Integer num : list) {
                sum += num;
            }
            System.out.println("sum of list=" + sum);

        }

        public static void main(String[] args) {
            Question3 q3 = new Question3();
            q3.autoBoxing();

        }
    }

