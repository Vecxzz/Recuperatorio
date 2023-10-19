import java.util.Scanner;

public class CalculadorIVA_UrielVera {
    public static void main(String args[]){
        //Crear Scanner
        Scanner sc = new Scanner(System.in);

        //Variables
        double iva = 0, resultado = 0;
        boolean salir = false;

        //Pedir al usuario el precio del producto
        System.out.println("Ingrese el precio de su producto: ");
        double precioProd = sc.nextDouble();

        //Pedir al usuario el porcentaje del iva
        System.out.println("Ingrese el porcentaje de iva: ");
        iva = sc.nextDouble();
        iva = iva/100;

        double precioFinal = (precioProd + (precioProd * iva));
        double sumaIva = (precioProd + precioFinal);
        double restaIva = (precioProd - precioFinal);
        double multiplicacionIva = (precioProd * precioFinal);
        double divisionIva = (precioProd / precioFinal);

        System.out.println("Inicando calculadora");
        //Bucle menú
        while (salir == false){
            System.out.println("¿Qué operación desea realizar?");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");

            int operacion = sc.nextInt();

            switch (operacion){
                case 1:
                    System.out.println("Has seleccionado Suma");
                    resultado = (precioProd + sumaIva);
                    System.out.println("El resultado es " + resultado);
                    break;

                case 2:
                    System.out.println("Has seleccionado Resta");
                    resultado = (precioProd - restaIva);
                    System.out.println("El resultado es " + resultado);
                    break;

                case 3:
                    System.out.println("Has seleccionado Multiplicación");
                    resultado = (precioProd * multiplicacionIva);
                    System.out.println("El resultado es " + resultado);
                    break;

                case 4:
                    System.out.println("Has seleccionado División");
                    resultado = (precioProd / divisionIva);

                    //Si se intenta dividir por 0
                    if (divisionIva == 0){
                        System.out.print("No es posible dividir por 0");
                        continue;
                    }else {
                        System.out.println("El resultado es " + resultado);
                        break;
                    }

                case 5:
                    System.out.println("Adios, espero haberte ayudado");
                    salir = true;
                    break;

                default:
                    System.out.println("Por favor, seleccione una operacion válida");
                    break;
            }
        }
    }
}