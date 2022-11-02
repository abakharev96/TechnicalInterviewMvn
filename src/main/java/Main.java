import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws ParseException {
        ArrayList<Staff> staff = new ArrayList<>();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        //description of staff that have employed by entity
        Worker worker1 = new Worker("Kira A", formatter.parse("08/02/1990"), formatter.parse("11/07/2020"));
        Worker worker2 = new Worker("Kuzya M", formatter.parse("03/11/1994"), formatter.parse("14/01/2021"));
        Worker worker3 = new Worker("Albert SV", formatter.parse("21/04/1993"), formatter.parse("11/03/2022"));
        Worker worker4 = new Worker("Anastasia U", formatter.parse("17/06/1976"), formatter.parse("05/09/2019"));
        Worker worker5 = new Worker("Aleksei RB", formatter.parse("07/02/1955"), formatter.parse("19/01/2021"));

        Manager manager1 = new Manager("Arnold H", formatter.parse("11/01/1951"), formatter.parse("25/02/2019"), 3);
        Manager manager2 = new Manager("Edward R", formatter.parse("04/12/1949"), formatter.parse("16/03/2019"), 4);

        OthersStaff othersStaff1 = new OthersStaff("Mila Y", formatter.parse("15/03/2004"), formatter.parse("01/02/2022"), "cleaner");
        OthersStaff othersStaff2 = new OthersStaff("Artem K", formatter.parse("24/09/1993"), formatter.parse("17/04/2019"), "accountant");
        OthersStaff othersStaff3 = new OthersStaff("Eugenia OM", formatter.parse("01/11/1991"), formatter.parse("12/01/2019"), "CEO");

        //add staff to ArrayList
        staff.add(worker1);
        staff.add(worker2);
        staff.add(worker3);
        staff.add(worker4);
        staff.add(worker5);
        staff.add(manager1);
        staff.add(manager2);
        staff.add(othersStaff1);
        staff.add(othersStaff2);
        staff.add(othersStaff3);

        System.out.println("Name; Bitrh date; Date of employment; Other information");
        for (int i = 0; i < staff.size(); i++) {
            System.out.println(staff.get(i).getStaffType() + " " + staff.get(i).getFio() + "; " + staff.get(i).getBirthDate() + "; " +
                    staff.get(i).getEmploymentDate() + "; " + staff.get(i).getOtherInfo());

        }
    }
}
