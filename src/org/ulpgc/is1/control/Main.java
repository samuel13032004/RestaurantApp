package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.util.ArrayList;

public class Main {
    public static  void init() {

        OrderManager ordermanager = new OrderManager();

        //i. Init. Crear dos clientes.

        ordermanager.addCustomer("Andrés", "Martín");
        ordermanager.getCustomer(0).addAddress("Calle Mayor de Teror", 6, 35330, "Teror");
        ordermanager.addCustomer("Juan", "Rodríguez");
        ordermanager.getCustomer(1).addAddress("Avenida de las Canteras", 3, 35008, "Las Palmas");

        //ii. Init. Crear dos restaurantes. (*) En el caso que el restaurante tenga un número de teléfono no válido se almacenará el valor: “XXXX”.

        ordermanager.addRestaurant("Restaurante Casa Serafín", "12345689");
        ordermanager.addRestaurant("Restaurante La Aquarela", "XXXX");

        //iii. Init. Crear tres platos diferentes.

        ordermanager.addDish("Paella de Mariscos", "Una deliciosa paella preparada con arroz, calamares, gambas, mejillones y otros mariscos frescos.", 18);
        ordermanager.addDish("Solomillo de Ternera con Salsa de Champiñones", "Un solomillo de ternera a la parrilla, tierno y jugoso, acompañado de una rica salsa de champiñones con un toque de vino tinto.", 24);
        ordermanager.addDish("Calamares a la Romana:", "Descripción3", 12);
    }
    public static void main(String[] args) {
        OrderManager ordermanager = new OrderManager();


        //Order order=new Order(customer1, restaurant1);
        //OrderItem orderItem= new OrderItem(2, dish1);
        //orderItem.price();


        //vii. Crear un pedido por parte del primer cliente, al primer restaurante, que
        //incluya los dos últimos platos del catálogo. (*) Sugerencia: para especificar los
        //platos y la cantidad de ellos, se pueden utilizar dos ArrayList<Integer> que indiquen la
        //posición del plato en el catálogo y la cantidad de dicho plato, respectivamente.
        // (void order(Customer customer, Restaurant restaurant, ArrayList<Integer> dishesId, ArrayList<Integer> quantity))
        //viii. Borrar el segundo cliente.

        //Restaurant.removeCustomer(customer2);
        //ordermanager.delCustomer(1);
        //ix. Imprimir por pantalla el número de clientes.

        //System.out.println("Número de clientes: " + Restaurant.getCustomerCount());

        //x. Imprimir por pantalla el primer pedido del primer cliente, incluyendo el precio total del pedido.
        //System.out.println("Primer pedido del primer cliente:");
        //OrderItem firstOrder = new OrderItem(2, dish1);
        //Order firstOrder = customer1.orders().get(1);













        //iv. Imprimir por pantalla los datos del primer restaurante.

        System.out.printf("Datos del primer restaurante: ", ordermanager.getRestaurant(0).getName() + ", "+ ordermanager.getRestaurant(0).getPhone());

        //v. Imprimir por pantalla los datos del segundo cliente.

        System.out.println("Datos del segundo cliente: "+ ordermanager.getCustomer(1).getName()+", "+ ordermanager.getCustomer(1).getSurname()+", "+ ordermanager.getCustomer(1).getAddress());

        //vi. Imprimir por pantalla los datos del tercer plato.

        System.out.println("Datos del tercer plato: "+ ordermanager.getDish(2).getName() + ", "+ ordermanager.getDish(2).getDescription() + ", " + ordermanager.getDish(2).getPrice());

        //vii. Crear un pedido por parte del primer cliente, al primer restaurante, que
        //incluya los dos últimos platos del catálogo. (*) Sugerencia: para especificar los
        //platos y la cantidad de ellos, se pueden utilizar dos ArrayList<Integer> que indiquen la
        //posición del plato en el catálogo y la cantidad de dicho plato, respectivamente.
        // (void order(Customer customer, Restaurant restaurant, ArrayList<Integer> dishesId, ArrayList<Integer> quantity))

        Customer customer0 = ordermanager.getCustomer(0);
        Restaurant restaurant0 = ordermanager.getRestaurant(0);

        ArrayList<Integer> dishesId =  new ArrayList<>();
        dishesId.add(0);
        ArrayList<Integer> quantity = new ArrayList<>();
        quantity.add(2);

        ordermanager.order(customer0, restaurant0, dishesId, quantity);

        //viii. Borrar el segundo cliente.

        ordermanager.delCustomer(1);


        //ix. Imprimir por pantalla el número de clientes.

        System.out.println("Número de clientes: " + ordermanager.getCustomersCount());

        //x. Imprimir por pantalla el primer pedido del primer cliente, incluyendo el precio total del pedido.

        //System.out.println();

        //ordermanager.getDish(0).getPrice();


    }
}