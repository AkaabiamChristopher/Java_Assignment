import java.util.List;

public class NaijaComfortInn {
    private int roomNumber;
    private String roomType;
    private double pricePerNight;
    private boolean isAvailable;
    private boolean needsMaintenance;

    public NaijaComfortInn(int roomNumber, String roomType, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.isAvailable = true;
        this.needsMaintenance = false;
    }

    public void markAsOccupied() {
        this.isAvailable = false;
    }

    public void markAsAvailable() {
        this.isAvailable = true;
    }

    public void markAsUnderMaintenance() {
        this.needsMaintenance = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean needsMaintenance() {
        return needsMaintenance;
    }

    public class Guest {
        private String name;
        private String phoneNumber;
        private String email;
        private String bookingReference;

        public Guest(String name, String phoneNumber, String email, String bookingReference) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.email = email;
            this.bookingReference = bookingReference;
        }

        public String getDetails() {
            return "Name: " + name + ", Phone: " + phoneNumber + ", Email: " + email + ", Booking Reference: " + bookingReference;
        }

        public String getBookingReference() {
            return bookingReference;
        }
    }

    public class Booking {
        private Guest guest;
        private NaijaComfortInn room;
        private String checkInDate;
        private String checkOutDate;
        private double totalPayment;

        public Booking(Guest guest, NaijaComfortInn room, String checkInDate, String checkOutDate) {
            this.guest = guest;
            this.room = room;
            this.checkInDate = checkInDate;
            this.checkOutDate = checkOutDate;
        }

        public void calculatePayment(int days, double festivePeriod) {
            this.totalPayment = days * room.getPricePerNight() * festivePeriod;
        }

        public String cancelBooking() {
            room.markAsAvailable();
            return "Booking for " + guest.getDetails() + " has been cancelled.";
        }

        public Guest getGuest() {
            return guest;
        }

        public NaijaComfortInn getRoom() {
            return room;
        }
    }

    public class HotelManagementSystem {
        private List<NaijaComfortInn> rooms;
        private List<Booking> bookings;
        private List<String> admins;
        private double festivePeriod;


        public void rooms(int i, String aDouble, int i1) {
        }

        public boolean BookRoom(String[] guestDetails, String roomType, int nights, boolean festivePeriod) {
            return festivePeriod;
        }

    }

}