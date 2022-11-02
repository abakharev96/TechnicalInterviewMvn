import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Staff {
    private final String fio;
    private final Date birthDate;
    private final Date employmentDate;
    private final String otherInfo;
    private final String staffType;

    public Staff(String staffType, String fio, Date birthDate, Date employmentDate, String otherInfo) {
        this.staffType = staffType;
        this.fio = fio;
        this.birthDate = birthDate;
        this.employmentDate = employmentDate;
        this.otherInfo = otherInfo;
    }

    public String getFio() {
        return fio;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Date getEmploymentDate() {
        return employmentDate;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public String getStaffType() {
        return staffType;
    }
}
