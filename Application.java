/**
 * Created by Lori on 1/29/2017.
 */
public class Application {

    private String parrotTrouble(boolean talk, int hour)
    {
        Parrot parrot = new Parrot(talk);
        String True = String.valueOf(true);
        String False = String.valueOf(false);

        if (hour < 0 || hour > 23)
            return "Please enter a valid time interval that matches the following range: 0 - 23";

        if (((hour >= 0 && hour <= 6) || (hour > 20 && hour <= 23)) && parrot.getValue() == true)
            return True;

        return False;
    }


    public static void main(String[] args) {
        Application application = new Application();

        System.out.println(application.parrotTrouble(true, 7));
    }
}
