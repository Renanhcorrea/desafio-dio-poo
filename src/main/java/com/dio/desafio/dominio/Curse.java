package main.java.com.dio.desafio.dominio;

public class Curse extends Content{

    private int workLoad;

    public Curse() {
    }

    public int getWorkLoad() {
        return workLoad;
    }

    public void setWorkLoad(int workLoad) {
        this.workLoad = workLoad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("title=").append(getTitle());
        sb.append(", description=").append(getDescription());
        sb.append(", workLoad=").append(workLoad);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calculateXp() {
        return DEFAULT_XP * workLoad;
    }


}
