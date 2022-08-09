package ru.msaggik.spring.music;

import ru.msaggik.spring.Music;

public class TechnoMusic implements Music {
    @Override
    public String getSong() {
        return "Daft Punk Outlands";
    }
}