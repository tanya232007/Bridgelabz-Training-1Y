package Object;

public class Student {

    int id;
    double percentage;
    String  name;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, double percentage, String name) {
        this.id = id;
        this.percentage = percentage;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", percentage=" + percentage +
                ", name='" + name + '\'' +
                '}';
    }
}
