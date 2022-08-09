package ru.msaggik.spring.music;

import ru.msaggik.spring.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return "I.S. Bach Musette in D major";
    }
}
