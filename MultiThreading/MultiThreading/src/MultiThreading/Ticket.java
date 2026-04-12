package MultiThreading;
    import java.util.*;

    class Ticket extends Thread {
        private int ticketNumber;
        private String type;
        private int priority;
        private int processingTime;

        public Ticket(int ticketNumber, String type, int priority) {
            this.ticketNumber = ticketNumber;
            this.type = type;
            this.priority = priority;
            this.processingTime = new Random().nextInt(5) + 1; // 1–5 seconds
            setName("Agent-" + ticketNumber);
            setPriority(priority);
        }

        @Override
        public void run() {
            long start = System.currentTimeMillis();
            System.out.println(getName() + " START Ticket " + ticketNumber + " (" + type + ", Priority: " + priority + ")");
            try {
                Thread.sleep(processingTime * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long end = System.currentTimeMillis();
            System.out.println(getName() + " COMPLETE Ticket " + ticketNumber + " (" + type + ") in " + (end - start) / 1000.0 + " seconds");
        }

        public int getPriorityLevel() {
            return priority;
        }

        public int getProcessingTime() {
            return processingTime;
        }

        public String getType() {
            return type;
        }
    }

      class CustomerSupportSystem {
        public static void main(String[] args) {
            List<Ticket> tickets = new ArrayList<>();
            tickets.add(new Ticket(1, "Critical Bug", 10));
            tickets.add(new Ticket(2, "Feature Request", 4));
            tickets.add(new Ticket(3, "General Query", 2));
            tickets.add(new Ticket(4, "Feedback", 1));
            tickets.add(new Ticket(5, "Critical Bug", 10));
            tickets.add(new Ticket(6, "Feature Request", 4));
            tickets.add(new Ticket(7, "General Query", 2));
            tickets.add(new Ticket(8, "Feedback", 1));
            tickets.add(new Ticket(9, "Critical Bug", 10));
            tickets.add(new Ticket(10, "Feature Request", 4));

            tickets.sort((t1, t2) -> Integer.compare(t2.getPriorityLevel(), t1.getPriorityLevel()));

            System.out.println("Queue Position (by priority):");
            for (int i = 0; i < tickets.size(); i++) {
                System.out.println("Position " + (i + 1) + ": Ticket " + (i + 1) + " (" + tickets.get(i).getType() + ", Priority " + tickets.get(i).getPriorityLevel() + ")");
            }

            long totalStart = System.currentTimeMillis();
            for (Ticket t : tickets) {
                t.start();
            }

            for (Ticket t : tickets) {
                try {
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            long totalEnd = System.currentTimeMillis();
            System.out.println("Total processing time: " + (totalEnd - totalStart) / 1000.0 + " seconds");

            Map<Integer, List<Integer>> stats = new HashMap<>();
            for (Ticket t : tickets) {
                stats.computeIfAbsent(t.getPriorityLevel(), k -> new ArrayList<>()).add(t.getProcessingTime());
            }

            System.out.println("\nAverage wait time per priority level:");
            for (Map.Entry<Integer, List<Integer>> entry : stats.entrySet()) {
                double avg = entry.getValue().stream().mapToInt(Integer::intValue).average().orElse(0);
                System.out.println("Priority " + entry.getKey() + ": " + avg + " seconds");
            }
        }
    }

