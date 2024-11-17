package parameters;

/**
 * Enum representing various clothing colors.
 * <p>
 * Implements the {@link Parameter} interface to provide a formatted name for each color.
 */
public enum Color implements Parameter {
    RED, BLUE, BLACK, GREEN, WHITE, YELLOW;

    /**
     * Retrieves the formatted name of the color.
     * <p>
     * The name is formatted by converting the enum value to lowercase
     * and capitalizing the first letter.
     *
     * @return the formatted name of the color
     */
    @Override
    public String getName() {
        String name = this.name().toLowerCase();
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}
