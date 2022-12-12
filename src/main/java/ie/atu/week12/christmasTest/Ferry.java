package ie.atu.week12.christmasTest;

public class Ferry extends Ship{
    private int maxPassengers;

    public Ferry(int maxPassengers) {
        this.maxPassengers=maxPassengers;
    }

    public Ferry(String name, String yearBuilt, int numOfCrew, int maxPassengers) {
        super(name, yearBuilt, numOfCrew);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public String vesselDetails() {
        return String.format("MaxPassengers: [%d]", maxPassengers);
    }
}
