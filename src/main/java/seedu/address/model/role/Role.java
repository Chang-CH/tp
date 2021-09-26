package seedu.address.model.role;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import seedu.address.model.person.Person;
import seedu.address.model.person.UniquePersonList;

import java.util.Iterator;
import java.util.Objects;

public class Role {
    private final RoleName name;
    private final RoleDescription description;
    private final UniquePersonList persons;
    private final RoleQuota quota;
    // TODO: discuss adding requirements

    /**
     * Every field must be present and not null.
     */
    public Role(RoleName name, RoleDescription description, UniquePersonList persons, RoleQuota quota) {
        requireAllNonNull(name, description, persons, quota);
        this.name = name;
        this.description = description;
        this.persons = persons;
        this.quota = quota;
    }

    public RoleName getName() {
        return name;
    }

    public RoleDescription getDescription() {
        return description;
    }

    public UniquePersonList getPersons() {
        return persons;
    }

    public RoleQuota getQuota() {
        return quota;
    }

    /**
     * Returns true if both roles have the same name.
     * This defines a weaker notion of equality between two roles.
     */
    public boolean isSameRole(Role otherRole) {
        if (otherRole == this) {
            return true;
        }

        return otherRole != null
                && otherRole.getName().equals(getName());
    }

    /**
     * Returns true if both roles have the same identity and data fields.
     * This defines a stronger notion of equality between two roles.
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Role)) {
            return false;
        }

        Role otherRole = (Role) other;
        return otherRole.getName().equals(getName())
                && otherRole.getDescription().equals(getDescription())
                && otherRole.getPersons().equals(getPersons())
                && otherRole.getQuota().equals(getQuota());
    }

    @Override
    public int hashCode() {
        // use this method for custom fields hashing instead of implementing your own
        return Objects.hash(name, description, persons, quota);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(getName())
                .append("; Name: ")
                .append(getName())
                .append("; Quota: ")
                .append(getQuota())
                .append("; Description: ")
                .append(getDescription());

        Iterator<Person> persons = getPersons().iterator();
        if (!persons.hasNext()) {
            builder.append("; Candidates: ");
            persons.forEachRemaining((Person person) -> {
                builder.append(person.getName().toString());
            });
        }
        return builder.toString();
    }
}
