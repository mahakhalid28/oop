import java.util.ArrayList;

public class Lab {
    private String labID;
    ArrayList<Computer> computers = new ArrayList<Computer>();
    private LabStatus status;

    private Employee labAttendent;

    public Lab(String labID, LabStatus status, Employee labAttendent) {
        this.labID = labID;
        this.status = status;
        this.labAttendent = labAttendent;

    }

    public void addComputer(Computer comp) {
        computers.add(comp);
    }

    public Computer getComputer(String computerNumber) {
        for (Computer c : computers) {
            if (c.getComputerNumber().equals(computerNumber)) {
                return c;
            }

        }
        return null;

    }

    public boolean removeComputer(String computerNumber) {
        Computer computerToRemove = getComputer(computerNumber);
        if (computerToRemove != null) {
            computers.remove(computerToRemove);
            return true;
        } else {
            return false;
        }

    }

    public LabStatus getStatus() {
        return this.status;
    }

    public void setStatus(LabStatus status) {
        this.status = status;
    }

    /**
     * @return String return the labID
     */
    public String getLabID() {
        return labID;
    }

    /**
     * @param labID the labID to set
     */
    public void setLabID(String labID) {
        this.labID = labID;
    }

    /**
     * @return Employee return the labAttendent
     */
    public Employee getLabAttendent() {
        return labAttendent;
    }

    /**
     * @param labAttendent the labAttendent to set
     */
    public void setLabAttendent(Employee labAttendent) {
        this.labAttendent = labAttendent;
    }

}
