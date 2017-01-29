/**
 * Created by Lori on 1/29/2017.
 */
public class Application
{
    private boolean parrotTrouble (boolean talk, int hour)
    {
        Parrot parrot = new Parrot(talk);

        if (hour < 0 || hour > 23)
            throw new NumberFormatException("Please enter a valid time interval that matches the following range: 0 - 23");

        if (((hour >= 0 && hour <= 6) || (hour > 20 && hour <= 23)) && parrot.getValue() == true)
            return true;

        return false;
    }
    public static void main (String []args)
    {
        Application application = new Application();

        System.out.println(application.parrotTrouble(false, 6));
    }
}
