package dio.bootcamp.paulohenrique.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp extends Content{
    private LocalDate startDate;
    private LocalDate finalDate;
    private Set<Developer> registeredDevelopers = new HashSet<>();
    private Set<Content> contentsBootcamp = new LinkedHashSet<>();

    public Bootcamp(String title, String description) {
        super(title, description);
        this.startDate = LocalDate.now();
        this.finalDate = startDate.plusDays(45);
        registeredDevelopers = null;
        contentsBootcamp = null;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(LocalDate finalDate) {
        this.finalDate = finalDate;
    }

    public Set<Developer> getRegisteredDevelopers() {
        return registeredDevelopers;
    }

    public void setRegisteredDevelopers(Set<Developer> registeredDevelopers) {
        this.registeredDevelopers = registeredDevelopers;
    }

    public Set<Content> getContentsBootcamp() {
        return contentsBootcamp;
    }

    public void setContentsBootcamp(Set<Content> contentsBootcamp) {
        this.contentsBootcamp = contentsBootcamp;
    }

    @Override
    public String toString() {
        return "Bootcamp{\n" + super.toString() +
                "\nstartDate=" + startDate +
                "\nfinalDate=" + finalDate +
                "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(startDate, bootcamp.startDate) && Objects.equals(finalDate, bootcamp.finalDate) && Objects.equals(registeredDevelopers, bootcamp.registeredDevelopers) && Objects.equals(contentsBootcamp, bootcamp.contentsBootcamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startDate, finalDate, registeredDevelopers, contentsBootcamp);
    }

    @Override
    public double calculateXp() {
        return 0;
    }
}
