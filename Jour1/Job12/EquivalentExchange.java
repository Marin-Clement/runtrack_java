package Jour1.Job12;

public class EquivalentExchange {
    public static void main(String[] args) {
        String chaine1 = "Hello";
        String chaine2 = "World";

        chaine1 = chaine1 + chaine2;
        chaine2 = chaine1.substring(0, chaine1.length() - chaine2.length());
        chaine1 = chaine1.substring(chaine2.length());

        System.out.println(chaine1);
        System.out.println(chaine2);
    }
}
