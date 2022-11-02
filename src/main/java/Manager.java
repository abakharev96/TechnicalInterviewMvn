import java.util.Date;

public class Manager extends Staff{
    String otherInfo;
    private static final String staffType = "Manager";

    public Manager(String fio, Date birthDate, Date employmentDate, int workerCount) {
        super(staffType, fio, birthDate, employmentDate, String.valueOf(workerCount));
    }
}
