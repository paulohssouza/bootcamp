package dio.bootcamp.paulohenrique.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Developer {
    private String name;
    private Double xpDeveloper;
    private Set<Content> inscribed = new LinkedHashSet<>();
    private Set<Content> finalized = new LinkedHashSet<>();

    public Developer(String name, Double xpDeveloper) {
        this.name = name;
        this.xpDeveloper = xpDeveloper;
        this.inscribed = null;
        this.finalized = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getXpDeveloper() {
        return xpDeveloper;
    }

    public void setXpDeveloper(Double xpDeveloper) {
        this.xpDeveloper = xpDeveloper;
    }

    public Set<Content> getInscribed() {
        return inscribed;
    }

    public void setInscribed(Set<Content> inscribed) {
        this.inscribed = inscribed;
    }

    public Set<Content> getFinalized() {
        return finalized;
    }

    public void setFinalized(Set<Content> finalized) {
        this.finalized = finalized;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return Objects.equals(name, developer.name) && Objects.equals(xpDeveloper, developer.xpDeveloper) && Objects.equals(inscribed, developer.inscribed) && Objects.equals(finalized, developer.finalized);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, xpDeveloper, inscribed, finalized);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", xpDeveloper=" + xpDeveloper +
                ", inscribed=" + inscribed +
                ", finalized=" + finalized +
                '}';
    }

    public void registerBootcamp(Bootcamp bootcamp) {}
    public void progress() {}
    public void calculateTotalXp() {}
}
