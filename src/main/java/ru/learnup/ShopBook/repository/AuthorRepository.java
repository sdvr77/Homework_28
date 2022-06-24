package ru.learnup.ShopBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.learnup.ShopBook.entity.Author;


@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
