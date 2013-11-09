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
public class RandomPeople {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*****15 st Humans:*****");
        int[] numbers = 
             {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        Human[] HumanPeople;
        HumanPeople = new Human[15];
        for (int item : numbers) {
             HumanPeople[item] = new Human();
        }
        for (int item : numbers) {
            System.out.println(HumanPeople[item]);
        }
        System.out.println("*****15 st Fysiker:*****");
        Fysiker[] FysikerPeople;
        FysikerPeople = new Fysiker[15];
        for (int item : numbers) {
             FysikerPeople[item] = new Fysiker();
        }
        for (int item : numbers) {
            System.out.println(FysikerPeople[item]);
        }
        
        // how to switch between main classes:
        // referens: http://java.about.com/od/netbeans/a/multiplemainclasses.htm
        
        System.out.println("*****5st Humans med 5st Fysiker:*****");
        
        Human[] Blandad = new Human[10];
        int[] indexes = {
            0,1,2,3,4};
        for (int item : indexes) {
            Blandad[item] = new Human();
        }
        
        int[] MoreIndexes = {
            5,6,7,8,9};
        for (int item : MoreIndexes) {
            Blandad[item] = new Fysiker();
        }
        
        int[] EvenMoreIndexes = {
            0,1,2,3,4,5,6,7,8,9
        };
        for (int item : EvenMoreIndexes){
        System.out.println(Blandad[item]);
        }
        
        System.out.println(Blandad[1].compareTo(Blandad[2]));
    }
    
}
