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
public class Fysiker extends Human {
    
    // här lägger till en fält för årskurs
    public int year;

    //the fysiker constructors:
    
    public Fysiker(){
        this(getRandomAge(), getRandomName(), getRandomYear());
    }
        
    private static int getRandomAge(){
        Double d = Math.random()*100;
        int randomAge = d.intValue();
        return randomAge;
        }
    private static String getRandomName(){
        String[] randomnames = {
            "Avon", "Stringer",
            "Snoop", "Kima",
            "Greggs", "Carver",
            "Marlo","Prezbo",
            "Rhonda","The Bunk",
            "McNulty"
        };
        Double d = Math.random()*10;
        int i = d.intValue();
        String randomName = randomnames[i];
        return randomName;
    }
    private static int getRandomYear(){
        Double d = Math.random()*1000;
        int randomYear = d.intValue() + 1013;
        if (randomYear > 1932){
            return randomYear;
        } else {
            while (randomYear < 1932){
            randomYear += 82;
            }
        return randomYear;
        }
    }
        
    
    public Fysiker(int ageIn, String nameIn, int yearIn){
        name = nameIn;
        if (yearIn>=2011 | yearIn<=1932){
            year = 2011;  //ett default year typ
            //System.err.println("The year entered is not valid, it has been changed to the default year.");
        } else {
            year = yearIn;
        }
        if (ageIn - 2013 + year < 16){
            age = 2029 - year;  //det här är typ ett default age :
                                //ett age skapas som förhåller sig till year på så sätt att
                                //man var 16 när man började
            //System.err.println("The age entered is not valid, it has been changed to a reasonable age.");
        } else {
            age = ageIn;
        }  
    }
    //referens: stackoverflow.com/questions/1795808/and-and-or-in-if-statements
    public int getYear(){
        return year;
    }
    
    @Override       //override the original override
    public String toString(){
        String nameOut = getName();
        int ageIn = getAge();
        int yearIn = getYear();
        String ageOut = String.valueOf(ageIn);
        String yearOut = String.valueOf(yearIn);
        String printout = ("namn: "+nameOut+", ålder: "+ageOut+", började Fysik "+yearOut);
        return printout;
    }
}
