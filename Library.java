public class Library {
    private String name;
    private String location;
    private int number;

    public Library(String name, String location, int number) {
        this.name = name;
        this.location = location;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void selLocation(String location) {
        this.location = location;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void addBook() {    }

    public void removeBook() {
    }

}
