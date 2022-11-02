import java.util.Date;

public class Worker extends Staff {

    private static final String otherInfo = "";
    private static final String staffType = "Worker";

    public Worker(String fio, Date birthDate, Date employmentDate) {
        super(staffType, fio, birthDate, employmentDate, otherInfo);
    }
}
