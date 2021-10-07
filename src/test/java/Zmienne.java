import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
// Zmienne -  Zarezerwowane miejsce w pamięci z określonym typem danych
//nazwy zmiennych zawsze zaczynają się z małej litery jeśli są to dwa wyrazy to koleny wyraz z dużej litery reszta małę
public class Zmienne {
    public static void main(String[] args) {

        String name = "David";
        int firstNumber = 2;
        int secondNumber = 4;
        int result = firstNumber + secondNumber;

        name = "Marcin";
        System.out.println(name + " " + result);
        System.out.println(result);


    }
}
