package dio.bootcamp.paulohenrique.domain;

import java.time.LocalDate;

public class Mentoring {
    private String title;
    private String description;
    private LocalDate date;

    public Mentoring(String title, String description, LocalDate date) {
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Título: " + this.title + "\n" +
                "Descrição: " + this.description + "\n" +
                "Data: " + this.date;
    }
}
