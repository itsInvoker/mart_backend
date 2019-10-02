package com.akhil.rao.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/items")
    public List<Items> getItems() {
        return itemService.getAllItems();
    }

    @RequestMapping("/items/{id}")
    public Items getItem(@PathVariable int id) {
        return itemService.getItemById(id);
    }

    @RequestMapping("/items/fruits")
    public List<Items> getAllFruits() {
        return itemService.getAllFruits();
    }

    @RequestMapping("/items/vegetables")
    public List<Items> getAllVegetables() {
        return itemService.getAllVegetables();
    }

    @RequestMapping("/items/grocery")
    public List<Items> getAllGrocery() {
        return itemService.getAllGrocery();
    }

    @RequestMapping("/items/others")
    public List<Items> getAllOthers() {
        return itemService.getAllOthers();
    }
}
