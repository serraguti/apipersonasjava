package services;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import models.Persona;
import repositories.RepositoryPersonas;

@Path("/personas")
public class ServicePersonas {

    RepositoryPersonas repo;

    public ServicePersonas() {
        this.repo = new RepositoryPersonas();
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Persona> getPersonas() {
        return this.repo.getPersonas();
    }

    //SI UN METODO TIENE PARAMETROS, DICHOS PARAMETROS
    //DEBEN ESTAR DECLARADOS ENTRE LLAVES {PARAMETRO}
    //EL NOMBRE DE LOS PARAMETROS DEBE SER IGUAL AL
    //NOMBRE DEL PARAMETRO EN EL METODO
    //TODOS LOS PARAMETROS SON STRING, LUEGO LOS CONVERTIMOS
    //DENTRO DEL METODO
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Persona getPersona(@PathParam("id") String id) {
        int idpersona = Integer.parseInt(id);
        return this.repo.BuscarPersona(idpersona);
    }
}
