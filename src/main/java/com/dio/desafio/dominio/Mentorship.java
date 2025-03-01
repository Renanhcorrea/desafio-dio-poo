package main.java.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentorship extends Content {
    private LocalDate date;

    public Mentorship() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mentorship{");
        sb.append("title=").append(getTitle());
        sb.append(", description=").append(getDescription());
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calculateXp() {
        return DEFAULT_XP + 150d;
    }

    

}
