package ru.learnup.ShopBook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.learnup.ShopBook.entity.Stock;
import ru.learnup.ShopBook.service.BookStockService;

import java.util.List;

@Controller
public class BookStoreController {
    private final BookStockService service;

    public BookStoreController(BookStockService service) {
        this.service = service;
    }

    @RequestMapping("/books")
    public String getBooks(
            @RequestParam(name = "name", required = false) String name,
            @RequestParam(name = "price", required = false) Integer price,
            Model model
    ) {
        List<Stock> books = service.getBookByNameOrPrice(name, price);
        model.addAttribute("books", books);
        return "Books";
    }
}
