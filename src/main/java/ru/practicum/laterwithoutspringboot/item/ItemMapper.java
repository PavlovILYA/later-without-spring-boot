package ru.practicum.laterwithoutspringboot.item;

import ru.practicum.laterwithoutspringboot.user.User;

public class ItemMapper {
    public static Item toItem(ItemCreateDto itemCreateDto, User user) {
        return new Item(null, user, itemCreateDto.getUrl());
    }
}
