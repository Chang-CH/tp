package seedu.address.model.role;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

public class RoleDescription {
    public static final String MESSAGE_CONSTRAINTS =
            "Descriptions should only contain alphanumeric characters and spaces";

    /*
     * Allow empty descriptions
     */
    public static final String VALIDATION_REGEX = "[\\p{Alnum}]*";

    public final String value;

    /**
     * Constructs a {@code RoleDescription}.
     *
     * @param description A valid role description.
     */
    public RoleDescription(String description) {
        requireNonNull(description);
        checkArgument(isValidRoleDescription(description), MESSAGE_CONSTRAINTS);
        this.value = description;
    }

    /**
     * Returns true if a given string is a valid description.
     */
    public static boolean isValidRoleDescription(String test) {
        return test.matches(VALIDATION_REGEX);
    }


    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof RoleDescription // instanceof handles nulls
                && value.equals(((RoleDescription) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
