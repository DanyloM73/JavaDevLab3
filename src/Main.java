import parameters.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * Demonstrates the creation, manipulation, and sorting of an array of Clothing objects.
 * <p>
 * The program generates a random array of Clothing items, displays them,
 * sorts them by price (ascending) and size (descending), and searches for a specific item.
 */
public class Main {
    /**
     * A static instance of {@link Random} used for generating random values.
     */
    private static final Random random = new Random();

    /**
     * The main method that drives the program.
     * <p>
     * Steps performed:
     * <ol>
     *     <li>Generate a random array of {@link Clothing} items.</li>
     *     <li>Display the generated array.</li>
     *     <li>Sort the array by price (ascending) and size (descending).</li>
     *     <li>Display the sorted array.</li>
     *     <li>Search for a specific {@link Clothing} item in the array and display the result.</li>
     * </ol>
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int arraySize = random.nextInt(3) + 7; // Generate a random array size between 7 and 9
        Clothing[] clothingArray = new Clothing[arraySize];

        // Populate the array with random Clothing items
        for (int i = 0; i < arraySize; i++) {
            clothingArray[i] = generateRandomClothing();
        }

        // Display the generated clothing items
        System.out.println("\nClothes:");
        for (Clothing clothing : clothingArray) {
            System.out.println(clothing);
        }

        // Sort the array by price (ascending) and size (descending)
        Arrays.sort(clothingArray, Comparator
                .comparingDouble(Clothing::getPrice)
                .thenComparing((c1, c2) -> Integer.compare(c2.getSize().getSizeValue(), c1.getSize().getSizeValue())));

        // Display the sorted clothing items
        System.out.println("\nSorted clothes:");
        for (Clothing clothing : clothingArray) {
            System.out.println(clothing);
        }

        // Select an item to search for, either randomly or an item already in the array
        Clothing searchItem;
        if (random.nextBoolean()) {
            searchItem = clothingArray[random.nextInt(arraySize)];
        } else {
            searchItem = generateRandomClothing();
        }

        // Check if the item is present in the array
        boolean found = Arrays.asList(clothingArray).contains(searchItem);
        System.out.println("\nSearching " + searchItem + "\n");
        if (found) {
            System.out.println(searchItem.buy());
        } else {
            System.out.println("The specified clothing item was not found among proposed.");
        }
    }

    /**
     * Generates a random {@link Clothing} object with random attributes.
     *
     * @return a {@link Clothing} object with randomly assigned {@link Name}, {@link Size}, {@link Color}, {@link Brand}, and price
     */
    private static Clothing generateRandomClothing() {
        Name name = Name.values()[random.nextInt(Name.values().length)];
        Size size = Size.values()[random.nextInt(Size.values().length)];
        Color color = Color.values()[random.nextInt(Color.values().length)];
        double price = 100 + random.nextInt(51) + 0.99;
        Brand brand = Brand.values()[random.nextInt(Brand.values().length)];

        return new Clothing(name, size, color, price, brand);
    }
}