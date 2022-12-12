package ie.atu.week12.christmasTest;

public class Trawler extends Ship{
    private int cargo;

    public Trawler(int cargo) {
        this.cargo=cargo;
    }

    public Trawler(String name, String yearBuilt, int numOfCrew, int cargo) {
        super(name, yearBuilt, numOfCrew);
        this.cargo = cargo;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    @Override
    public String vesselDetails() {
        return String.format("Cargo: [%d Tonnes]",cargo);
    }
}
