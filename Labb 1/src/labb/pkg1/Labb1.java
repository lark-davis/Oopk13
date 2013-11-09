/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package labb.pkg1;

/**
 *
 * @author Jon
 */
public class Labb1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human lark = new Human(32, "Lark");
        Human putte = new Human(25,"Putte");
        System.out.println(lark.getName()+" is "+lark.getAge()+" yrs old.");
        System.out.println(putte);  //när man skriver ut ett objekt anropas objektets toString metod automagiskt!
        //referens: http://www.devx.com/tips/Tip/30426
        Human person = new Human(); //person is a randomly generated human
        System.out.println(person);
    }
}   