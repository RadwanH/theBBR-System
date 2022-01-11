package com.thebbrmachine;

public class Home {

    //creating customers
    Offer offer = new Offer();
    BrrSystem brrSystem = new BrrSystem();
    Customer customer1 = new Customer("Ali", "ARSLAN", "5529809378", "465462134455");
    //creating cars


    public void welcome() {
        brrSystem.listOfCar();

        CarManager car = brrSystem.getCars().get(2);

        System.out.println(
                "#######################################################################################" +
                        "\n#                                      The BBR Machine                                #" +
                        "\n#######################################################################################");



        System.out.println("Welcome " + customer1.getFirstName() + " " + customer1.getLastName() +
                " to The BBR Machine Where you can buy a car as simple as buying a coffee" +
                "\nfrom a coffee machine   ");
        System.out.println("\nHere is what you can do with The BBR Machine.Please select the operation you want to do ");

        System.out.println(
                "\n1: Buy a Car" +
                        "\n2: Rent a Car" +
                        "\n3: Turn Your Car For a Repair");
        //The transaction that the customer wants to make is passed to this method
        //since we are putting all inputs as a static we just chose to pass 1 for buying transactions
        System.out.println("****************These are available cars for sale************");
        for (int i = 0; i <brrSystem.getCars().size() ; i++) {
            CarManager car1 = brrSystem.getCars().get(i);
            car1.getInFo();
        }
        offer.actions(1, customer1, car);



    }


}
