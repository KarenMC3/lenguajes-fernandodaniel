/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author Fernandodaniel
 */
public class Aplicacion {
    public static void main(String[] args) {
        Animal m=new Animal(); //constructor
        m.setEdad(1);
        System.out.println("La edad es " +m.getEdad());
    }
 
}
