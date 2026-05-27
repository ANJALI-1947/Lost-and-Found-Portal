package com.example.lostfoundportal.repository;

import com.example.lostfoundportal.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}