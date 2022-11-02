import java.util.Date;

public class OthersStaff extends Staff {
    String textDescription;
    private static final String staffType = "Other staff";

    public OthersStaff(String fio, Date birthDate, Date employmentDate, String textDescription) {
        super(staffType, fio, birthDate, employmentDate, textDescription);
    }
}
