public class Hospital {
    private String name;
    private String location;
    private int numberOfBeds;

    public Hospital(String name, String location, int numberOfBeds) {
        this.name =name;
        this.location = location;
        this.numberOfBeds = numberOfBeds;
    }

    public String getname() {
        return  name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getlocation() {
        return location;
    }

    public void setllocation(String Location) {
        this.location = location;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

}
