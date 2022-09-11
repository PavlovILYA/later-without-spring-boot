package ru.practicum.laterwithoutspringboot.item;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @GetMapping
    public List<Item> getAllItems(@RequestHeader("X-Later-User-Id") Long userId) {
        return itemService.getAllItems(userId);
    }

    @PostMapping
    public Item saveItem(@RequestHeader("X-Later-User-Id") Long userId,
                         @RequestBody ItemCreateDto itemCreateDto) {
        return itemService.saveItem(userId, itemCreateDto);
    }

    @DeleteMapping("/{itemId}")
    public void removeItem(@RequestHeader("X-Later-User-Id") Long userId,
                           @PathVariable("itemId") Long id) {
        itemService.removeItem(userId, id);
    }

    @GetMapping("/{itemId}")
    public Item getItemById(@RequestHeader("X-Later-User-Id") Long userId,
                            @PathVariable("itemId") Long itemId) {
        return itemService.getItemById(userId, itemId);
    }
}
