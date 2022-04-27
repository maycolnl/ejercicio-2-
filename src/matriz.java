import javax.swing.JOptionPane;

public class matriz {

    public void sumadiagonal(){

        int filas, col, sumaFilas=0, sumaCol=0;
        int Matriz [][];



        filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas"));
        col= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de Columnas"));



        Matriz = new int [filas][col];


        for(int i=0; i<filas; i++){
            for (int x=0; x<col; x++){
                Matriz[i][x] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la posicion ["+i+"]["+x+"]"));
            }
        }
        //Sumaremos los numeros de las filas
        String cadena1 = "", cadena2 = "";
        int cont = 0;
        for (int i = 0; i < filas; i++) {
            for (int x = 0; x < col; x++) {
                if (x < col) {
                    sumaFilas += Matriz[i][x];
                }
            }
            cadena1 += "Fila " + (i+1) + " = " + sumaFilas + "\n ";
            sumaFilas = 0;
        }

        for(int i=0; i<col; i++){
            for(int x=0; x<filas; x++){
                if(x<filas){
                    sumaCol += Matriz [x][i];
                }
            }
            cadena2 += "Columna " + (i+1) +" = " + sumaCol + "\n";
            sumaCol = 0;
        }

        JOptionPane.showMessageDialog(null, "La suma es: \n " + cadena1 +  cadena2);
        int valorabsoluto = sumaFilas - sumaCol;
        JOptionPane.showMessageDialog(null, "El Valor absoluto es: \n " + valorabsoluto);
    }




    public void diferenciaDiagonal(){
        //Declaramos las variables
        int filas, col, sumaFilas=0, sumaCol=0;
        int Matriz [][];



        filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas"));
        col= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de Columnas"));


        Matriz = new int [filas][col];

        for(int i=0; i<filas; i++){
            for (int x=0; x<col; x++){
                Matriz[i][x] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la posicion ["+i+"]["+x+"]"));
            }
        }

        String cadena1 = "", cadena2 = "";
        int cont = 0;
        for (int i = 0; i < filas; i++) {
            for (int x = 0; x < col; x++) {
                if (x < col) {
                    sumaFilas += sumaFilas - Matriz[i][x];
                }
            }
            cadena1 += "Fila " + (i+1) + " = " + sumaFilas + "\n ";
            sumaFilas = 0;
        }

        for(int i=0; i<col; i++){
            for(int x=0; x<filas; x++){
                if(x<filas){
                    sumaCol +=sumaCol  - Matriz [x][i];
                }
            }
            cadena2 += "Columna " + (i+1) +" = " + sumaCol + "\n";
            sumaCol = 0;
        }

        JOptionPane.showMessageDialog(null, "La resta es: \n " + cadena1 +  cadena2);
        int valorabsoluto = sumaFilas - sumaCol;
        JOptionPane.showMessageDialog(null, "El Valor absoluto es: \n " + valorabsoluto);




    }




}