package com.akhil.rao.items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Items> getAllItems(){
        List<Items> items = new ArrayList<>();
        itemRepository.findAll().forEach(items::add);
        return items;
    }
}
