package finalProject;
import java.util.*;
import java.util.Scanner;

public interface UserInterface {
    void displayWelcomeScreen();
    void displayMainMenu();
    int getUserChoice();
    void displayErrorMessage(String message);
}
