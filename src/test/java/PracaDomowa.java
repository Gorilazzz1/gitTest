import java.util.Scanner;

public class PracaDomowa {
    public static void main(String[] args) {
        System.out.println("Podaj proszę swój wiek");
        Scanner scanner = new Scanner(System.in);
        int wiek = scanner.nextInt();
        if(wiek <18){
            System.out.println("Nie możemy sprzedać alkoholu - spadaj na drzewo małolat");
        } else{
            System.out.println("dziękujemy za zakupy");
        }
    }
}
