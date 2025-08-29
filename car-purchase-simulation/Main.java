import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String carForSale = "SKYLINE GTR-R34";
        System.out.printf("CAR: %s%n", carForSale);

        double carPrice = 200000.00;

        while (true) {
            System.out.printf("Type 1 to buy the %s:  ", carForSale);
            int carBuy = input.nextInt();
            input.nextLine();

            if (carBuy == 1) {
                System.out.print("Do you have a coupon? yes/no: ");
                String coupon = input.nextLine();

                if (coupon.equalsIgnoreCase("yes")) {
                    System.out.printf("The car %s costs %f ", carForSale, carPrice);
                    carPrice = carPrice * 0.95;
                    System.out.printf(
                        "You got a 5 discount and the amount to pay is %f, do you want to pay? yes/no: ",
                        carPrice
                    );
                    String payment = input.nextLine();

                    if (payment.equalsIgnoreCase("yes")) {
                        System.out.printf("Payment completed successfully, % 2f ", carPrice);
                        break;
                    } else {
                        System.out.println("Payment paused");
                        break;
                    }
                } else if (coupon.equalsIgnoreCase("no")) {
                    System.out.printf("The car %s costs %.2f ", carForSale, carPrice);
                    System.out.print("Do you want to pay? yes/no: ");
                    String paymentCar = input.nextLine();

                    if (paymentCar.equalsIgnoreCase("yes")) {
                        System.out.printf("Payment completed successfully, %.2f ", carPrice);
                        break;
                    } else {
                        System.out.println("Payment paused");
                        break;
                    }
                }
            } else {
                System.out.println(
                    "Not available, you can buy another car available in our store, do you want? yes/no"
                );
                String carUnavailable = input.nextLine();
                if (carUnavailable.equalsIgnoreCase("yes")) {
                    continue;
                } else if (carUnavailable.equalsIgnoreCase("no")) {
                    break;
                }
            }
    }

    input.close();

    }
}
