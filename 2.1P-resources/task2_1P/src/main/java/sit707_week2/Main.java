package sit707_week2;

import java.io.IOException;

/**
 * Hello world!
 * @author Ahsan Habib
 */
public class Main 
{
    public static void main( String[] args ) throws IOException
    {
    	SeleniumOperations.officeworks_registration_page("https://www.officeworks.com.au/app/identity/create-account");
    	SeleniumOperations.dribbble_signup_page("https://dribbble.com/signup/new");
    	SeleniumOperations.trustpilotinstitute_signup_page("https://trust.pilotinstitute.com/login/signup.php");
    }
}
