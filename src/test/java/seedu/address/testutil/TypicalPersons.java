package seedu.address.testutil;

import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_GRADE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_GRADE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_GRADUATION_YEARMONTH_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_GRADUATION_YEARMONTH_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_INSTITUTION_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_INSTITUTION_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.AddressBook;
import seedu.address.model.person.Person;

/**
 * A utility class containing a list of {@code Person} objects to be used in tests.
 */
public class TypicalPersons {

    public static final Person ALICE = new PersonBuilder().withName("Alice Pauline")
            .withAddress("123, Jurong West Ave 6, #08-111").withEmail("alice@example.com")
            .withPhone("94351253").withGrade("4.50").withInstitution("NUS").withCourse("Computer Science")
            .withGraduationYearMonth("12/2020").withTags("friends").build();
    public static final Person BENSON = new PersonBuilder().withName("Benson Meier")
            .withAddress("311, Clementi Ave 2, #02-25").withGrade("4.60").withInstitution("NTU")
            .withCourse("Computer Engineering").withEmail("johnd@example.com").withPhone("98765432")
            .withGraduationYearMonth("06/2025").withTags("owesMoney", "friends").build();
    public static final Person CARL = new PersonBuilder().withName("Carl Kurz").withPhone("95352563")
            .withGrade("4.70").withInstitution("NTU").withCourse("Business and Accounting")
            .withEmail("heinz@example.com").withAddress("wall street").withGraduationYearMonth("12/2023").build();
    public static final Person DANIEL = new PersonBuilder().withName("Daniel Meier").withPhone("87652533")
            .withGrade("4.80").withInstitution("SMU").withEmail("cornelia@example.com").withAddress("10th street")
            .withTags("friends").withCourse("Accountancy").withGraduationYearMonth("01/2027").build();
    public static final Person ELLE = new PersonBuilder().withName("Elle Meyer").withPhone("9482224")
            .withGrade("4.90").withInstitution("SUTD").withEmail("werner@example.com")
            .withAddress("michegan ave").withGraduationYearMonth("12/2024").withCourse("Philosophy").build();
    public static final Person FIONA = new PersonBuilder().withName("Fiona Kunz").withPhone("9482427")
            .withGrade("5.00").withInstitution("PATHLIGHT").withEmail("lydia@example.com")
            .withAddress("little tokyo").withGraduationYearMonth("12/2021").withCourse("Life Science").build();
    public static final Person GEORGE = new PersonBuilder().withName("George Best").withPhone("9482442")
            .withGrade("4.40").withInstitution("SUSS").withEmail("anna@example.com")
            .withAddress("4th street").withGraduationYearMonth("03/2023").withCourse("Social Work").build();

    // Manually added
    public static final Person HOON = new PersonBuilder().withName("Hoon Meier").withPhone("8482424")
            .withGrade("4.20").withInstitution("SUTD").withEmail("stefan@example.com").withCourse("Computer Science")
            .withAddress("little india").withGraduationYearMonth("12/2020").build();
    public static final Person IDA = new PersonBuilder().withName("Ida Mueller").withPhone("8482131")
            .withGrade("4.30").withInstitution("NUS").withEmail("hans@example.com").withCourse("Computer Science")
            .withAddress("chicago ave").withGraduationYearMonth("12/2020").build();


    // Manually added - Person's details found in {@code CommandTestUtil}
    public static final Person AMY = new PersonBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY).withAddress(VALID_ADDRESS_AMY).withTags(VALID_TAG_FRIEND)
            .withGrade(VALID_GRADE_AMY).withInstitution(VALID_INSTITUTION_AMY)
            .withGraduationYearMonth(VALID_GRADUATION_YEARMONTH_AMY).build();
    public static final Person BOB = new PersonBuilder().withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_EMAIL_BOB).withAddress(VALID_ADDRESS_BOB).withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
            .withGrade(VALID_GRADE_BOB).withInstitution(VALID_INSTITUTION_BOB)
            .withGraduationYearMonth(VALID_GRADUATION_YEARMONTH_BOB).build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalPersons() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical persons.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        for (Person person : getTypicalPersons()) {
            ab.addPerson(person);
        }
        return ab;
    }

    public static List<Person> getTypicalPersons() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
