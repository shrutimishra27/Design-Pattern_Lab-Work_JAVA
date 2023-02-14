package com.Abstract_MusicFactory;

public abstract class AbstractFactory{
    public abstract Chord getStringInstrument(String chordType);

    public abstract Key getKeyboardInstrument(String keyType);
    
    public abstract Head getPercussionInstrument(String headType);
}