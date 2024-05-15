import java.util.Random;
import java.util.Scanner;

public class ExercisesHomework {
    public static void main(String[] args) {
        double[] numbersArray = new double[]{543, 13, 1033233, 44, 23};
        int[] numbersArray2 = new int[]{32, 13, 32, 4234, 24, 232, 342, 432};

        System.out.println(ex1(numbersArray));
        System.out.println("-----------------------------------");

        System.out.println(ex2(numbersArray));
        System.out.println("-----------------------------------");

        int[] arrayEx3 = ex3(numbersArray2, 49);
        for (int i : arrayEx3) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-----------------------------------");

        ex4(3212);
        System.out.println("-----------------------------------");

        ex5(12000, 10);
        System.out.println("-----------------------------------");

        Scanner scan = new Scanner(System.in);
        System.out.print("Scrieti o fraza, separate de catre un punct: ");
        String phrase = scan.nextLine();
        ex6(phrase);
    }

    public static double ex1(double[] array) {
        double sum = 0;
        for (double v : array) {
            sum += v;
        }
        return sum;
    }

    public static int ex2(double[] array) {
        int count = 0;
        for (double v : array) {
            if (v % 2 == 1) count++;
        }
        return count;
    }

    public static int[] ex3(int[] array, int number) {
        int count = 0;
        for (int j : array) {
            if (j > number) count++;
        }

        int[] result = new int[count];

        int index = 0;
        for (int j : array) {
            if (j > number) {
                result[index++] = j;
            }
        }
        return result;
    }

    public static void ex4(int donationTarget) {
        Random random = new Random();

        int sum = 0;
        System.out.println("Our donation target is: " + donationTarget + "$");

        while (sum < donationTarget) {
            int donation = random.nextInt(1000) + 1;
            sum += donation;
            System.out.println("We received a donation of: " + donation + "$");
        }

        System.out.println("Succes! We have reached our donation target!");
    }

    public static void ex5(int donationTarget, int maxNumberOfDonations) {
        Random random = new Random();

        int sum = 0, numbersOfDonations = 0;
        System.out.println("Our donation target is: " + donationTarget + "$");
        System.out.println("We need to reach it in " + maxNumberOfDonations + " donations.");

        while (sum < donationTarget && numbersOfDonations < maxNumberOfDonations) {
            int donation = random.nextInt(2000) + 1;
            sum += donation;
            numbersOfDonations++;
            System.out.println("We received a donation of: " + donation + "$");
        }

        if (sum >= donationTarget)
            System.out.println("Succes! We have reached our donation target!");
        else System.out.println("The campaign has ended. We have not reached our donation target :(");
    }

    public static void ex6(String phrase) {
        String[] phraseSplit = phrase.split("\\.");

        for (String sentence : phraseSplit) {
            sentence = sentence.trim();
            if (!sentence.isEmpty())
                System.out.println(sentence + ".");
        }
    }
}