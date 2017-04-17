/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import controllers.ProduitFacadeLocal;
import entities.Produit;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author lemec
 */
@Stateless
public class GestionProduits implements GestionProduitsLocal {

    @EJB
    private ProduitFacadeLocal produitFacade;
    
    @Override
     public List<Produit> afficherVitrine() {
       return produitFacade.findAll();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
