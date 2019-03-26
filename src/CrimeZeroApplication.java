import java.util.Scanner;

public class CrimeZeroApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String input = scanner.nextLine();
            SMSZeroForASuperHero smsZeroForASuperHero = new SMSZeroForASuperHero(input);
            String output = smsZeroForASuperHero.filterSuperHeroName();
            System.out.println(output);
        }
    }
}
