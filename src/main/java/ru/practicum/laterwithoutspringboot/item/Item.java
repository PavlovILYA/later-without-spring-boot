package ru.practicum.laterwithoutspringboot.item;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "items")
public class Item {
    @Id
    private long id;
    @Column(name = "user_id")
    private long userId;
    private String url;
}
