import java.util.Scanner;

public class Hotel
 {
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter date of booking: ");
        String dateOfBooking = scanner.nextLine();

        System.out.print("Enter assigned room number: ");
        int assignedRoomNo = scanner.nextInt();
        
        System.out.println("\nCustomer Information:");
        System.out.println("Name: " + customerName);
        System.out.println("Date of Booking: " + dateOfBooking);
        System.out.println("Assigned Room Number: " + assignedRoomNo);
        scanner.close();
    }
}
