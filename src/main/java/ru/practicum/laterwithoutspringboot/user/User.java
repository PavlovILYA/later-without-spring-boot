package ru.practicum.laterwithoutspringboot.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.practicum.laterwithoutspringboot.item.Item;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "users")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String email;
    String name;
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    List<Item> items = new ArrayList<>();
}
