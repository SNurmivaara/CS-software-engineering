package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Summaa extends Calculation {
        private int edellinenarvo;

        public Summaa(TextField tuloskentta, TextField syotekentta, Button plussaa, Button undo, Sovelluslogiikka sovellus) {
            super(tuloskentta, syotekentta, plussaa, undo, sovellus);
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
            sovellus.plus(arvo);
        }

        @Override
        public void cancel() {
            tuloskentta.setText(Integer.toString(edellinenarvo));
        }
    }

