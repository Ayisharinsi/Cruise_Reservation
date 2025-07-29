import java.util.*;

class Booking {
    private String name;
    private int noOfMember;
    private String destination;
    private int dateRange;
    private String curiseType;
    private String foodType;

    Booking(String name, int noOfMember, String destination, int dateRange, String curiseType, String foodType) {
        this.name = name;
        this.noOfMember = noOfMember;
        this.destination = destination;
        this.dateRange = dateRange;
        this.curiseType = curiseType;
        this.foodType = foodType;
    }

    public String getName() {
        return name;
    }

    public int getNoOfMember() {
        return noOfMember;
    }

    public String getDestination() {
        return destination;
    }

    public int getDateRange() {
        return dateRange;
    }

    public String getCuriseType() {
        return curiseType;
    }

    public String getFoodType() {
        return foodType;
    }

    void displayBooking() {
        System.out.println("Name: " + name);
        System.out.println("Number Of Members: " + noOfMember);
        System.out.println("Destination: " + destination);
        System.out.println("Date Range: " + dateRange);
        System.out.println("Curise: " + curiseType);
        System.out.println("Desired Food: " + foodType);

    }
}

public class Main {
    private static List<Booking> bookings = new ArrayList<>();

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Booking");
            System.out.println("2. View All Bookings");
            System.out.println("3. Delete Booking");
            System.out.println("4. Details About Cruise");
            System.out.println("5. Payment");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = s.nextInt();
            s.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter your Name:");
                    String name = s.nextLine();
                    System.out.println("Enter No. of Members");
                    int noOfMember = s.nextInt();
                    s.nextLine();
                    System.out.println("Enter the destination:");
                    String destination = s.nextLine();
                    System.out.println("Enter the Date:");
                    int dateRange = s.nextInt();
                    s.nextLine();
                    System.out.println("Enter the Curise:");
                    String curiseType = s.nextLine();
                    System.out.println("Enter the Food Type:");
                    String foodType = s.nextLine();
                    Booking b = new Booking(name, noOfMember, destination, dateRange, curiseType, foodType);
                    bookings.add(b);
                    System.out.println("Booking added successfully!");
                    break;
                case 2:
                    if (bookings.isEmpty()) {
                        System.out.println("No Booking had been made");
                    } else {
                        System.out.println("\nAll Bookings:");
                        for (Booking booking : bookings) {
                            booking.displayBooking();
                        }
                    }
                    break;
                case 3:
                    if (bookings.isEmpty()) {
                        System.out.println("No bookings to delete.");
                    } else {
                        System.out.println("Enter the name of the booking to delete:");
                        String delName = s.nextLine();
                        boolean deleted = false;

                        Iterator<Booking> iterator = bookings.iterator();
                        while (iterator.hasNext()) {
                            Booking booking = iterator.next();
                            if (booking.getName().equalsIgnoreCase(delName)) {
                                iterator.remove();
                                System.out.println("Booking for " + delName + " deleted successfully!");
                                deleted = true;
                                break;
                            }
                        }

                        if (!deleted) {
                            System.out.println("No booking found with the name: " + delName);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Type of the curise");
                    System.out.println("1.luxury");
                    System.out.println("2.Standard");
                    System.out.println("3.Budget");
                    int cType = s.nextInt();
                    switch (cType) {
                        case 1:
                            System.out.println(" Luxury Cruise Details:");
                            System.out.println(" Bedrooms: 100 deluxe suites with ocean view");
                            System.out.println(" Dining: 5-star buffet + 3 specialty restaurants");
                            System.out.println(" Amenities: Swimming pool, spa, theater, gym, WiFi");
                            System.out.println(" Price: ₹50,000 per person for 5 days");
                            break;
                        case 2:
                            System.out.println(" Standard Cruise Details:");
                            System.out.println(" Bedrooms: 60 standard rooms");
                            System.out.println(" Dining: Standard buffet and 1 café");
                            System.out.println(" menities: Mini-theater, basic gym, WiFi");
                            System.out.println(" Price: ₹25,000 per person for 5 days");
                            break;
                        case 3:
                            System.out.println(" Budget Cruise Details:");
                            System.out.println(" Bedrooms: 40 economy rooms");
                            System.out.println(" Dining: Buffet meals only");
                            System.out.println(" Amenities: Common lounge, basic entertainment");
                            System.out.println(" Price: ₹15,000 per person for 5 days");
                            break;
                    }
                    break;
                    case 5:
                    System.out.println("Payment Mode UPI");
                    System.out.println("Enter Your ID");
                    int id=s.nextInt();
                    System.out.println("Payment Completed Sucessfully");
                    break;

                case 6:
                    System.out.println("Exiting the program...");
                    return;
            }
        }

    }
}