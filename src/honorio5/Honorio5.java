/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package honorio5;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Honorio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.print("Ingresa el tamaño de la matriz (n para una matriz de nxn): ");
        int n = leer.nextInt();
        int[][] matriz=new int[n][n];
        System.out.println("Ingresa los elementos de la matriz:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("Elemento ["+i+"]["+j+"]: ");
                matriz[i][j]=leer.nextInt();
            }
        }
        boolean esSimetrica = true;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(matriz[i][j]!=matriz[j][i]) {
                    esSimetrica = false;
                    break;
                }
            }
            if (!esSimetrica) {
                break;
            }
        }
        if(esSimetrica){
            System.out.println("La matriz es simétrica.");
        }else{
            System.out.println("La matriz no es simétrica.");
        }
        leer.close();
    }
}
