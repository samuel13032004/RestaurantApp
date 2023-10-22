package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

public class Main {
    public static void main(String[] args) {
        //i. Init. Crear dos clientes.
        Address address1 = new Address("Avenida de las Canteras", 3, 35008, "Las Palmas");
        Customer customer1 = new Customer("Juan", "Rodríguez", address1);

        Address address2 = new Address("Calle Mayor de Teror", 6, 35330, "Teror");
        Customer customer2 = new Customer("Andrés", "Martín", address2);

        //ii. Init. Crear dos restaurantes. (*) En el caso que el restaurante tenga un número de teléfono no válido se almacenará el valor: “XXXX”.
        //Phone phone1 = new Phone("123456789");
        Restaurant restaurant1 = new Restaurant("Restaurante Casa Serafín", "12345689");
        //Restaurant restaurant1 = new Restaurant("Restaurante1", phone1);
        Restaurant restaurant2 = new Restaurant("Restaurante La Aquarela", "XXXX");
        //iii. Init. Crear tres platos diferentes.
        Dish dish1 = new Dish("Paella de Mariscos", "Una deliciosa paella preparada con arroz, calamares, gambas, mejillones y otros mariscos frescos.", 18);
        Dish dish2 = new Dish("Solomillo de Ternera con Salsa de Champiñones", "Un solomillo de ternera a la parrilla, tierno y jugoso, acompañado de una rica salsa de champiñones con un toque de vino tinto.", 24);
        Dish dish3 = new Dish("Calamares a la Romana:", "Descripción3", 12);

        Order order=new Order(customer1, restaurant1);
        OrderItem orderItem= new OrderItem(2, dish1);
        orderItem.price();

        //iv. Imprimir por pantalla los datos del primer restaurante.
        System.out.printf("Datos del primer restaurante:%s%n", restaurant1);
        //v. Imprimir por pantalla los datos del segundo cliente.
        System.out.println("Datos del segundo cliente: "+ customer2);

        //vi. Imprimir por pantalla los datos del tercer plato.
        System.out.println("Datos del tercer plato:"+ dish3);

        //vii. Crear un pedido por parte del primer cliente, al primer restaurante, que
        //incluya los dos últimos platos del catálogo. (*) Sugerencia: para especificar los
        //platos y la cantidad de ellos, se pueden utilizar dos ArrayList<Integer> que indiquen la
        //posición del plato en el catálogo y la cantidad de dicho plato, respectivamente.
        // (void order(Customer customer, Restaurant restaurant, ArrayList<Integer> dishesId, ArrayList<Integer> quantity))
        //viii. Borrar el segundo cliente.
        Restaurant.removeCustomer(customer2);
        OrderManager ordermanager = new OrderManager();
        ordermanager.delCustomer(1);
        //ix. Imprimir por pantalla el número de clientes.
        System.out.println("Número de clientes: " + Restaurant.getCustomerCount());
        //x. Imprimir por pantalla el primer pedido del primer cliente, incluyendo el precio total del pedido.
        System.out.println("Primer pedido del primer cliente:");
        OrderItem firstOrder = new OrderItem(2, dish1);
        //Order firstOrder = customer1.orders().get(1);


        //i. Init. Crear dos clientes.

        ordermanager.addCustomer("Andrés", "Martín");
        ordermanager.getCustomer(0).addAddress("Calle Mayor de Teror", 6, 35330, "Teror");
        ordermanager.addCustomer("Juan", "Rodríguez");
        ordermanager.getCustomer(1).addAddress("Avenida de las Canteras", 3, 35008, "Las Palmas");

        //ii. Init. Crear dos restaurantes. (*) En el caso que el restaurante tenga un número de teléfono no válido se almacenará el valor: “XXXX”.

        ordermanager.addRestaurant("Restaurante Casa Serafín", "12345689");
        ordermanager.addRestaurant("Restaurante La Aquarela", "XXXX");

        //iii. Init. Crear tres platos diferentes.

        ordermanager.addDish("Paella de Mariscos", "Una deliciosa paella preparada con arroz, calamares, gambas, mejillones y otros mariscos frescos.", 18, 2);
        ordermanager.addDish("Solomillo de Ternera con Salsa de Champiñones", "Un solomillo de ternera a la parrilla, tierno y jugoso, acompañado de una rica salsa de champiñones con un toque de vino tinto.", 24, 2);
        ordermanager.addDish("Calamares a la Romana:", "Descripción3", 12, 3);

        //iv. Imprimir por pantalla los datos del primer restaurante.

        System.out.printf("Datos del primer restaurante: ", ordermanager.getRestaurant(0).getName() + ", "+ ordermanager.getRestaurant(0).getPhone());

        //v. Imprimir por pantalla los datos del segundo cliente.

        System.out.println("Datos del segundo cliente: "+ ordermanager.getCustomer(1)+", "+ ordermanager.getCustomer(1).getAddress());

        //vi. Imprimir por pantalla los datos del tercer plato.

        System.out.println("Datos del tercer plato: "+ ordermanager.getDish(2).getName() + ", "+ ordermanager.getDish(2).getDescription() + ", " + ordermanager.getDish(2).getPrice());

        //vii. Crear un pedido por parte del primer cliente, al primer restaurante, que
        //incluya los dos últimos platos del catálogo. (*) Sugerencia: para especificar los
        //platos y la cantidad de ellos, se pueden utilizar dos ArrayList<Integer> que indiquen la
        //posición del plato en el catálogo y la cantidad de dicho plato, respectivamente.
        // (void order(Customer customer, Restaurant restaurant, ArrayList<Integer> dishesId, ArrayList<Integer> quantity))

        ordermanager.order(ordermanager.getCustomer(0), ordermanager.getRestaurant(1));
        //viii. Borrar el segundo cliente.

        ordermanager.delCustomer(1);


        //ix. Imprimir por pantalla el número de clientes.


        //x. Imprimir por pantalla el primer pedido del primer cliente, incluyendo el precio total del pedido.


        ordermanager.getDish(0).getPrice();
        ordermanager.getCustomer().
        ordermanager.addCustomer("Juan", "Rodríguez");
        ordermanager.getCustomer(1).addAddress("Avenida de las Canteras", 3, 35008, "Las Palmas");
        ordermanager.addDish("Solomillo de Ternera con Salsa de Champiñones", "Un solomillo de ternera a la parrilla, tierno y jugoso, acompañado de una rica salsa de champiñones con un toque de vino tinto.", 24, 2);
        ordermanager.getDish(0).getPrice();

    }
}