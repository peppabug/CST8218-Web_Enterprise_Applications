/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst8218.turn0245.service;

import java.util.Set;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.security.enterprise.authentication.mechanism.http.BasicAuthenticationMechanismDefinition;
import javax.security.enterprise.authentication.mechanism.http.FormAuthenticationMechanismDefinition;
import javax.security.enterprise.authentication.mechanism.http.LoginToContinue;
import javax.security.enterprise.identitystore.DatabaseIdentityStoreDefinition;
import javax.security.enterprise.identitystore.PasswordHash;
import javax.ws.rs.core.Application;

/**
 *
 * @author Michael
 */
@DatabaseIdentityStoreDefinition (
    dataSourceLookup = "${'java:comp/DefaultDataSource'}",
    callerQuery = "#{'select password from app.appuser where userid = ?'}",
    groupsQuery = "select groupname from app.appuser where userid = ?",
    hashAlgorithm = PasswordHash.class,
    priority = 10
)
@BasicAuthenticationMechanismDefinition
//@FormAuthenticationMechanismDefinition (
//loginToContinue = @LoginToContinue (
//    loginPage = "/index.html",
//    errorPage = "/index.html"))
@ApplicationScoped
@Named
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(cst8218.turn0245.service.SpriteFacadeREST.class);
    }
}
