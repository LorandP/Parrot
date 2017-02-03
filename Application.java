/**
 * Created by Lori on 1/29/2017.
 */
public class Application {

    /**
     * This method verifies if the parrot class returns true in a specific time interval.
     * Returns true if the parrot class returns true from 0 - 6 or 21 - 23, else returns false.
     *
     * @param talk a true or false value that is used by the parrot class.
     * @param hour the hour interval in which the parrot is active or not (true or false).
     * @return true if it is active during 0 - 6 or 21 -23 else false.
     */
    private String parrotTrouble(boolean talk, int hour) {
        Parrot parrot = new Parrot(talk);
        String stringValueOfTrue = String.valueOf(true);
        String stringValueOfFalse = String.valueOf(false);

        if (hour < 0 || hour > 23)
            return "Please enter a valid time interval that matches the following range: 0 - 23";

        if (((hour >= 0 && hour <= 6) || (hour > 20 && hour <= 23)) && parrot.getValue() == true)
            return stringValueOfTrue;

        return stringValueOfFalse;
    }


    public static void main(String[] args) {
        Application application = new Application();

        System.out.println(application.parrotTrouble(true, 7));
    }
}
