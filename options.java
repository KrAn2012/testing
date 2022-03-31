import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class options {

    static void options() {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Object> listCustomerName = new ArrayList<>();
        ArrayList<Object> listCustomerNumber = new ArrayList<>();
        ArrayList<Object> listQuantity = new ArrayList<>();


        System.out.println("Output - 0");
        System.out.println("Add a new customer - 1 ");
        scanner.hasNextInt();
        int option = scanner.nextInt();

        if (option == 0) {
            System.out.println("Exit");
            scanner.close();
        }
        while (option == 1) {

            System.out.println("Enter the name of the client: ");
            Client.setCustomerName(scanner.next());

            System.out.println("Order number: ");
            Client.setCustomerNumber(scanner.nextDouble());

            System.out.println("Quantity: ");
            Client.setQuantity(scanner.nextDouble());

            listCustomerName.add(Client.getCustomerName());
            listCustomerNumber.add(Client.getCustomerNumber());
            listQuantity.add(Client.getQuantity());

            System.out.println("Add client enter - 1 ");
            System.out.println("Output - 0");
            System.out.println("View costumers data - 2");
            option = scanner.nextInt();
        }
        if (option == 2) {
            System.out.println("Number of costomers: " + listCustomerName.size());
            for (int i = 0; i < listCustomerName.size(); i++) {
                System.out.println("Customer Name: " + listCustomerName.get(i) + "    Customer Number: "
                        + listCustomerNumber.get(i) + "   Quantity: " + listQuantity.get(i)
                        + "    Date: " +LocalDateTime.now());
            }

        }
    }
}