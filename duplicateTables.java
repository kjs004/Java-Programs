public class duplicateTables{

    public static void main(String[] args) {

        int[] products = new int[70];
        int[] tables = new int[70];
        int[] multipliers = new int[70];

        int index = 0;

        // Generate tables from 12 to 18
        for (int i = 12; i <= 18; i++) {
            for (int j = 1; j <= 10; j++) {

                products[index] = i * j;
                tables[index] = i;
                multipliers[index] = j;

                index++;
            }
        }

        int count = 0;

        // Compare every product with every other product
        for (int i = 0; i < 70; i++) {

            for (int j = i + 1; j < 70; j++) {

                if (products[i] == products[j]) {

                    count++;

                    System.out.println("Duplicate Product = " + products[i]);

                    System.out.println(
                        tables[i] + " x " + multipliers[i]
                    );

                    System.out.println(
                        tables[j] + " x " + multipliers[j]
                    );

                    System.out.println();
                }
            }
        }

        System.out.println("Total Duplicate Pairs = " + count);
    }
}