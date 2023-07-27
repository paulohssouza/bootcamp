package dio.bootcamp.paulohenrique.domain;

public class Course extends Content{
    private Integer workload;

    public Course(String title, String description, Integer workload) {
        super(title, description);
        this.workload = workload;
    }

    public Integer getWorkload() {
        return workload;
    }

    public void setWorkload(Integer workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDuração: " + workload + "h\n" +
                "XP: " + this.calculateXp();
    }

    @Override
    public double calculateXp() {
        return xpDefault * this.workload;
    }
}
