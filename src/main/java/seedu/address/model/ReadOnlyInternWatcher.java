package seedu.address.model;

import javafx.collections.ObservableList;
import seedu.address.model.person.Applicant;

/**
 * Unmodifiable view of an address book
 */
public interface ReadOnlyInternWatcher {

    /**
     * Returns an unmodifiable view of the persons list.
     * This list will not contain any duplicate persons.
     */
    ObservableList<Applicant> getPersonList();

}