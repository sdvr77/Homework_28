package ru.learnup.ShopBook.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.learnup.ShopBook.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
}
