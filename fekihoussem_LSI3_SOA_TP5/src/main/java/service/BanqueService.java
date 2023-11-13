package service;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// L'annotation @WebService
@WebService
public class BanqueService {
    //L'annoation @WebMethod
    @WebMethod
    public double conversion(@WebParam double montant) {
        return montant * 3.3;
    }


    //Les annotation @WebMethod
    @WebMethod
    public List<Compte> getComptes() {
        ArrayList<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte("1", 400, new Date()));
        comptes.add(new Compte("2", 400, new Date()));
        comptes.add(new Compte("3", 400, new Date()));


        return comptes;
    }
}