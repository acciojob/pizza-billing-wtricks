package com.driver;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean isExtraCheese = false;
    private boolean isExtraToppings = false;
    private boolean isTakeAway = false;
    private boolean isDeluxePizza = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here

        this.price = isVeg ? 300 : 400;
    }

    public void setDeluxePizza() {
        this.isDeluxePizza = true;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.isExtraCheese = true;
    }

    public void addExtraToppings(){
        // your code goes here
        this.isExtraToppings = true;
    }

    public void addTakeaway(){
        // your code goes here
        this.isTakeAway = true;
    }

    public String getBill(){
        // your code goes here
        int totalBillPrice = this.price;
        bill = "Base Price Of The Pizza: "+ this.price;

        if (isExtraCheese && !isDeluxePizza) {
            bill += "\nExtra Cheese Added: 80" ;
            totalBillPrice += 80;
        }
        if (isExtraToppings && !isDeluxePizza) {
            bill += "\nExtra Toppings Added: " + (this.isVeg ? 70 : 120);
            totalBillPrice += this.isVeg ? 70 : 120;
        }
        if (isTakeAway) {
            bill += "\nPaperbag Added: 20";
            totalBillPrice += 20;
        }

        bill += "\nTotal Price: " + totalBillPrice + "\n";
        return this.bill;
    }
}
