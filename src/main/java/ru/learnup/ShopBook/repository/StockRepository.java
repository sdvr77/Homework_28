package ru.learnup.ShopBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.learnup.ShopBook.entity.Stock;

import java.util.List;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {

    List<Stock> findAllByBookNameContains(String name);
    List<Stock> findAllByBookPrice(int price);
}
