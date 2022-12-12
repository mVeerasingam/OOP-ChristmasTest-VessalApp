package ie.atu.week12.christmasTest;

public class Ship {
    private String name;
    private String yearBuilt;
    private int numOfCrew;

    public Ship() {
    }

    public Ship(String name, String yearBuilt, int numOfCrew) {
        this.name = name;
        this.yearBuilt = yearBuilt;
        this.numOfCrew = numOfCrew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getNumOfCrew() {
        return numOfCrew;
    }

    public void setNumOfCrew(int numOfCrew) {
        this.numOfCrew = numOfCrew;
    }

    public String vesselDetails(){
        return String.format("NameOfShip: [%s], YearBuilt: [%s], MinimumNumOfCrew: [%d]",name,yearBuilt,numOfCrew);
    }


}
