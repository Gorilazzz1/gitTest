import java.sql.SQLOutput;

public class Switch {
    public static void main(String[] args) {

        String piwo = "Wiślackie";
        switch (piwo){
            case "Żywiec":
                System.out.println("chce się Ż...");
                break;
            case "Tyskie":
                System.out.println("Przejdźmy na Ty..");
                break;
            case "Wiślackie":
                System.out.println("Najlepsze pifko");
                break;
        }
    }
}
