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
public class Human implements Comparable {
    
     // the two required fields:
    public int age;
    public String name;
    
    // the constructors:
    // first, the one with no argument
    
    public Human(){
        this(getRandomAge(), getRandomName());
    }
        
    private static int getRandomAge(){
        Double d = Math.random()*100;
        int randomAge = d.intValue();
        return randomAge;
        }
    private static String getRandomName(){
        String[] randomnames = {
            "Bernhard", "Yakuseki",
            "Amitaba", "Sakyamuni",
            "Maitreya", "Ashlynn",
            "Walter","Garland",
            "Fanny","Ethel",
            "Cheepers"
        };
        Double d = Math.random()*10;
        int i = d.intValue();
        String randomName = randomnames[i];
        return randomName;
        //referens: http://stackoverflow.com/questions/285177/how-do-i-call-one-constructor-from-another-in-java
        //referens: http://stackoverflow.com/questions/9102318/cast-double-to-integer-in-java
    }
    
    //constructor with argument:
    public Human(int ageIn, String nameIn){
        age = ageIn;
        name = nameIn;
    }
    // the required methods:
    public int getAge(){ 
        return age;
    }
    public String getName(){
        return name;
        
    }
    @Override       //use this because there is also a built-in toString method
    public String toString(){
        String nameOut = getName();
        int ageIn = getAge();
        String ageOut = String.valueOf(ageIn);
        String printout = ("namn: "+nameOut+", ålder: "+ageOut);
        return printout;
        //referens: http://stackoverflow.com/questions/5071040/java-convert-integer-to-string
        // referens: http://stackoverflow.com/questions/9005842/function-to-return-a-string-in-java
    }    
    
    @Override
    public int compareTo(Object o1){
        if (this.age == ((Human) o1).age)
            return 0;
        else if (this.age > ((Human) o1).age)
            return 1;
        else
            return -1;
    }
     //referens: www.java-tips.org/jave-se-tips/java.lang/how-to-use-comparable-interface.html
    
    
}