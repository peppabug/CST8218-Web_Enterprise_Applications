/*
 * 040863378
 */
package cst8218.turn0245.business;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Michael
 */
@Stateless
public class WidgetTurnFacade extends AbstractFacade<WidgetTurn> {

    @PersistenceContext(unitName = "prod")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public WidgetTurnFacade() {
        super(WidgetTurn.class);
    }
    
}
