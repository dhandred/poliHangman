
package javafxjuegohangman;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

public class FXMLDocumentController implements Initializable {
    
    //Paneles 
    @FXML
    private AnchorPane Menu;
    @FXML
    private AnchorPane ModoUnJugador;
    @FXML
    private AnchorPane Deportes;
    @FXML
    private AnchorPane Aviso;
    @FXML 
    private AnchorPane Idiomas1;
    @FXML
    private AnchorPane Aviso2;
    @FXML
    private AnchorPane Instrucciones;
    @FXML
    private AnchorPane MultijugadorMenu;
    @FXML
    private AnchorPane DeportesMultipayer1;
    @FXML
    private AnchorPane AtencionMultijugador;
    @FXML
    private AnchorPane AvisoDeportesMenu;
    @FXML
    private AnchorPane IdiomasMultiPlayer1;
    @FXML
    private AnchorPane AtencionMultiIdioma;
    @FXML 
    private AnchorPane AvisoIdiomaMenu;
    
    //Boton de salir
    
    @FXML
    private void ButtonExit(ActionEvent e)
    {
        System.exit(0);
    }
    
    //Boton para ir al modo de juego de Un Jugador
    
    @FXML
    private void ModoDeJuegoOnePlayer (ActionEvent e)
    {
        ModoUnJugador.setVisible(true);
        Menu.setVisible(false);
    }
    
    //Boton para ir a las instrucciones
    
    @FXML
    private void InstruccionesM (ActionEvent e)
    {
        Menu.setVisible(false);
        Instrucciones.setVisible(true);
    }
    
    //Boton para ir al modo de juego de dos jugadores 
    
    @FXML
    private void ModoDeJuegoMultiplayer (ActionEvent e)
    {
        Menu.setVisible(false);
        MultijugadorMenu.setVisible(true);
    }
    
    //Boton para ir al modo de juego deportes de Dos jugadores 
    
    @FXML
    private void ModoDeJuegoDeportesMultiplayer (ActionEvent e)
    {
        MultijugadorMenu.setVisible(false);
        DeportesMultipayer1.setVisible(true);
        AtencionMultijugador.setVisible(true);
    }
    
    //Boton para ir al modo de juego idiomas de dos jugadores
    @FXML
    private void ModoDeJuegoIdiomaMultiplayer (ActionEvent e)
    {
        MultijugadorMenu.setVisible(false);
        IdiomasMultiPlayer1.setVisible(true);
        AtencionMultiIdioma.setVisible(true);
    }
    
    @FXML
    private void cerrarAvisoMultplayer (ActionEvent e)
    {
        AtencionMultijugador.setVisible(false);
        AtencionMultiIdioma.setVisible(false);
    }
    
    //Boton volver al Menu
    
    @FXML
    private void VolverMenu (ActionEvent e)
    {
        ModoUnJugador.setVisible(false);
        Menu.setVisible(true);
    }
    
    @FXML
    private void VolverMenu2 (ActionEvent e)
    {
        MultijugadorMenu.setVisible(false);
        Menu.setVisible(true);
    }
    
    @FXML
    private void aviso (ActionEvent e)
    {
        Deportes.setVisible(true);
        Aviso.setVisible(true);
    }
    
    @FXML
    private void siMenu(ActionEvent e)
    {
        Deportes.setVisible(false);
        Aviso.setVisible(false);
        Menu.setVisible(true);
    }
    
    @FXML 
    private void NoSigue(ActionEvent e)
    {
        Aviso.setVisible(false);
    }
    
    @FXML
    private void aviso2(ActionEvent e)
    {
        Aviso2.setVisible(true);
    }
    
    @FXML
    private void SiSigue2(ActionEvent e)
    {
        Idiomas1.setVisible(false);
        Aviso2.setVisible(false);
        Menu.setVisible(true);
    }
    
    @FXML
    private void NoSigue2(ActionEvent e)
    {
        Aviso2.setVisible(false);
    }
    
    @FXML
    private void IralIdiomasMenu(ActionEvent e)
    {
        AvisoIdiomaMenu.setVisible(true);
    }
    
    @FXML
    private void SiSigue3(ActionEvent e)
    {
        Menu.setVisible(true);
        AvisoIdiomaMenu.setVisible(false);
        IdiomasMultiPlayer1.setVisible(false);
    }
    
    @FXML
    private void NoSigue3(ActionEvent e)
    {
        AvisoIdiomaMenu.setVisible(false);
    }
    
    @FXML
    private void irMenuInstrucciones(ActionEvent e)
    {
        Instrucciones.setVisible(false);
        Menu.setVisible(true);
    }
    
    @FXML
    private void VolverMenuDeportesMulti (ActionEvent e)
    {
        AvisoDeportesMenu.setVisible(true);
    }
    
    @FXML
    private void SiDeportesMenu(ActionEvent e)
    {
        AvisoDeportesMenu.setVisible(false);
        DeportesMultipayer1.setVisible(false);
        Menu.setVisible(true);
    }
    
    @FXML
    private void NoDeportesMenu(ActionEvent e)
    {
        AvisoDeportesMenu.setVisible(false);
    }
            
    
    // Ir al modo deporte
    @FXML
    private void irDeporteJugar(ActionEvent e)
    {
      ModoUnJugador.setVisible(false);
      Deportes.setVisible(true);
    }
    
    //ir al modo Idioma
    @FXML
    private void IrIdiomasJugar(ActionEvent e)
    {
        ModoUnJugador.setVisible(false);
        Idiomas1.setVisible(true);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
}
