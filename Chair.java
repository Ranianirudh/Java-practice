public class Chair{
    float height;
    float width;
    float depth;
    int noOfWheels;
    String type;
//    height width noOfWheels
//  isMovable isSoftCushioned
//    officeChair diningChair
    public boolean isMovable() {
        if (noOfWheels > 0) {
            System.out.println("chair is movable");
            return true;
        } else {
            System.out.println("chair is not movable");
        }

        return false;
    }

    public boolean isCushioned() {
        try {
            if (type.equals("cushioned")) {
                System.out.println("chair is cushioned");
                return true;
            } else {
                System.out.println("chair is not cushioned");
            }
        }
        catch(Exception e){
            System.out.println("type not found");
        }
        return false;
        }
    public boolean officeChair(){
        if (isCushioned() && isMovable()) {
            return true;
        }
        return false;
    }
    public boolean diningChair(){
        if(!isMovable()){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Chair myChair=new Chair();
        myChair.noOfWheels=4;
        myChair.type="cushioned";
        myChair.height=18.1f;
        myChair.width=20;
        myChair.depth=18.0f;
        System.out.println(" Chair "+" Height :" +myChair.height+ " Width: "+ myChair.width + " Depth :" +myChair.depth+
                " noOfWheels: " +myChair.noOfWheels+ " type: " +myChair.type);
        myChair.officeChair();
        myChair.isMovable();

        myChair.type="non-cushioned";
        myChair.noOfWheels=0;
        myChair.isCushioned();
        myChair.diningChair();

        Chair anotherChair=new Chair();
        anotherChair.noOfWheels=5;
        anotherChair.height=19;
        anotherChair.width=17.4f;
        anotherChair.depth=19.1f;
        System.out.println(" Chair "+" Height :" +anotherChair.height+ " Width: "+ anotherChair.width + " Depth :" +anotherChair.depth+
                " noOfWheels: " +anotherChair.noOfWheels+ " type: " +anotherChair.type);
        anotherChair.officeChair();
        anotherChair.isMovable();
    }

}








