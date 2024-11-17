import parameters.*;

import java.util.Objects;

/**
 * Represents a piece of clothing with specific attributes such as name, size, color, price, and brand.
 */
public class Clothing {
    private final Name name;
    private final Size size;
    private final Color color;
    private final double price;
    private final Brand brand;

    /**
     * Constructs a new Clothing object with specified attributes.
     *
     * @param name  the name of the clothing item
     * @param size  the size of the clothing item
     * @param color the color of the clothing item
     * @param price the price of the clothing item
     * @param brand the brand of the clothing item
     */
    public Clothing(Name name, Size size, Color color, double price, Brand brand) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.price = price;
        this.brand = brand;
    }

    /**
     * Gets the name of the clothing item.
     *
     * @return the name of the clothing item
     */
    public Name getName() { return name; }

    /**
     * Gets the size of the clothing item.
     *
     * @return the size of the clothing item
     */
    public Size getSize() { return size; }

    /**
     * Gets the color of the clothing item.
     *
     * @return the color of the clothing item
     */
    public Color getColor() { return color; }

    /**
     * Gets the price of the clothing item.
     *
     * @return the price of the clothing item
     */
    public double getPrice() { return price; }

    /**
     * Gets the brand of the clothing item.
     *
     * @return the brand of the clothing item
     */
    public Brand getBrand() { return brand; }

    /**
     * Simulates buying the clothing item.
     *
     * @return a string describing the purchase details
     */
    public String buy() {
        return "Buying " + color.getName().toLowerCase() +
                " " + name.getName().toLowerCase() +
                " by \"" + brand.getName() + "\""+
                " for " + price;
    }

    /**
     * Compares this clothing item to another object for equality.
     * <p>
     * Overrides the {@link Object#equals(Object)} method to provide
     * a custom comparison logic for Clothing objects.
     *
     * @param obj the object to compare with
     * @return true if the specified object is equal to this clothing item, otherwise false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Clothing clothing = (Clothing) obj;
        return price == clothing.price &&
                Objects.equals(name, clothing.name) &&
                Objects.equals(size, clothing.size) &&
                Objects.equals(color, clothing.color) &&
                Objects.equals(brand, clothing.brand);
    }

    /**
     * Generates a hash code for this clothing item.
     * <p>
     * Overrides the {@link Object#hashCode()} method to generate
     * a hash code based on the attributes of Clothing.
     *
     * @return the hash code value for this clothing item
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, size, color, price, brand);
    }

    /**
     * Returns a string representation of the clothing item.
     * <p>
     * Overrides the {@link Object#toString()} method to return
     * a string containing the attributes of Clothing.
     *
     * @return a string describing the clothing item
     */
    @Override
    public String toString() {
        return "clothing: [" +
                "name='" + name.getName() + '\'' +
                ", size='" + size.getName() + '\'' +
                ", color='" + color.getName() + '\'' +
                ", price=" + price +
                ", brand='" + brand.getName() + '\'' +
                ']';
    }
}
