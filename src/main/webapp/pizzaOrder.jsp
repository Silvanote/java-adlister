<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel='stylesheet' type='text/css' href='style-order.css'/>
    <title>Pizza Order Items</title>
</head>
<body>
<div  class="container fill-in-info">
    <div class="container-fluid">
        <div class="row padding text-center">
            <div class="col-lg">
                <%
                    pizzaOrder pizza = (pizzaOrder) request.getAttribute("PizzaOrder");
                    String size = pizza.getSize();
                    double price = pizza.getPrice();
                    String[] toppings = pizza.getToppings();
                %>
                <!--Get the time and the custom message for the pizza-->
                <%            int time = 0;
                    String pickupOrDelivery = "";
                    if (pizza.isDelivery()) {
                        time = 40;
                        pickupOrDelivery = "Your pizza will be delivered within " + time + " minutes";
                    } else {
                        time = 20;
                        pickupOrDelivery = "Your pizza will be ready for pickup in " + time + " minutes";
                    }%>
                <!--Get the name parameter stored in the request method from the previous sevlet-->
                <h1>Pizza Order for <%out.print((String) request.getParameter("name"));%>,</h1>

                <!--Get the phone parameter stored in the request method from the previous sevlet-->
                <h1> <%out.print((String) request.getParameter("phone"));%> total $<%out.print(price);%></h1>

                <!--Prints the custom message based on the Pickup or Delivery selection-->
                <br><br>

                <h1><%out.print(pickupOrDelivery);%></h1>
                <h2><%out.print(size);%> pizza with</h2>

                <!--Check if the user chose any toppings if not it will tell the user 'no toppings'
                if the user selected input it will run a loop to print all the values in the array-->
                <%if (toppings == null) {
                %><p>No Toppings<p><%
            } else {
                for (int i = 0; i < toppings.length; i++) {
            %><p><%out.println(toppings[i]);%></p><%
                    }
                }%>
            </div>

        </div>

    </div>
</div>
</body>
</html>