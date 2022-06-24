package ru.learnup.ShopBook.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.learnup.ShopBook.entity.Buyer;

@Repository
public interface BuyerRepository extends CrudRepository<Buyer, Integer> {
}
