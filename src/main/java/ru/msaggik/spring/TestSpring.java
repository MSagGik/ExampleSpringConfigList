package ru.msaggik.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.msaggik.spring.config.SpringConfig;
import ru.msaggik.spring.music.ClassicalMusic;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.playMusic());

        context.close(); 
    }
}
