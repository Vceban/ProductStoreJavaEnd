
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vovan
 */
public class Store {

    private int count;

    private double price, priceUp;

    public double getPriceUp() {
        return priceUp;
    }
    private String name;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Store(String name, int count, double price, double priceUp) {
        this.name = name;
        this.count = count;
        this.price = price;
        this.priceUp = priceUp;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\ncount: " + count + "\nprice: " + price + "\npriceUP: " + priceUp + "\n\n";
    }
}
