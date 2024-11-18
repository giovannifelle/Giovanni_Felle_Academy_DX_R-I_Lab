public class SwitchTest {
    public static void main(String[] args) {
        int day = 3; // Cambia il valore per testare i vari casi

        switch (day) {
            case 1:
                System.out.println("Oggi è lunedì.");
                break;
            case 2:
                System.out.println("Oggi è martedì.");
                break;
            default:
                System.out.println("Giorno non riconosciuto.");
        }
    }
}