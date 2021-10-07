public class InstrukcjaSterującaSwitch {

    public static void main(String[] args) {
        String danie = "Łosoś";

        switch (danie) {
            case "Pizza":
                System.out.println("Cena to 22 zł");
                break;
            case "Łosoś":
                System.out.println("Cena to w pizdu dużo");
                break;
            default:
                System.out.println("Brak dania w karcie");
        }
    }
}
