package Exercise7;

import java.util.ArrayList;

public class StockMarket implements Stock {

    private ArrayList<Observer> observers = new ArrayList<>();

    private double price;

    public void setPrice(double price){

        this.price = price;
        notifyObservers();

    }

    public void registerObserver(Observer o){

        observers.add(o);

    }

    public void removeObserver(Observer o){

        observers.remove(o);

    }

    public void notifyObservers(){

        for(Observer o : observers)
            o.update(price);

    }

}