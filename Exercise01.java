package lesson4;

public class Exercise01 {
    public static void main(String[] args) {

        String stringGiven = "2hrs and 5 minutes";

        String hourChaging = stringGiven.substring(0, stringGiven.indexOf("hrs"));
        int hourToShow = Integer.parseInt(hourChaging);
        
        String minuteChaging = stringGiven.substring(stringGiven.indexOf("and ") + 4, stringGiven.indexOf(" minutes"));
        int minuteToShow = Integer.parseInt(minuteChaging);
        int totalMinutes = hourToShow * 60 + minuteToShow;
        
        System.out.println("Total minutes is " + totalMinutes);
    }
}
