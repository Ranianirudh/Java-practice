public class Mountain {
    String name;
    int heightOfThePeak;
    public Mountain(String name,int heightOfThePeak){
        this.name=name;
        this.heightOfThePeak=heightOfThePeak;
    }
    public static void main(String[] args) {
        Mountain m1=new Mountain("Everest",8848);
        Mountain m2=new Mountain("K2",8611);
        findTallestMountain(m1, m2);
        findTallestMountain(m1, null);
    }

    private static void findTallestMountain(Mountain m1, Mountain m2) {
        try {
            if (m1.heightOfThePeak > m2.heightOfThePeak) {
                System.out.println(m1.heightOfThePeak + " mount " + m1.name + " is the Largest Mountain in the World");
            } else {
                System.out.println(m2.heightOfThePeak + " mount " + m2.name + "is the Largest Mountain in the World");
            }
        }
        catch(Exception e){
            System.out.println("null pointer exception");
        }
    }
}
