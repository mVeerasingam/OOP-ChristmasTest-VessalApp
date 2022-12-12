package ie.atu.week12.christmasTest;

public class VessalApp {
    public static void main(String[] args) {
        Ship ship = new Ship("SS. Plennon", "1912", 111);
        System.out.println(ship.vesselDetails());

        Ferry ferry = new Ferry(87);
        System.out.println(ferry.vesselDetails());
    }
}
