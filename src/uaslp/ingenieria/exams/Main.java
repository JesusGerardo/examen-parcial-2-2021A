package uaslp.ingenieria.exams;

import java.io.File;

import uaslp.ingenieria.exams.instruments.*;

public class Main {

    public static void main(String[] args) {
        String fileName = "archivo.music"; //args[0];
        Instrument instrument = Instrument.valueOf("PIANO");

        SongPlayer songPlayer = new SongPlayer();
        Song song = new Song(new File(fileName));

        Instrumento instrumento = InstrumentFactory.getInstrument(instrument);

        songPlayer.play(song,instrumento);
    }
}
