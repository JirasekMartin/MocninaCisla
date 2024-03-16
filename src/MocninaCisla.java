import java.util.Scanner;

public class MocninaCisla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Utf-8");
        System.out.println("Mocninátor");
        System.out.println("=========");
        System.out.println("Zadejte exponent: ");
        int zaklad = Integer.parseInt(scanner.nextLine());
        System.out.println("Zadejte exponent: ");
        int exponent = Integer.parseInt(scanner.nextLine());

        int vysledek = zaklad;
        for (int i = 0; i < (exponent - 1); i++) {
            vysledek = vysledek * zaklad;
        }
        System.out.println("Výsledek: " + vysledek);
        System.out.println("Děkuji za použití mocninátoru");
    }
}