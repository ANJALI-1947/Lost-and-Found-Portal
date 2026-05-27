package com.example.lostfoundportal.controller;

import com.example.lostfoundportal.entity.Item;
import com.example.lostfoundportal.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    ItemService service;

    // Add Item
    @PostMapping("/add")
    public Item addItem(@RequestBody Item item) {

        return service.addItem(item);
    }

    // Get All Items
    @GetMapping("/all")
    public List<Item> getAllItems() {

        return service.getAllItems();
    }

    // Delete Item
    @DeleteMapping("/delete/{id}")
    public String deleteItem(@PathVariable int id) {

        return service.deleteItem(id);
    }

    // Update Item
    @PutMapping("/update/{id}")
    public Item updateItem(@PathVariable int id,
                           @RequestBody Item item) {

        return service.updateItem(id, item);
    }
}