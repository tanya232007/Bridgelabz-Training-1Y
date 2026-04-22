package StreamAPI;
    import java.util.Arrays;
import java.util.List;

    class IoTSensor {
        public static void main(String[] args) {
            List<Integer> readings = Arrays.asList(45, 60, 30, 75, 90, 25);
            int threshold = 50;

            System.out.println("Sensor readings above threshold:");
            readings.stream()
                    .filter(r -> r > threshold)
                    .forEach(r -> System.out.println(r));
        }
    }


