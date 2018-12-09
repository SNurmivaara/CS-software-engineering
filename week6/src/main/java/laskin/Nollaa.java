package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Nollaa extends Calculation {
    private int edellinenarvo;
    public Nollaa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta, nollaa, undo, sovellus);

    }

    @Override
    protected void calculate() {
        try {
            edellinenarvo = Integer.parseInt(tuloskentta.getText());
        } catch (Exception e) {}
        sovellus.nollaa();
    }

    @Override
    public void cancel() {
        tuloskentta.setText(Integer.toString(edellinenarvo));
    }
}
