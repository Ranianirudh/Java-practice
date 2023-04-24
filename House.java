public class House {
    int noOfDoors;
    int noOfWindows;
    public void keepSecure() {
        System.out.println("Secured home, noOfDoors: " + noOfDoors + " noOfWindows: " + noOfWindows + " locked");
    }
    public static void main(String[] args) {
        House myHouse=new House();
        myHouse.noOfDoors=6;
        myHouse.noOfWindows=8;
        myHouse.keepSecure();
    }
}



