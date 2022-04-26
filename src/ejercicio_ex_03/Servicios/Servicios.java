/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_ex_03.Servicios;

import ejercicio_ex_03.Entidades.Poliza;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class Servicios {
    private ArrayList<Poliza> Polizas = new ArrayList();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //COMPLETAR ALGÚN DÍA
    private void LlenarPoliza(){
        
    }
    
    private void MostrarPolizas(){
        System.out.println("Mostrando polizas:");
        for (Poliza i : Polizas) {
            System.out.println(i);
        }
    }
    
    public void Menu(){
        int op;
        System.out.println("");
        System.out.println("1- Ingresar una poliza."
                + "2- Mostrar Polizas."
                + "3- Salir del programa.");
        System.out.print("Opción: ");
        op=leer.nextInt();
        switch(op){
            case 1:
                LlenarPoliza();
                Menu();
                break;
            case 2:
                MostrarPolizas();
                Menu();
                break;
            case 3:
                break;
            default:
                System.out.println("Opción no valida.");
                Menu();
        }
    }
    
}
