package seedu.address.model.role;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

public class RoleQuota {


    public static final String MESSAGE_CONSTRAINTS =
            "Quotas should only contain numbers, and it should be at least 1 digit long";
    public static final String VALIDATION_REGEX = "\\d{1,}";
    public final String value;

    /**
     * Constructs a {@code RoleQuota}.
     *
     * @param quota A valid quota.
     */
    public RoleQuota(String quota) {
        requireNonNull(quota);
        checkArgument(isValidQuota(quota), MESSAGE_CONSTRAINTS);
        value = quota;
    }

    /**
     * Returns true if a given string is a valid quota.
     */
    public static boolean isValidQuota(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof RoleQuota // instanceof handles nulls
                && value.equals(((RoleQuota) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}
