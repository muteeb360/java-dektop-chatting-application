/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.websocket.ClientEndpoint;
import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.WebSocketContainer;

/**
 *
 * @author jhonr
 */
public class HomeBackend {
    HomeBackend(){
        try {
            WebSocketContainer container = ContainerProvider.getWebSocketContainer();
            try {
                javax.websocket.Session session = container.connectToServer(ClientEndpoint.class, new URI("ws://localhost:8080/chat"));
            } catch (URISyntaxException ex) {
                Logger.getLogger(HomeBackend.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (DeploymentException ex) {
            Logger.getLogger(HomeBackend.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HomeBackend.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//    public static void main(String[] args) throws URISyntaxException, DeploymentException, IOException{
//        HomeBackend h = new HomeBackend();
//    }
}
