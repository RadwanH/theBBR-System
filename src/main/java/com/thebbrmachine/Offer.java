package com.thebbrmachine;

public class Offer extends BrrSystem {

    public Offer() {
    }

    public void actions(int option, Customer customer, CarManager carManager) {

        if (option == 1 || option == 2 || option == 3) {
            switch (option) {
                case 1 -> {
                    System.out.println("You chose Buying a new Car........ ");
                    super.buying(customer, carManager);
                    driveTest(carManager, "y");
                    super.makePayment("credit", customer, carManager, "4560 4563 9872 2022", "09/25");
                    super.contract("credit", customer, carManager);
                    parkingSpotAndKey();



                }

                case 2 -> {
                    System.out.println("You chose Renting a Car ");
                    super.rentaCar();
                }
                case 3 -> {
                    System.out.println("You chose Turning your car for repair ");
                    super.repair();
                }

            }
        } else {
            System.out.println(" Please choose invalid Transaction (one of the following options )" +
                    "\n** 1: Buy a Car ******************** 2: Rent a Car ******************** 3: Turn Your Car For a Repair** ");

        }

    }

    public void driveTest(CarManager carManager, String respond) {
        if (respond.toLowerCase().contains("y")) {
            System.out.println("You chose 'y'");
            System.out.println("You are testing...... " + carManager.getModel());

        } else
            System.out.println("You decline to take this car on a test ride");

    }

    public void parkingSpotAndKey() {
        System.out.println("Please make sure to take the paper that contains parking spot info" +
                " and keys from the box below... ");

        System.out.println("Thank you for choosing us ... see you again soon...");


    }
}
