package com.bridgelabz;

import java.util.Scanner;

class Stocks {

    private String stock1;


    private int numberOfShare;
    private int priceOfShare;

    private int numberOfStocks;

    public String getStock1() {
        return stock1;
    }

    public void setStock1(String stock1) {
        this.stock1 = stock1;
    }

    public int getNumberOfShare() {
        return numberOfShare;
    }

    public void setNumberOfShare(int numberOfShare) {
        this.numberOfShare = numberOfShare;
    }

    public int getPriceOfShare() {
        return priceOfShare;
    }

    public void setPriceOfShare(int priceOfShare) {
        this.priceOfShare = priceOfShare;
    }

    public int getNumberOfStocks() {
        return numberOfStocks;
    }

    public void setNumberOfStocks(int numberOfStocks) {
        this.numberOfStocks = numberOfStocks;
    }
}

class StockPortfolio {
    Scanner input = new Scanner(System.in);
    Stocks stocks = new Stocks();


    public void totalValue( int num) {
        int i = 0;
        int totalValue = 0;
        while(i != num){
            System.out.println("Enter name of Share : ");
            String b = input.next();
            stocks.setStock1(b);
            System.out.println("Enter price of share : ");
            int c = input.nextInt();
            stocks.setPriceOfShare(c);
            System.out.println("Enter number of share : ");
            int d = input.nextInt();
            stocks.setNumberOfShare(d);
            int totalValueOfShare = stocks.getPriceOfShare()*stocks.getNumberOfShare();
            System.out.println("Total value of share is : " + totalValueOfShare);
            totalValue = totalValue + totalValueOfShare;
            i++;
        }
        System.out.println("Total value of total stocks : " + totalValue);
    }

}

public class StockAccountManagement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StockPortfolio person1 = new StockPortfolio();
        System.out.println("Enter number of stocks : ");
        int a = input.nextInt();
        person1.stocks.setNumberOfStocks(a);
        int x = person1.stocks.getNumberOfStocks();
        person1.totalValue(x);

    }
}
