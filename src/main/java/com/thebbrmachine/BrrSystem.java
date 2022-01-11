package com.thebbrmachine;

import java.util.ArrayList;
import java.util.List;

public class BrrSystem {
    private List<CarManager> cars = new ArrayList<>();

    public BrrSystem() {
    }


    public void buying(Customer customer, CarManager carManager) {

        System.out.println("Mr./Mrs. " + customer.getFirstName() + " " + customer.getLastName() + " " +
                "you are about to buy this car " +
                "\n ");
        carManager.getInFo();
        System.out.println("Would you like to take the car on a ride ?");


    }

    public void makePayment(String method, Customer customer, CarManager carManager, String credit_card_number, String exp_date) {
        if (method.toLowerCase().equals("credit")) {
            CreditCardPayment cc = new CreditCardPayment(
                    carManager.getPrice(),
                    customer.getFirstName(),
                    customer.getLastName(),
                    exp_date,
                    credit_card_number);
            cc.paymentDetails();
        } else if (method.toLowerCase().equals("cash")) {
            CashPayment c = new CashPayment(100);
            c.paymentDetails();
        } else {
            System.out.println("please write cash for 'cash' payment and 'credit' for credit payment ");
        }
    }

    public void contract(String payment_method, Customer customer, CarManager car) {
        Contract contract = new Contract(
                customer.getFirstName(),
                customer.getLastName(),
                customer.getPhone(),
                customer.getId(),
                car.getCar_type(),
                car.getModel(),
                car.getColour(),
                car.getHpower(),
                car.getPrice(),
                payment_method);
        contract.getContract();
    }


    public void listOfCar() {
        CarManager car = new CarManager("001", "sport", "Aston Martin Vantage 3.4 Ti", "Gold", 650500, 500);
        CarManager car2 = new CarManager("002", "sport", "Mercedes Benz E180", "Black", 450000, 450);
        CarManager car3 = new CarManager("003", "electric", "Tesla Y", "Black", 400000, 650);
        cars.add(0, car);
        cars.add(1, car2);
        cars.add(2, car3);
    }


    public List<CarManager> getCars() {
        return cars;
    }

    public void setCars(List<CarManager> cars) {
        this.cars = cars;
    }

    public void rentaCar() {
        System.out.println("WARNING!!! This feature will be available soon.");
    }

    public void repair() {
        System.out.println("WARNING!!! This feature will be available soon.");
    }
}
