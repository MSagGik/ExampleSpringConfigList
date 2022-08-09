package ru.msaggik.spring.config;

import org.springframework.context.annotation.*;
import ru.msaggik.spring.*;
import ru.msaggik.spring.music.ClassicalMusic;
import ru.msaggik.spring.music.RockMusic;
import ru.msaggik.spring.music.TechnoMusic;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    @Scope("prototype")
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }
    @Bean
    public TechnoMusic technoMusic() {
        return new TechnoMusic();
    }

    @Bean
    public List<Music> musicList() {
        // Этот лист неизменяемый (immutable)
        return Arrays.asList(classicalMusic(), rockMusic(), technoMusic());
    }
    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }
    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
