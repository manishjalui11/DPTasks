package net.media.training.designpattern.abstractfactory;

public interface PhoneFactory {
    MotherBoard buildMotherBoard();
    Screen buildScreen();
    public Case buildCase(MotherBoard motherBoard,Screen screen);
}