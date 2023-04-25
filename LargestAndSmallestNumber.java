public class LargestAndSmallestNumber{

    public void getMax(int max1,int max2,int max3){
        if(max1>max2 && max1>max3){
            System.out.println(max1 + " is Largest number");
        } else if (max2>max1 && max2>max3) {

            System.out.println(max2 + " is Largest number");
        }else
            System.out.println(max3 + " is Largest number");

    }
    public void getMin(int min1,float min2,int min3){
        if(min1<min2 &&min1<min3){
            System.out.println(min1 +"is Smallest number");
        } else if (min2<min3 && min2<min1) {
            System.out.println(min2 + "is Smallest number");
        }
        else
            System.out.println(min3 + "is smallest number");

    }
    public static void main(String[] args) {
        LargestAndSmallestNumber large=new LargestAndSmallestNumber();
        large.getMax(93,67,125);
        LargestAndSmallestNumber small=new LargestAndSmallestNumber();
        small.getMin(34,2.9f,57);
    }


}
