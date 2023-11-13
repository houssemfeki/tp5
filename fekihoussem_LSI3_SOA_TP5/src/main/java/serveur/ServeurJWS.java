package serveur;


import jakarta.xml.ws.Endpoint;
import service.BanqueService;

import java.util.logging.ConsoleHandler;

public class ServeurJWS {
    public static void main(String[] args) {
        // L'instance du service bancaire

        Endpoint.publish("http://localhost:8084/", new BanqueService());
        System.out.println("Server url: http://localhost:8084/ " );
    }
}