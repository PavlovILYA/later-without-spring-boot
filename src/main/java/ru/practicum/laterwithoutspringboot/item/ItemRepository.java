package ru.practicum.laterwithoutspringboot.item;

import java.util.List;

public interface ItemRepository {
    Item save(Item item);
    List<Item> findByUserId(long userId);
    void removeByUserIdAndItemId(long userId, long id);
}
