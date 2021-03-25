package repositories;

import java.util.ArrayList;
import java.util.List;
import models.Persona;

public class RepositoryPersonas {

    private List<Persona> personas;

    public RepositoryPersonas() {
        this.personas = new ArrayList<>();
        Persona p = new Persona(1, "Sofia", 10, "sofi@gmail.com");
        this.personas.add(p);
        p = new Persona(2, "Lucia", 18, "lucia@gmail.com");
        this.personas.add(p);
        p = new Persona(3, "Luis", 40, "luis@gmail.com");
        this.personas.add(p);
        p = new Persona(4, "Adrian", 20, "adri@gmail.com");
        this.personas.add(p);
        p = new Persona(5, "Alejandro", 40, "alex@gmail.com");
        this.personas.add(p);
    }

    public List<Persona> getPersonas() {
        return this.personas;
    }

    public Persona BuscarPersona(int id) {
        for (Persona p : this.personas) {
            if (p.getIdPersona() == id) {
                return p;
            }
        }
        return null;
    }
}
