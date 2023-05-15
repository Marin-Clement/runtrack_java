package Jour1.Job10;

public class AskForName {
    public static void main(String[] args) {
        System.out.println("Quel est votre nom ?");
        String name = System.console().readLine();
        System.out.println("Quel est votre prénom ?");
        String firstname = System.console().readLine();
        System.out.println("Bonjour " + name + " " + firstname);
    }
}
