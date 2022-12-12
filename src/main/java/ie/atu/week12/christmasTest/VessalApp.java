package ie.atu.week12.christmasTest;

public class VessalApp {
    public static void main(String[] args) {
        Ship ship = new Ship("SS. Plennon", "1912", 111);
        System.out.println(ship.vesselDetails());

        ship.setName("FerryName: [Ferry], ");
        Ferry ferry = new Ferry(287);
        System.out.print(ship.getName());
        System.out.println(ferry.vesselDetails());

        ship.setName("TrawlerName: [Big Trawler], ");
        Trawler trawler = new Trawler(60);
        System.out.print(ship.getName());
        System.out.println(trawler.vesselDetails());


    }
}
