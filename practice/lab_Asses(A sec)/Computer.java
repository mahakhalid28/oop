
public class Computer {
    private String computerNumber;
    private String icdModel;
    private int ramSize;
    private int hddSize;
    private boolean hasGpu;

    public Computer() {

    }

    public Computer(String computerNumber, String icdModel, int ramSize, int hddSize, boolean hasGpu) {
        this.computerNumber = computerNumber;
        this.icdModel = icdModel;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.hasGpu = hasGpu;

    }

    public boolean equals(Computer comp) {
        return this.computerNumber == comp.computerNumber;
    }

    public Computer clone() {
        return new Computer(this.computerNumber, this.icdModel, this.ramSize, this.hddSize, this.hasGpu);
    }

    /**
     * @return String return the computerNumber
     */
    public String getComputerNumber() {
        return computerNumber;
    }

    /**
     * @param computerNumber the computerNumber to set
     */
    public void setComputerNumber(String computerNumber) {
        this.computerNumber = computerNumber;
    }

    /**
     * @return String return the icdModel
     */
    public String getIcdModel() {
        return icdModel;
    }

    /**
     * @param icdModel the icdModel to set
     */
    public void setIcdModel(String icdModel) {
        this.icdModel = icdModel;
    }

    /**
     * @return int return the ramSize
     */
    public int getRamSize() {
        return ramSize;
    }

    /**
     * @param ramSize the ramSize to set
     */
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    /**
     * @return int return the hddSize
     */
    public int getHddSize() {
        return hddSize;
    }

    /**
     * @param hddSize the hddSize to set
     */
    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    /**
     * @return boolean return the hasGpu
     */
    public boolean isHasGpu() {
        return hasGpu;
    }

    /**
     * @param hasGpu the hasGpu to set
     */
    public void setHasGpu(boolean hasGpu) {
        this.hasGpu = hasGpu;
    }

    @Override
    public String toString() {
        return "{" +
                " computerNumber='" + getComputerNumber() + "'" +
                ", icdModel='" + getIcdModel() + "'" +
                ", ramSize='" + getRamSize() + "'" +
                ", hddSize='" + getHddSize() + "'" +
                ", hasGpu='" + isHasGpu() + "'" +
                "}";
    }

}
