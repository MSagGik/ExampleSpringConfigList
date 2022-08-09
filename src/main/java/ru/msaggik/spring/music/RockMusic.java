package ru.msaggik.spring.music;

import ru.msaggik.spring.Music;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Earthlings Grass near the house";
    }
}
