package dio.bootcamp.paulohenrique.domain;

import java.time.LocalDate;

public class Mentoring extends Content{
    private LocalDate date;

    public Mentoring(String title, String description, LocalDate date) {
        super(title, description);
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return super.toString() + "\nData: " + this.date +
                "\nXP: " + this.calculateXp();
    }

    @Override
    public double calculateXp() {
        return xpDefault + 20d;
    }
}
