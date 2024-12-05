public class Main {
    public static void main(String[] args) {

        int[] vetor1 = {10, 24, 32, 40, 65};

        for (int i = 0; i < vetor1.length; i++) {
            System.out.println(vetor1[i]);
        }

        int[] vetor2 = {190, 25, 30, 60, 85};

        int count = 0;

        while (count < vetor2.length) {
            System.out.println(vetor2[count]);
            count++;
        }
    }
}