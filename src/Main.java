/*
    Este programa permite gestionar el inventario de una tienda.
    Se puede Agregar, listar, actualizar y eliminar productos.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        int cantidad = 0;

        String [] nombreProducto = new String[cantidad];
        int [] cantidadProducto = new int [cantidad];

        System.out.println("  GESTOR DE INVENTARIO  ");
        do {
            System.out.println("  ELIJA  UNA OPCION  ");
            System.out.println(" 1. Agregar Producto  ");
            System.out.println(" 2. Mostrar Producto  ");
            System.out.println(" 3. Actualizar cantidad de un Producto  ");
            System.out.println(" 4. Eliminar Producto  ");
            System.out.println(" 0. Salir");
            System.out.println("Opcion: "); opcion = teclado.nextInt();

            if (opcion == 1)
            {
                System.out.println("Cuantos productos quiere agregar?  ");
                cantidad = teclado.nextInt();

                teclado.nextLine();

                nombreProducto = new String[cantidad];
                cantidadProducto = new int [cantidad];

                for(int i = 0; i < cantidad; i++){
                    System.out.println("Nombre del producto: ");  nombreProducto[i] = teclado.next();
                    System.out.println("Cantidad del producto: ");  cantidadProducto[i] = teclado.nextInt();
                    teclado.nextLine();
                }
            }
            else
            {
                if (opcion == 2)
                {
                    System.out.println("Usted a ingresado los siguientes productos: ");

                    for(int i = 0; i < cantidad; i++){
                        System.out.println("Producto: " + (i+1));
                        System.out.println("Nombre:  " + nombreProducto[i]);
                        System.out.println("Cantidad:  " + cantidadProducto[i]);
                    }
                }
                else
                {
                    if (opcion == 3)
                    {
                        System.out.println("Actualizar cantidad de producto: ");
                        System.out.println("Introduce la posicion del producto que quieres modificar cantidad: ");
                        int posicionModificar = teclado.nextInt();

                        if(posicionModificar >= 0 && posicionModificar<cantidad){
                            System.out.println("Ingrese el nuevo valor de cantidad: ");
                            int nuevaCantidad = teclado.nextInt();

                            cantidadProducto[posicionModificar]=nuevaCantidad;
                        }else{
                            System.out.println("Posicion no valida.");
                        }
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

    }
}