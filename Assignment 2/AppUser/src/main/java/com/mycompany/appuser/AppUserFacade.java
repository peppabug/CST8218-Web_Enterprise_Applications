/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.appuser;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Michael
 */
@Stateless
public class AppUserFacade extends AbstractFacade<AppUser> {

    @PersistenceContext(unitName = "prod")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AppUserFacade() {
        super(AppUser.class);
    }
    
}
