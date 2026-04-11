package Assignment4;

public class Question2 {
    public void wrapperToPrimitve(){
        Double num1=33.33;
        double num2=33.33;

        int num3=(int)num2;

        System.out.println("Boolean datatype"+num1);
        System.out.println("object datatype"+num2);
        System.out.println("integer datatype"+num3);

    }
    public static void main(String[] args){
        Question2 q2=new Question2();
        q2.wrapperToPrimitve();
    }
}