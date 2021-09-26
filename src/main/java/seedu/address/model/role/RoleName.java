package seedu.address.model.role;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

public class RoleName {
    public static final String MESSAGE_CONSTRAINTS =
            "Names should only contain alphanumeric characters and spaces, and it should not be blank";

    /*
     * The first character of the address must not be a whitespace,
     * otherwise " " (a blank string) becomes a valid input.
     */
    public static final String VALIDATION_REGEX = "[\\p{Alnum}][\\p{Alnum} ]*";

    public final String value;

    /**
     * Constructs a {@code RoleName}.
     *
     * @param name A valid role name.
     */
    public RoleName(String name) {
        requireNonNull(name);
        checkArgument(isValidRoleName(name), MESSAGE_CONSTRAINTS);
        this.value = name;
    }

    /**
     * Returns true if a given string is a valid name.
     */
    public static boolean isValidRoleName(String test) {
        return test.matches(VALIDATION_REGEX);
    }


    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof RoleName // instanceof handles nulls
                && value.equals(((RoleName) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}
