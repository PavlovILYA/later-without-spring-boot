package ru.practicum.laterwithoutspringboot.item;

import java.util.List;

public interface ItemService {
    List<Item> getAllItems(long userId);
    Item saveItem(Long userId, ItemCreateDto itemCreateDto);
    Item getItemById(long userId, long itemId);
    void removeItem(long userId, long id);
}
