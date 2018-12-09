package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public abstract class Calculation implements Command {
    protected TextField tuloskentta;
    protected TextField syotekentta;
    protected Button operaatio;
    protected Button undo;
    protected Sovelluslogiikka sovellus;
    protected int edellinenArvo;

    public Calculation(TextField tuloskentta, TextField syotekentta, Button operaatio, Button undo, Sovelluslogiikka sovellus) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.operaatio = operaatio;
        this.undo = undo;
        this.sovellus = new Sovelluslogiikka();
    }

    @Override
    public void run() {
    }

    @Override
    public void cancel() {
        tuloskentta.setText(Integer.toString(edellinenArvo));
    }

    protected abstract void calculate();
}


