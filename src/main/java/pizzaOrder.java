public class pizzaOrder {

    private String[] toppings;
    private String size;
    private boolean delivery;

    public pizzaOrder(){
        this.delivery = false;
    }

    public void PizzaOrder(String[] toppings, String size) {
        this.toppings = toppings;
    }
    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public double getPrice(){
        double price = 0.00;
        //Add the 1$ per topping, and it checks if their is any toppings available
        if(getToppings()!=null){
            for(int i=0;getToppings().length > i;i++){
                price+=1;
            }
        }

        if(this.delivery){
            price+=2;
        }
        //Add the price of the size of the pizza. small 5/ medium 7/ large 9
        if(getSize().equals("small")){
            price+=5;
        }else if(getSize().equals("medium")){
            price+=7;
        }else if(getSize().equals("large")){
            price+=9;
        }

        return price;
    }

}