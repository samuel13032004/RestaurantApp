package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.net.SocketOption;
import java.util.ArrayList;

public class Main {

    public static void init(OrderManager ordermanager) {


        //i. Init. Crear dos clientes.

        ordermanager.addCustomer("Andrés", "Martín");
        ordermanager.getCustomer(0).addAddress("Calle Mayor de Teror", 6, 35330, "Teror");
        ordermanager.addCustomer("Juan", "Rodríguez");
        ordermanager.getCustomer(1).addAddress("Avenida de las Canteras", 3, 35008, "Las Palmas");

        //ii. Init. Crear dos restaurantes. (*) En el caso que el restaurante tenga un número de teléfono no válido se almacenará el valor: “XXXX”.

        ordermanager.addRestaurant("Restaurante Casa Serafín", new Phone("12345689"));
        ordermanager.addRestaurant("Restaurante La Aquarela", new Phone("12445689"));

        //iii. Init. Crear tres platos diferentes.

        ordermanager.addDish("Paella de Mariscos", "Una deliciosa paella preparada con arroz, calamares, gambas, mejillones y otros mariscos frescos", 18);
        ordermanager.addDish("Solomillo de Ternera con Salsa de Champiñones", "Un solomillo de ternera a la parrilla, tierno y jugoso, acompañado de una rica salsa de champiñones con un toque de vino tinto", 24);
        ordermanager.addDish("Calamares a la Romana:", "Los calamares a la romana son una opción perfecta como aperitivo o plato principal", 12);



    }
    public static void main(String[] args) {

        OrderManager ordermanager = new OrderManager();
        init(ordermanager);


        //iv. Imprimir por pantalla los datos del primer restaurante.

        //System.out.printf("Datos del primer restaurante: ", ordermanager.getRestaurant(0).getName() + ", "+ ordermanager.getRestaurant(0).getPhone()+"."+ "\n");

        System.out.println("Datos del primer restaurante: " + ordermanager.getRestaurant(0).getName() + ", ") ;

        //v. Imprimir por pantalla los datos del segundo cliente.

        System.out.println("Datos del segundo cliente: "+ ordermanager.getCustomer(1).getName() + " "+ ordermanager.getCustomer(1).getSurname());

        if (ordermanager.getCustomer(1).getAddress() != null) {
            System.out.println("Dirección del segundo cliente: " + ordermanager.getCustomer(1).getAddress().getCity() + " " + ordermanager.getCustomer(1).getAddress().getStreet() +
                    " " + ordermanager.getCustomer(1).getAddress().getNumber() + " " + ordermanager.getCustomer(1).getAddress().getPostalCode());
        } else {
            System.out.println("El segundo cliente no tiene una dirección registrada.");
        }

        //vi. Imprimir por pantalla los datos del tercer plato.

        System.out.println("Datos del tercer plato: "+ ordermanager.getDish(2).getName() +" "+ ordermanager.getDish(2).getDescription() + ", " + ordermanager.getDish(2).getPrice()+" euros.");

        //VII. crear order para primer cliente, al primer restaurante, que
        //incluya los dos últimos platos del catálogo.

        Customer customer0 = ordermanager.getCustomer(0);
        Restaurant restaurant0 = ordermanager.getRestaurant(0);

        ArrayList<Integer> dishesId = new ArrayList<>();
        dishesId.add(0);
        dishesId.add(1);
        dishesId.add(2);
        ArrayList<Integer> quantity = new ArrayList<>();
        quantity.add(0);
        quantity.add(1);
        quantity.add(1);

        ordermanager.order(customer0, restaurant0, dishesId, quantity);


        //viii. Borrar el segundo cliente.
        ordermanager.delCustomer(1);

        //ix. Imprimir por pantalla el número de clientes.

        System.out.println("Número de clientes: " + ordermanager.getCustomersCount());

        //x. Imprimir por pantalla el primer pedido del primer cliente, incluyendo el precio total del pedido.
        ArrayList<Order> customerOrders = customer0.getOrders();

        if (!customerOrders.isEmpty()) {
            Order firstOrder = customerOrders.get(0);

            System.out.println("Pedido del cliente: " + customer0.getName() + " " + customer0.getSurname());
            System.out.println("Restaurante: " + firstOrder.getRestaurant().getName());

            System.out.println("Platos del pedido:");
            for (OrderItem item : firstOrder.getOrderItem()) {
                Dish dish = ordermanager.getDish(item.getDishId());
                System.out.println(" - " + dish.getName() + ": " + item.getQuantity() + " x $" + dish.getPrice());
            }

            // Calcula el precio total del pedido
            double total = firstOrder.price();
            System.out.println("Precio total del pedido: $" + total);
        } else {
            System.out.println("El cliente no ha realizado ningún pedido.");
        }
    }
}