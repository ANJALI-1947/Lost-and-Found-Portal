package com.example.lostfoundportal.service;

import com.example.lostfoundportal.entity.Item;
import com.example.lostfoundportal.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository repository;

    // Add Item
    public Item addItem(Item item) {
        return repository.save(item);
    }

    // Get All Items
    public List<Item> getAllItems() {
        return repository.findAll();
    }

    // Delete Item
    public String deleteItem(int id) {

        repository.deleteById(id);

        return "Item Deleted Successfully";
    }

    // Update Item
    public Item updateItem(int id, Item item) {

        Item existingItem =
                repository.findById(id).orElse(null);

        if(existingItem != null) {

            existingItem.setItemName(item.getItemName());
            existingItem.setDescription(item.getDescription());
            existingItem.setLocation(item.getLocation());
            existingItem.setContact(item.getContact());
            existingItem.setStatus(item.getStatus());

            return repository.save(existingItem);
        }

        return null;
    }
}