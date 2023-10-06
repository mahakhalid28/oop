import java.util.ArrayList;

public class University {
    ArrayList<Lab> labs = new ArrayList<Lab>() {

    };

    public void addLab(Lab l) {
        labs.add(l);

    }

    public Lab getLab(String labID) {
        for (Lab l : labs) {
            if (l.getLabID().equals(labID)) {
                return l;
            }
        }
        return null;
    }

    public boolean removeLab(String labID) {
        Lab labToRemove = getLab(labID);
        if (labToRemove != null) {
            labs.remove(labToRemove);
            return true;
        }
        return false;

    }
}
