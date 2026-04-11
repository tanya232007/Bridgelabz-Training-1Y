package Assignment14;
import java.util.*;

public class StudentMarksReport {


        public static void main(String[] args) {

            Object[] inputs = {"85", 95, Integer.valueOf(88), "null", null, "abc", 76};

            List<Integer> validMarks = new ArrayList<>();

            for (Object input : inputs) {
                Integer mark = convertToInteger(input);
                if (mark != null) {
                    validMarks.add(mark);
                }
            }

            if (!validMarks.isEmpty()) {
                double average = validMarks.stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0.0);
                System.out.println("Valid Marks: " + validMarks);
                System.out.println("Average Marks: " + average);
            } else {
                System.out.println("No valid marks found.");
            }
        }

        private static Integer convertToInteger(Object input) {
            try {
                if (input == null) {
                    return null;
                }
                if (input instanceof Integer) {
                    return (Integer) input;
                }
                if (input instanceof String) {
                    String str = (String) input;
                    if (str.equalsIgnoreCase("null")) {
                        return null;
                    }
                    return Integer.valueOf(str);
                }
            } catch (NumberFormatException e) {

            }
            return null;
        }
    }

