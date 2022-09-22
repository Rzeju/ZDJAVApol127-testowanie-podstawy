package zad;

public class Zadanie {

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println("Główna -> " + i);
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    break;
                }
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
