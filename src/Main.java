public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int N = 10000;

        int[] list = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            list[i] = i + 2;
        }

        int size = list.length;

        for (int i = 0; i < size; i++) {
            int number = list[i];
            if (number < 0) {
                continue;
            }

            int numberAlCuadrado = number * number;
            if (numberAlCuadrado > N) {
                break;
            }

            for (int j = i + number; j < size; j += number) {
                int multiplo = list[j];
                if (multiplo > 0) {
                    list[j] = -multiplo;
                }
            }
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Numeros primos hasta " + N + ":");
        for (int i = 0; i < size; i++) {
            int number = list[i];
            if (number > 0) {
                System.out.println(number);
            }
        }
        System.out.println("Duracion: " + duration);
    }
}
