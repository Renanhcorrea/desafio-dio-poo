
package main.java.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> enrolledContent = new LinkedHashSet<>();
    private Set<Content> completedContent = new LinkedHashSet<>();

    public void InscreverBootcamp (Bootcamp bootcamp){
        this.enrolledContent.addAll(bootcamp.getConteudos());
        bootcamp.getDevStarters().add(this);
    }

    public void progredir() {
        Optional<Content> conteudo = this.enrolledContent.stream().findFirst();
        if(conteudo.isPresent()){
            this.completedContent.add(conteudo.get());
            this.enrolledContent.remove(conteudo.get());
        } else {
            System.err.println("Error");
        }
    }

    public double calcularTotalXp() {
        return this.completedContent
            .stream()
            .mapToDouble(Content::calculateXp) // (Conteudo -> Conteudo.calculateXp())
            .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getenrolledContent() {
        return enrolledContent;
    }

    public void setenrolledContent(Set<Content> enrolledContent) {
        this.enrolledContent = enrolledContent;
    }

    public Set<Content> getcompletedContent() {
        return completedContent;
    }

    public void setcompletedContent(Set<Content> completedContent) {
        this.completedContent = completedContent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, enrolledContent,completedContent);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Dev dev = (Dev) obj;
        return Objects.equals(name, dev.name) && Objects.equals(enrolledContent, dev.enrolledContent) && Objects.equals(enrolledContent, dev.completedContent);
    }

    

}
