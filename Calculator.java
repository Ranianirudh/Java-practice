import java.sql.SQLOutput;

public class Calculator {
    int input1;
    int input2;
    int result;

    public int addition() {
        result = input1 + input2;
        return result;
    }

    public int subtraction() {
        result = input1 - input2;
        return result;
    }

    public int multiplication() {
        result = input1 * input2;
        return result;
    }

    public float division() {
        try {
            result = input1 / input2;
        }
    catch(Exception e)
    {
        e.printStackTrace();
        System.out.println("divide by zero"); //Arithmetic Exception
    }
    return result;
}

    public static void main(String[] args){
        Calculator myCalculator=new Calculator();
        myCalculator.input1=60;
        myCalculator.input2=0;
        float div=myCalculator.division();
        System.out.println("division of 2 numbers " +div);
        myCalculator.input2=10;
        int add= myCalculator.addition();
        System.out.println("addition of 2 numbers " +add);
        int sub=myCalculator.subtraction();
        System.out.println("subtraction of 2 numbers " +sub);
        int mul= myCalculator.multiplication();
        System.out.println("multiplication of 2 numbers " +mul);


    }
}
