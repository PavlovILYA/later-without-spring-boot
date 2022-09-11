package ru.practicum.laterwithoutspringboot.user;

import lombok.Data;

@Data
public class User {
    Long id;
    String email;
    String name;
}
