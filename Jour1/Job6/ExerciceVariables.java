package Jour1.Job6;

public class ExerciceVariables {

    public static void main(String[] args) {
        int num1,num2;
        num1 = 74;
        num2 = 36;
        System.out.println("La valeur de num1 est " + num1 + " et la valeur de num2 est " + num2);
        num1 = num1 ^ num2 ^ (num2 = num1);
        System.out.println("La valeur de num1 est " + num1 + " et la valeur de num2 est " + num2);
    }
}
