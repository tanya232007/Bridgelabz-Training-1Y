package MultiThreading;

    class Order implements Runnable {
        private String orderId;
        private String restaurant;
        private int deliveryTime;
        private String deliveryType;
        private int priority;

        public Order(String orderId, String restaurant, int deliveryTime, String deliveryType, int priority) {
            this.orderId = orderId;
            this.restaurant = restaurant;
            this.deliveryTime = deliveryTime;
            this.deliveryType = deliveryType;
            this.priority = priority;
        }

        @Override
        public void run() {
            long start = System.currentTimeMillis();
            System.out.println(Thread.currentThread().getName() + " handling Order " + orderId + " from " + restaurant + " (" + deliveryType + ", Priority: " + priority + ")");
            System.out.println("Order " + orderId + " Status: Picked up");
            try {
                Thread.sleep(deliveryTime * 1000 / 2);
                System.out.println("Order " + orderId + " Status: In Transit");
                Thread.sleep(deliveryTime * 1000 / 2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Order " + orderId + " Status: Delivered");
            long end = System.currentTimeMillis();
            System.out.println("Total delivery time for Order " + orderId + ": " + (end - start) / 1000.0 + " seconds\n");
        }
    }

       class FoodDeliverySimulation {
        public static void main(String[] args) {
            Order o1 = new Order("O101", "Pizza Hut", 6, "Express", 10);
            Order o2 = new Order("O102", "Dominos", 8, "Standard", 5);
            Order o3 = new Order("O103", "Burger King", 10, "Economy", 3);
            Order o4 = new Order("O104", "Subway", 5, "Express", 10);
            Order o5 = new Order("O105", "KFC", 7, "Standard", 5);

            Thread t1 = new Thread(o1, "Agent-1");
            Thread t2 = new Thread(o2, "Agent-2");
            Thread t3 = new Thread(o3, "Agent-3");
            Thread t4 = new Thread(o4, "Agent-4");
            Thread t5 = new Thread(o5, "Agent-5");

            t1.setPriority(10);
            t2.setPriority(5);
            t3.setPriority(3);
            t4.setPriority(10);
            t5.setPriority(5);

            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();
        }
    }

