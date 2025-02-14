/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author uestudiantes
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        // Declaración variables - atributos u objetos
        Scanner read = new Scanner(System.in);
        float notaBaja = 6;
        float notaAlta = -1;
        float notas;
        int cantNotas;
        float promedio = 0;
        
        System.out.println("Digite la cantidad de notas");
        cantNotas = read.nextInt();
        float myArray[] = new float[cantNotas];
        for(int i = 0; i<myArray.length;i++){
            System.out.println("Dame la nota ["+i+"] :");
            notas = read.nextFloat();
            myArray[i] = notas;
            if(notas >= 0 && notas <=5){
                myArray[i] = notas;
                if(myArray[i]>notaAlta)
                {
                    notaAlta = myArray[i];
                }
                if(myArray[i]<notaBaja)
                {
                    notaBaja = myArray[i];
                }
            }else{
                JOptionPane.showMessageDialog(null, "Nota invalida");
                i--;
            }
        }
        for(int i = 0 ; i < myArray.length; i++){
            promedio = promedio += myArray[i];
        }
        promedio = promedio / cantNotas;
        System.out.println("Promedio"+promedio);
        System.out.println("Su nota mas Alta es "+notaAlta);
        System.out.println("Su nota mas Baja es "+notaBaja);

    }
    
}
