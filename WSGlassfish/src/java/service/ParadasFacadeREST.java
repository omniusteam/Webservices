/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entitys.Paradas;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Frost
 */
@Stateless
@Path("/paradas/")
public class ParadasFacadeREST extends AbstractFacade<Paradas> {

    @PersistenceContext(unitName = "WSGlassfishPU")
    private EntityManager em;

    public ParadasFacadeREST() {
        super(Paradas.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_JSON+";charset=utf-8"})
    public void create(Paradas entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_JSON+";charset=utf-8"})
    public void edit(@PathParam("id") Integer id, Paradas entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON+";charset=utf-8"})
    public Paradas find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_JSON+";charset=utf-8"})
    public List<Paradas> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_JSON+";charset=utf-8"})
    public List<Paradas> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }
    
    @GET
    @Path("/ByIdruta/{id}")
    @Produces({MediaType.APPLICATION_JSON+";charset=utf-8"})
    public List<Paradas> findByIdruta(@PathParam("id") Integer id) {
        return super.findAll();
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
