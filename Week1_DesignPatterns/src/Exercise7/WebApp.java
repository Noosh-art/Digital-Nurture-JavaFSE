package Exercise7;

public class WebApp implements Observer {

    public void update(double price){

        System.out.println("Web App: Stock Price = " + price);

    }

}