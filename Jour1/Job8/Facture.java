package Jour1.Job8;

public class Facture    {
    public static void main(String[] args) {
        float prix = 49.99f;
        int quantite = 3;
        float tva = 20f;
        float tarifHT = prix * quantite;
        float tarifTTC = tarifHT * (1 + tva / 100);
        System.out.println("Le tarif montant total est de " + tarifHT + " euros");
        System.out.println("Le montant de la taxe est de " + (tarifTTC - tarifHT) + " euros");
        System.out.println("Le montant total a payer est de " + tarifTTC + " euros");
    }
}
