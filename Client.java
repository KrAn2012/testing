public class Client {

    private static String customerName;
    private static double customerNumber;
    private static double quantity;


    private Client(String customerName, double customerNumber, double quantity ) {
        Client.customerName = customerName;
        Client.customerNumber = customerNumber;
        Client.quantity = quantity;

    }

    public static String getCustomerName() {
        return customerName;
    }

    public static void setCustomerName(String customerName) {
        Client.customerName = customerName;
    }

    public static double getCustomerNumber() {
        return customerNumber;
    }

    public static void setCustomerNumber(double customerNumber) {
        Client.customerNumber = customerNumber;
    }

    public static double getQuantity() {
        return quantity;
    }

    public static void setQuantity(double quantity) {
        Client.quantity = quantity;
    }
}


