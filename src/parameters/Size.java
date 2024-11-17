package parameters;

/**
 * Enum representing various clothing sizes.
 * <p>
 * Each size is associated with a specific numeric value.
 * Implements the {@link Parameter} interface to provide the name of the size.
 */
public enum Size implements Parameter {
    XS(43), S(45), M(47), L(49), XL(51), XXL(53);

    private final int sizeValue;

    /**
     * Constructs a Size enum with a specific numeric value.
     *
     * @param sizeValue the numeric value associated with the size
     */
    Size(int sizeValue) {
        this.sizeValue = sizeValue;
    }

    /**
     * Retrieves the numeric value associated with the size.
     *
     * @return the numeric value of the size
     */
    public int getSizeValue() {
        return sizeValue;
    }

    /**
     * Retrieves the name of the size.
     * <p>
     * The name corresponds to the enum constant's name.
     *
     * @return the name of the size
     */
    @Override
    public String getName() {
        return this.name();
    }
}
