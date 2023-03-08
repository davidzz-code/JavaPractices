package Herencia.Multimedia;

public class Pelicula extends Multimedia{
    private String actorPrincipal;
    private String actrizPrincipal;


    public Pelicula(String titulo, String autor, Formato formato, double duracion, String actorPrincipal,
            String actrizPrincipal) {
        super(titulo, autor, formato, duracion);
        if (actorPrincipal == null && actrizPrincipal == null) {
            System.out.println("Tienes los dos parámetros vacíos");
        }
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    // Setters
    public void setActorPrincipal(String actor) {
        actorPrincipal = actor;
    }

    public void setActrizPrincipal(String actriz) {
        actorPrincipal = actriz;
    }

    // Getters
    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    // Sobreescribe método toString()
    public String toString() {
        return super.toString() +
                "Actor principal: " + actorPrincipal + "\n"
                + "Actriz principal: " + actrizPrincipal;
    }
}   
