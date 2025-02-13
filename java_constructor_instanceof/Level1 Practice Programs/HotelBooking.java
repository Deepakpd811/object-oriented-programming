package Level1;

public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = " ";
        this.roomType = " ";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking another) {
        this.guestName = another.guestName;
        this.roomType = another.roomType;
        this.nights = another.nights;
    }

    
    public static void main(String[] args) {
        
    }
}
