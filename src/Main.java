
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int month, day;

        Scanner input = new Scanner(System.in);

        System.out.print("Month of birth : ");
        month = input.nextInt();
        System.out.print("Date of birth : ");
        day = input.nextInt();

        switch (month) {
            case 1:
                if ((day >= 1) && (day < 22)) {
                    System.out.println("Capricorn");
                }
                if ((day >= 22) && (day <= 31)) {
                    System.out.println("Aquarius");
                }else{
                    System.out.println("İnvalid Date !!");
                }
                break;
            case 2:
                if ((day >= 1) && (day <= 19)) {
                    System.out.println("Aquarius");
                }
                if ((day > 19) && (day <= 28)) {
                    System.out.println("Pisces");
                }else{
                    System.out.println("İnvalid Date !!");
                }
                break;
            case 3:
                if ((day >= 1) && (day <= 20)) {
                    System.out.println("Pisces");
                }
                if ((day > 20) && (day <= 31)) {
                    System.out.println("Aries");
                }else{
                    System.out.println("İnvalid Date !!");
                }
                break;
            case 4:
                if ((day >= 1) && (day <= 20)) {
                    System.out.println("Aries");
                }
                if ((day > 20) && (day <= 30)) {
                    System.out.println("Taurus");
                }else{
                    System.out.println("İnvalid Date !!");
                }
                break;
            case 5:
                if ((day >= 1) && (day <= 21)) {
                    System.out.println("Taurus");
                }
                if ((day > 21) && (day <= 31)) {
                    System.out.println("Gemini");
                }else{
                    System.out.println("İnvalid Date !!");
                }
                break;
            case 6:
                if ((day >= 1) && (day <= 22)) {
                    System.out.println("Gemini");
                }
                if ((day > 22) && (day <= 30)) {
                    System.out.println("Cancer");
                }else{
                    System.out.println("İnvalid Date !!");
                }
                break;
            case 7:
                if ((day >= 1) && (day <= 23)) {
                    System.out.println("Cancer");
                }
                if ((day > 23) && (day <= 31)) {
                    System.out.println("Leo");
                }else{
                    System.out.println("İnvalid Date !!");
                }
                break;
            case 8:
                if ((day >= 1) && (day <= 22)) {
                    System.out.println("Leo");
                }
                if ((day > 22) && (day <= 31)) {
                    System.out.println("Virgo");
                }else{
                    System.out.println("İnvalid Date !!");
                }
                break;
            case 9:
                if ((day >= 1) && (day <= 22)) {
                    System.out.println("Virgo");
                }
                if ((day > 22) && (day <= 30)) {
                    System.out.println("Libra");
                }else{
                    System.out.println("İnvalid Date !!");
                }
                break;
            case 10:
                if ((day >= 1) && (day <= 22)) {
                    System.out.println("Libra");
                }
                if ((day > 22) && (day <= 31)) {
                    System.out.println("Scorpio");
                }else{
                    System.out.println("İnvalid Date !!");
                }
                break;
            case 11:
                if ((day >= 1) && (day <= 21)) {
                    System.out.println("Scorpio");
                }
                if ((day > 21) && (day <= 30)) {
                    System.out.println("Sagittarius");
                }else{
                    System.out.println("İnvalid Date !!");
                }
                break;
            case 12:
                if ((day >= 1) && (day <= 21)) {
                    System.out.println("Sagittarius");
                }
                if ((day > 21) && (day <= 31)) {
                    System.out.println("Capricorn");
                }else{
                    System.out.println("İnvalid Date !!");
                }
                break;
        }
    }
}