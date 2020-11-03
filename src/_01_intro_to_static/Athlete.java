package _01_intro_to_static;

public class Athlete {
    static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";
//when static is changed it effects every object in the class
    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
        this.bibNumber = nextBibNumber;
        nextBibNumber += 1;
    }

    public static void main(String[] args) {
        //create two athletes
    	Athlete bolt = new Athlete("Bolt", 10); 
    	Athlete Jordan = new Athlete("Jordan", 6);
        //print their names, bibNumbers, and the location of their race. 
    	System.out.println(bolt.name + " , " +bolt.bibNumber + " , "+Athlete.raceLocation);
    	System.out.println(Jordan.name + " , " + Jordan.bibNumber + " , " + Athlete.raceLocation);
    
    
    }
}
