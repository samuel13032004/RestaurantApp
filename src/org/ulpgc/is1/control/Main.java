package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

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

        System.out.printf("Datos del primer restaurante: ", ordermanager.getRestaurant(0).getName() + ", "+ ordermanager.getRestaurant(0).getPhone()+"."+ "\n");


        //v. Imprimir por pantalla los datos del segundo cliente.

        System.out.println("\nDatos del segundo cliente: "+ ordermanager.getCustomer(1)+", "+ ordermanager.getCustomer(1).getAddress());

        //vi. Imprimir por pantalla los datos del tercer plato.

        System.out.println("Datos del tercer plato: "+ ordermanager.getDish(2).getName() +" "+ ordermanager.getDish(2).getDescription() + ", " + ordermanager.getDish(2).getPrice()+" euros.");





        //viii. Borrar el segundo cliente.
        ordermanager.delCustomer(1);

        //ix. Imprimir por pantalla el número de clientes.

        System.out.println("Número de clientes: " + ordermanager.getCustomersCount());

        //x. Imprimir por pantalla el primer pedido del primer cliente, incluyendo el precio total del pedido.
    }
}