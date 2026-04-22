package Bounded;

public class Student<A,B,C> {

    private A name;
    private B rollno;
    private C percentage;

    public A getName() {
        return name;
    }

    public void setName(A name) {
        this.name = name;
    }

    public B getRollno() {
        return rollno;
    }

    public void setRollno(B rollno) {
        this.rollno = rollno;
    }

    public C getPercentage() {
        return percentage;
    }

    public void setPercentage(C percentage) {
        this.percentage = percentage;
    }

    public Student(A name, B rollno, C percentage) {
        this.name = name;
        this.rollno = rollno;
        this.percentage = percentage;



    }
    public void extraInfo() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Percentage: " + percentage);
    }



}

