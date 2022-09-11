package ru.practicum.laterwithoutspringboot.item;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.practicum.laterwithoutspringboot.user.User;

import java.util.List;
import java.util.Optional;

public interface ItemRepository extends JpaRepository<Item, Long>, CheckUrlItemRepository {
    List<Item> findAllByUser(User user);
    Optional<Item> findByIdAndUser(Long itemId, User user);
}
