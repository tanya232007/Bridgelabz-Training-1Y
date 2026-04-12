class StudentEntry implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Monitoring student entry... State: " + Thread.currentThread().getState());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class QuestionPaperDistribution implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " Distributing question papers... State: " + Thread.currentThread().getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class AttendanceMarking implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(10000);
            System.out.println(Thread.currentThread().getName() + " Marking attendance... State: " + Thread.currentThread().getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class AnswerSheetCollection implements Runnable {
    private int examDuration;
    public AnswerSheetCollection(int examDuration) {
        this.examDuration = examDuration;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(examDuration * 1000);
            System.out.println(Thread.currentThread().getName() + " Collecting answer sheets... State: " + Thread.currentThread().getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

  class UniversityExamHallManagement {
    public static void main(String[] args) {
        Thread entryThread = new Thread(new StudentEntry(), "EntryThread");
        Thread paperThread = new Thread(new QuestionPaperDistribution(), "PaperThread");
        Thread attendanceThread = new Thread(new AttendanceMarking(), "AttendanceThread");
        Thread collectionThread = new Thread(new AnswerSheetCollection(15), "CollectionThread");

        entryThread.setPriority(5);
        paperThread.setPriority(10);
        attendanceThread.setPriority(8);
        collectionThread.setPriority(7);

        System.out.println("Initial States:");
        System.out.println("EntryThread: " + entryThread.getState());
        System.out.println("PaperThread: " + paperThread.getState());
        System.out.println("AttendanceThread: " + attendanceThread.getState());
        System.out.println("CollectionThread: " + collectionThread.getState());

        entryThread.start();
        paperThread.start();
        attendanceThread.start();
        collectionThread.start();

        try {
            entryThread.join();
            paperThread.join();
            attendanceThread.join();
            collectionThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final States:");
        System.out.println("EntryThread: " + entryThread.getState());
        System.out.println("PaperThread: " + paperThread.getState());
        System.out.println("AttendanceThread: " + attendanceThread.getState());
        System.out.println("CollectionThread: " + collectionThread.getState());
    }
}