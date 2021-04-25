package uaslp.ingenieria.exams;

import uaslp.ingenieria.exams.instruments.*;

public class InstrumentFactory {

    public static Instrumento getInstrument(Instrument instrument){

        return switch (instrument) {
            case PIANO -> new Piano();
            case VIOLIN -> new Violin();
            case GUITARRA -> new Guitarra();
            case FLAUTA -> new Flauta();
        };
    }
}
