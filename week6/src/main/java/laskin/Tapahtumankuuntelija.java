package laskin;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.HashMap;
import java.util.Map;

public class Tapahtumankuuntelija implements EventHandler {
    private Button undo;
    private Sovelluslogiikka sovellus;

    private Map<Button, Command> komennot;
    private Command edellinen = null;

    public Tapahtumankuuntelija(TextField tuloskentta, TextField syotekentta, Button plus, Button miinus, Button nollaa, Button undo) {
        this.undo = undo;
        this.sovellus = new Sovelluslogiikka();
        komennot = new HashMap<>();
        komennot.put(plus, new Summaa(tuloskentta, syotekentta, plus, undo, sovellus) );
        komennot.put(miinus, new Miinus(tuloskentta, syotekentta, miinus, undo, sovellus) );
        komennot.put(nollaa, new Nollaa(tuloskentta, syotekentta, nollaa, undo,  sovellus) );
    }
    
    @Override
    public void handle(Event event) {
        if ( event.getTarget() != undo ) {
            Command command = komennot.get((Button)event.getTarget());
            command.run();
            edellinen = command;
        } else {
            edellinen.cancel();
            edellinen = null;
        }
    }

}
