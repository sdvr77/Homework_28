package ru.learnup.ShopBook.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.learnup.ShopBook.entity.Buy;

@Repository
public interface BuyRepository extends CrudRepository<Buy, Integer> {
}
