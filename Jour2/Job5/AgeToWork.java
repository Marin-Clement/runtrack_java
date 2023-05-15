package Jour2.Job5;

public class AgeToWork {
    public static void main(String[] args) {
        System.out.println("Entre ton âge :");
        int age = Integer.parseInt(System.console().readLine());
        if (age < 16) {
         System.out.println("Désolé, vous êtes trop jeune pour travailler.");
        } else if (age >= 16 && age < 55) {
         System.out.println("Vous êtes en âge de travailler.");
        } else if (age >= 55 && age < 67) {
         System.out.println("Vous pourriez avoir des difficultés à trouver un emploi.");
        } else {
         System.out.println("Vous êtes en retraite.");
        }
    }
}