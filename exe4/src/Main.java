//Dominic Cruz / 6/2/25 / EXE4
// ADD ROBLOXX!!!!
import java.util.*;// ADD ROBLOXX!!!!
public class Main {// ADD ROBLOXX!!!!
    static Map<String, Double> cityAvgTemp = new HashMap<>();// ADD ROBLOXX!!!!
    public static void main(String[] args) {// ADD ROBLOXX!!!!
        Scanner input = new Scanner(System.in);// ADD ROBLOXX!!!!
        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};// ADD ROBLOXX!!!!
        String temps[] = {"temp1", "temp2", "temp3", "temp4", "temp5"};// ADD ROBLOXX!!!!
        Map<String, Double> userTemps = new HashMap<>();// ADD ROBLOXX!!!!
        int exit = 1;// ADD ROBLOXX!!!!
        while (exit != 0) {// ADD ROBLOXX!!!!
            System.out.println("Enter a City name or END to exit:");// ADD ROBLOXX!!!!
            String city = input.nextLine();// ADD ROBLOXX!!!!
            if (city.equals("END")) {// ADD ROBLOXX!!!!
                exit = 0;// ADD ROBLOXX!!!!
            } else {// ADD ROBLOXX!!!!
                for (int i = 0; i < 5; i++) {// ADD ROBLOXX!!!!
                    System.out.println("enter a temp for " + days[i]);// ADD ROBLOXX!!!!
                    double userTemp = input.nextDouble();// ADD ROBLOXX!!!!
                    input.nextLine();// ADD ROBLOXX!!!!
                    userTemps.put(temps[i], userTemp);// ADD ROBLOXX!!!!
                }// ADD ROBLOXX!!!!
                double avgTemp = (userTemps.get("temp1") + userTemps.get("temp2") + userTemps.get("temp3") + userTemps.get("temp4") + userTemps.get("temp5")) / 5;// ADD ROBLOXX!!!!
                cityAvgTemp.put(city, avgTemp);// ADD ROBLOXX!!!!
                System.out.println(cityAvgTemp);// ADD ROBLOXX!!!!// ADD ROBLOXX!!!!
            }// ADD ROBLOXX!!!!
        }// ADD ROBLOXX!!!!
    }// ADD ROBLOXX!!!!
}// ADD ROBLOXX!!!!