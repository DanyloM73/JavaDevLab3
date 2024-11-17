package parameters;

/**
 * Represents a common interface for all parameters used in the application.
 * <p>
 * Classes implementing this interface must provide a method to retrieve
 * the parameter's name as a {@link String}.
 */
public interface Parameter {
    /**
     * Retrieves the name of the parameter.
     *
     * @return the name of the parameter
     */
    String getName();
}
