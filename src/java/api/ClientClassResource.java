/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import com.google.gson.Gson;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.QueryParam;
import serverpojo.listaCliente;
import Source.Clientes;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Nicol
 */
@Path("clientClass")
public class ClientClassResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ClientClassResource
     */
    public ClientClassResource() {
    }

    /**
     * Retrieves representation of an instance of api.ClientClassResource
     * @param name
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
        public String getJson(@QueryParam("name") String name) {

            int id=1684;
            
           Clientes.clientList.add(new listaCliente("David","Salas",id++));
           Clientes.clientList.add(new listaCliente("Pablo","Marin",id++));
           Clientes.clientList.add(new listaCliente("Elizabeth","Canon",id++));
           Clientes.clientList.add(new listaCliente("Fabian","Goyenaga",id++));
        for(listaCliente i : Source.Clientes.clientList)
        {
            if(name.equalsIgnoreCase(i.getNombre()))
            {
                return new Gson().toJson(i);
            }
        }
        
        return null;
    }
    

    /**
     * PUT method for updating or creating an instance of ClientClassResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @POST
    @Consumes("application/json")
    public String postJson(String content) {
        listaCliente client = new Gson().fromJson(content,listaCliente.class);
        Source.Clientes.clientList.add(client);
        return new Gson().toJson(client);
    }

}
