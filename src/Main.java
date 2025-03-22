/*
    Este programa permite gestionar el inventario de una tienda.
    Se puede Agregar, listar, actualizar y eliminar productos
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        int cantidad = 0;

        System.out.println("  GESTOR DE INVENTARIO  ");
        do {
            System.out.println("  ELIJA  UNA OPCION  ");
            System.out.println(" 1. Agregar Producto  ");
            System.out.println(" 2. Mostrar Producto  ");
            System.out.println(" 3. Actualizar cantidad de un Producto  ");
            System.out.println(" 4. Eliminar Producto  ");
            System.out.println(" 0. Salir");
            System.out.println(" Ingrese una opcion  ");
            opcion = teclado.nextInt();
            System.out.printf("Opcion: ");

            if (opcion == 1)
            {
                System.out.println("Cuantos productos quiere agregar?  ");
                cantidad = teclado.nextInt();

                teclado.nextLine();

                String [] nombreProducto = new String[cantidad];
                int [] cantidadProducto = new int [cantidad];

                for(int i = 0; i < cantidad; i++){
                    System.out.println("Nombre del producto: ");  nombreProducto[i] = teclado.next();
                    System.out.println("Cantidad del producto: ");  cantidadProducto[i] = teclado.nextInt();
                }
            }
            else
            {
                if (opcion == 2)
                {
                    System.out.println("Usted a ingresado los siguientes productos: ");

                    String [] nombreProducto = new String[cantidad];
                    for(int i = 0; i < cantidad; i++){
                        System.out.printf((i+1)+". "+ nombreProducto[i]);
                    }
                }
                else
                {
                    if (opcion == 3)
                    {
                        System.out.println("Cantidad de producto: ");
                    }
                    else
                    {
                        if (opcion == 4)
                        {
                            System.out.println("Eliminar producto: ");
                        }
                        else
                        {
                            if(opcion == 0)
                            {
                                System.out.println("Saliendo del programa ");
                            }
                            else
                            {
                                System.out.println("Opcion no valida, ingrese una opcion valida ");
                            }
                        }
                    }
                }
            }
        }
            while (opcion < 5) ;






     /*   System.out.println("Ingrese un nombre ");
        String nombreProd = teclado.next();

      // String [] nombre = new String[10];
       ArrayList<String> productos = new ArrayList<>();
        //productos.add(nombre);

      System.out.println("Lista de productos ");
        for (String nombre : productos) {
            System.out.println(nombre);
        }

       System.out.println("-------------");
        productos.set(0,"Aceite");
        for (String producto : productos) {
            System.out.println(producto
            );
        }*/

    }
}