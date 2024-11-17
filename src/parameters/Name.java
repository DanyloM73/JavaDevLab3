package parameters;

/**
 * Enum representing various clothing item names.
 * <p>
 * Implements the {@link Parameter} interface to provide a formatted name for each item.
 */
public enum Name implements Parameter {
    T_SHIRT, JACKET, SWEATER, DRESS;

    /**
     * Retrieves the formatted name of the clothing item.
     * <p>
     * The name is formatted by converting the enum value to lowercase,
     * replacing underscores with hyphens, and capitalizing the first letter.
     *
     * @return the formatted name of the clothing item
     */
    @Override
    public String getName() {
        String name = this.name().toLowerCase().replace("_", "-");
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}
