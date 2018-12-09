package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Miinus extends Calculation {
    private int edellinenarvo;
    public Miinus(TextField tuloskentta, TextField syotekentta, Button miinus, Button undo, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta, miinus, undo, sovellus);

    }

    @Override
    protected void calculate() {
        try {
            edellinenarvo = Integer.parseInt(tuloskentta.getText());
        } catch (Exception e) {}
        int arvo = 0;
        try {
            arvo = Integer.parseInt(syotekentta.getText());
        } catch (Exception e) {}
        sovellus.miinus(arvo);
    }

    @Override
    public void cancel() {
        tuloskentta.setText(Integer.toString(edellinenarvo));
    }
}
