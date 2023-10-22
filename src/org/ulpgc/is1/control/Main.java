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

        ordermanager.addCustomer("Juan", "García");
        ordermanager.getCustomer(0).addAddress("León y Castillo", 3, 3544, "Las Palmas");
        ordermanager.addRestaurant("Restaurante1", "12345689");
        ordermanager.addDish("Plato1", "Descripción1", 10, 2);
        ordermanager.getDish(0).getPrice();
        ordermanager.getCustomer().


    }
}