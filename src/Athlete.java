
public class Athlete {
	
    static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
    this.name = name;
    this.speed = speed;
    }

    public static void main(String[] args) {
    //create two athletes
    		Athlete john = new Athlete("John", 15);
    		Athlete geor = new Athlete("George", 10);
    	
    	//print their names, bibNumbers, and the location of their race.
    		System.out.println(john.name + " " + nextBibNumber + " " + raceLocation);
    		nextBibNumber++;
    		System.out.println(geor.name + " " + nextBibNumber + " " + raceLocation);
    }
}