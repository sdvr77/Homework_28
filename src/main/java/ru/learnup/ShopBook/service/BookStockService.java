package ru.learnup.ShopBook.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.learnup.ShopBook.entity.Stock;
import ru.learnup.ShopBook.repository.StockRepository;

import java.util.List;

@Service
public class BookStockService {
    private final StockRepository repository;

    public BookStockService(StockRepository repository) {
        this.repository = repository;
    }

    public List<Stock> getBooks() {
        return repository.findAll();
    }

    public Stock findById(int id) {
        return repository.getById(id);
    }

    @Transactional
    public void save(Stock stock) {
        repository.save(stock);
    }

    public List<Stock> getBookByNameOrPrice(String name, Integer price) {

        if (name != null) {
            return repository.findAllByBookNameContains(name);
        }
        if (price != null) {
            int price1 = price;
            return repository.findAllByBookPrice(price1);
        } else {
            return repository.findAll();
        }
    }
}
