public class Calculator {
    int input1;
    int input2;
    int result;
    public int addition(){
        result=input1+input2;
        return result;
    }
    public int subtraction(){
        result=input1-input2;
        return result;
    }
    public int multiplication(){
        result=input1*input2;
        return result;
    }
    public float division(){
        result=input1/input2;
        return result;
    }
    public static void main(String[] args){
        Calculator myCalculator=new Calculator();
        myCalculator.input1=60;
        myCalculator.input2=20;
       int add= myCalculator.addition();
       System.out.println("addition of 2 numbers " +add);
       int sub=myCalculator.subtraction();
       System.out.println("subtraction of 2 numbers " +sub);
       int mul= myCalculator.multiplication();
       System.out.println("multiplication of 2 numbers " +mul);
       float div=myCalculator.division();
       System.out.println("division of 2 numbers " +div);

    }
}
