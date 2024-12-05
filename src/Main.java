public class Main {
    public static void main(String[] args) {

        int[] vetor1 = {10, 24, 32, 40, 65};

        for (int i = 0; i < vetor1.length; i++) {
            System.out.println(vetor1[i]);
        }

        int[] vetor2 = {190, 25, 30, 60, 85};

        int count1 = 0;

        while (count1 < vetor2.length) {
            System.out.println(vetor2[count1]);
            count1++;
        }

        int[] vetor3 = {19, 75, 38, 69, 35};

        int count2 = 0;

        do {
            System.out.println(vetor3[count2]);
            count2++;
        } while (count2 < vetor3.length);

    }
}