package com.akhil.rao.services;

import com.akhil.rao.enums.ItemType;
import com.akhil.rao.models.Items;
import com.akhil.rao.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
        Items item1 = new Items("Sugar",40.56,ItemType.GROCERY,4,true);
        Items item2 = new Items("Salt",20.56,ItemType.GROCERY,4,true);
        Items item3 = new Items("Orange",60,ItemType.FRUITS,5,true);
        Items item4 = new Items("Cabbage",25.5,ItemType.VEGETABLES,5,true);
        Items item5 = new Items("Mango",50,ItemType.FRUITS,5,true);
        itemRepository.save(item1);
        itemRepository.save(item2);
        itemRepository.save(item3);
        itemRepository.save(item4);
        itemRepository.save(item5);
    }

    public List<Items> getAllItems(){
        List<Items> items = new ArrayList<>();
        itemRepository.findAll().forEach(items::add);
        return items;
    }

    public Items getItemById(int id){
        System.out.println(itemRepository.findItemsByItemId(id));
        return itemRepository.findItemsByItemId(id);
    }

    public List<Items> getAllFruits(){
        return itemRepository.findItemsByItemType(ItemType.FRUITS);
    }

    public List<Items> getAllVegetables(){
        return itemRepository.findItemsByItemType(ItemType.VEGETABLES);
    }

    public List<Items> getAllGrocery(){
        return itemRepository.findItemsByItemType(ItemType.GROCERY);
    }

    public List<Items> getAllOthers(){
        return itemRepository.findItemsByItemType(ItemType.OTHERS);
    }


}
