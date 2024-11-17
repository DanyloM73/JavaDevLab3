package parameters;

/**
 * Enum representing various clothing brands.
 * <p>
 * Implements the {@link Parameter} interface to provide a formatted name for each brand.
 */
public enum Brand implements Parameter {
    BRAND_A, BRAND_B, BRAND_C;

    /**
     * Retrieves the formatted name of the brand.
     * <p>
     * The name is formatted by converting the enum value to lowercase,
     * replacing underscores with spaces, and capitalizing the first and last letters.
     *
     * @return the formatted name of the brand
     */
    @Override
    public String getName() {
        String name = this.name().toLowerCase().replace("_", " ");
        return name.substring(0, 1).toUpperCase() +
                name.substring(1, name.length() - 1) +
                name.substring(name.length() - 1).toUpperCase();
    }
}
