import java.util.Scanner;

public class main {

    public static void main (String[] args){

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while(!salir){

            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            matriz sumad= new matriz();


            switch(opcion){
                case 1:
                    sumad.sumadiagonal();
                    break;
                case 2:
                    sumad.diferenciaDiagonal();
                    break;
                default:
                    System.out.println("Solo números entre 1 y 2");
            }

        }




    }
}
