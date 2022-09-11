package ru.practicum.laterwithoutspringboot;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class IdGenerator {
    private long currentId = 0;
    public long generate() {
        return currentId++;
    }
}
