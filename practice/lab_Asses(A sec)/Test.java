import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // Computer c = new Computer("12", "icd", 0, 0, false);
        // Computer c1 = new Computer(null, null, 0, 0, false);
        // Computer cloneC = c.clone();
        // Computer cloneC1 = c1.clone();
        // System.out.println(c.equals(cloneC));
        // System.out.println(c.equals((c1)));
        Employee e = new Employee();
        Lab l = new Lab("one", LabStatus.FAULTY_MULTIMEDIA, e);
        l.addComputer(new Computer("2", "icd", 0, 1, true));

        System.out.println(l.getComputer("2"));
        l.removeComputer("2");
        System.out.println(l.getComputer("2"));
        University u = new University();
        u.addLab(new Lab("1", LabStatus.OPERATIONAL, e));
        Lab l2 = u.getLab("1");
        System.out.println(l2.getLabID());

    }
}
