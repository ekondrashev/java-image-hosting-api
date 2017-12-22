package login;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Registration {

    void addClientInDB() throws IOException {
        String login;
        String pass1;
        String pass2;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("Enter your login");

        login = reader.readLine();

        System.out.printf("Enter your password");

        pass1 = reader.readLine();
        System.out.printf("Your login: " + login);
        System.out.printf("Enter your password again");

        pass2 = reader.readLine();

        if(pass1.equals(pass2))
        {
            saveClientInDB(login, pass1);
        }
    }

    void saveClientInDB(String login, String password)
    {

    }

}
