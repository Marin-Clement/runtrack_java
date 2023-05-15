package Jour1.Job11;

public class FormatHour {
    public static void main(String[] args) {
        System.out.println("Entrez une durée en minutes :");
        String minutes = System.console().readLine();
        int minutesInt = Integer.parseInt(minutes);
        int hours = minutesInt / 60;
        int minutesLeft = minutesInt % 60;
        System.out.println(minutesInt + " minutes correspond à " + hours + " heures et " + minutesLeft + " minutes.");
    }
}
