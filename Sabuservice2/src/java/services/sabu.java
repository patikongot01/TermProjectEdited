/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Coviddata;
/**
 *
 * @author Capellix
 */
@WebService(serviceName = "sabu")
public class sabu {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Sabuservice2PU");

    /**
     * This is a sample web service operation
     */

    private void persist(Object object) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findByProvince")
    public Coviddata findByProvince(@WebParam(name = "province") String province) {
        EntityManager em = emf.createEntityManager();
        Coviddata cov = em.find(Coviddata.class, province);
        return cov;
    }
    @WebMethod(operationName = "findByID")
    public Coviddata findByID(@WebParam(name = "id") int id) {
        EntityManager em = emf.createEntityManager();
        Coviddata cov = em.find(Coviddata.class, id);
        return cov;
    }
    
}
