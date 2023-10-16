package org.ulpgc.is1.control;

import org.ulpgc.is1.model.Customer;
import org.ulpgc.is1.model.Dish;
import org.ulpgc.is1.model.Restaurant;
import org.ulpgc.is1.model.Address;

public class Main {
    public static void main(String[] args) {
        //i. Init. Crear dos clientes.
        Customer customer1 = new Customer("Juan", "García", "León y Castillo", "3", "3544", "Las Palmas");
        Customer customer2 = new Customer("Juan", "García", "León y Castillo", "3", "3544", "Las Palmas");
        //ii. Init. Crear dos restaurantes. (*) En el caso que el restaurante tenga un número de teléfono no válido se almacenará el valor: “XXXX”.
        Restaurant restaurant1 = new Restaurant("Restaurante1", "12345689");
        Restaurant restaurant2 = new Restaurant("Restaurante2", "XXXX");
        //iii. Init. Crear tres platos diferentes.
        Dish dish1 = new Dish("Plato1", "Descripción1", 10);
        Dish dish2 = new Dish("Plato2", "Descripción2", 12);
        Dish dish3 = new Dish("Plato3", "Descripción3", 9);

        //iv. Imprimir por pantalla los datos del primer restaurante.
        System.out.printf("Datos del primer restaurante:%s%n", restaurant1);
        //v. Imprimir por pantalla los datos del segundo cliente.
        System.out.println("Datos del segundo cliente:");

        //vi. Imprimir por pantalla los datos del tercer plato.
        System.out.println("Datos del tercer plato:");

        //vii. Crear un pedido por parte del primer cliente, al primer restaurante, que
        //incluya los dos últimos platos del catálogo. (*) Sugerencia: para especificar los
        //platos y la cantidad de ellos, se pueden utilizar dos ArrayList<Integer> que indiquen la
        //posición del plato en el catálogo y la cantidad de dicho plato, respectivamente.//(void order(Customer customer, Restaurant restaurant, ArrayList<Integer> dishesId, ArrayList<Integer> quantity))
        //viii. Borrar el segundo cliente.
        Restaurant.removeCustomer(customer2);
        //ix. Imprimir por pantalla el número de clientes.
        System.out.println("Número de clientes: " + Restaurant.getCustomerCount());
        //x. Imprimir por pantalla el primer pedido del primer cliente, incluyendo el precio total del pedido.
        System.out.println("Primer pedido del primer cliente:");


    }
}