import java.util.Scanner;
import java.util.Random;

public class Hotel {
    private String name;
    private String location;
    private String address;
    private int totalRooms;
    private int availableRooms;
    private int bookedRooms;
    private Booking currentBooking;

    public Hotel(String name, String location, String address, int totalRooms) {
        this.name = name;
        this.location = location;
        this.address = address;
        this.totalRooms = totalRooms;
        this.availableRooms = totalRooms;
        this.bookedRooms = 0;
        this.currentBooking = null;  
    }

    public int checkAvailability() {
        return availableRooms;
    }

    public void bookRoom(int numRooms, String checkInDate, String checkOutDate) {
        if (numRooms <= availableRooms) {
            availableRooms -= numRooms;
            bookedRooms += numRooms;
            String bookingReference = generateBookingReference();
            currentBooking = new Booking(numRooms, checkInDate, checkOutDate, bookingReference);
            System.out.println(numRooms + " room(s) booked successfully! Booking Reference: " + bookingReference);
        } else {
            System.out.println("Not enough available rooms to complete the booking.");
        }
    }

    public void viewBooking() {
        if (currentBooking != null) {
            currentBooking.displayBookingDetails();
        } else {
            System.out.println("You do not have any bookings yet.");
        }
    }

    public void cancelBooking() {
        if (currentBooking != null) {
            availableRooms += currentBooking.getNumRooms();
            bookedRooms -= currentBooking.getNumRooms();
            System.out.println("Booking with reference " + currentBooking.getBookingReference() + " has been canceled.");
            currentBooking = null;
        } else {
            System.out.println("You do not have any booking to cancel.");
        }
    }

    public void viewAllAvailableRooms() {
        System.out.println("Total Rooms: " + totalRooms);
        System.out.println("Available Rooms: " + availableRooms);
        System.out.println("Booked Rooms: " + bookedRooms);
    }

    public void hotelInfo() {
        System.out.println("Hotel: " + name);
        System.out.println("Location: " + location);
        System.out.println("Address: " + address);
    }

    private String generateBookingReference() {
        Random random = new Random();
        return "BR" + (1000 + random.nextInt(9000));
    }

    public void paymentStatus() {
        if (currentBooking != null) {
            System.out.println("Payment for booking " + currentBooking.getBookingReference() + " is pending.");
        } else {
            System.out.println("You do not have any booking to check the payment status.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel("Seaside Resort", "Beachside City", "123 Ocean Drive, Beachside City, Country", 100);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nWelcome, Our Esteemed Customer!");
            System.out.println("Options:");
            System.out.println("1. Book Room");
            System.out.println("2. View Booking");
            System.out.println("3. Edit Profile");
            System.out.println("4. Check Room Availability");
            System.out.println("5. Payment Status");
            System.out.println("6. Cancel Booking");
            System.out.println("7. View All Available Rooms");
            System.out.println("8. Exit");

            System.out.print("Please select an option (1-8): ");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    System.out.print("Enter number of rooms to book: ");
                    int numRooms = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Enter check-in date (yyyy-mm-dd): ");
                    String checkInDate = scanner.nextLine();
                    System.out.print("Enter check-out date (yyyy-mm-dd): ");
                    String checkOutDate = scanner.nextLine();
                    hotel.bookRoom(numRooms, checkInDate, checkOutDate);
                    break;

                case 2:
                    hotel.viewBooking();
                    break;

                case 3:
                    System.out.println("Profile editing is not implemented yet.");
                    break;

                case 4:
                    System.out.println("Available Rooms: " + hotel.checkAvailability());
                    break;

                case 5:
                    hotel.paymentStatus();
                    break;

                case 6:
                    hotel.cancelBooking();
                    break;

                case 7:
                    hotel.viewAllAvailableRooms();
                    break;

                case 8:
                    System.out.println("Thank you for using our services!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }

        scanner.close();
    }
}

class Booking {
    private int numRooms;
    private String checkInDate;
    private String checkOutDate;
    private String bookingReference;

    public Booking(int numRooms, String checkInDate, String checkOutDate, String bookingReference) {
        this.numRooms = numRooms;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.bookingReference = bookingReference;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public String getBookingReference() {
        return bookingReference;
    }

    public void displayBookingDetails() {
        System.out.println("Booking Reference: " + bookingReference);
        System.out.println("Number of Rooms: " + numRooms);
        System.out.println("Check-in Date: " + checkInDate);
        System.out.println("Check-out Date: " + checkOutDate);
    }
}
