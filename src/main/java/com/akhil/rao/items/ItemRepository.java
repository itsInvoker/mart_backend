package com.akhil.rao.items;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemRepository extends CrudRepository<Items, List> {
    public Items findItemsByItemId(int ItemId);
    public List<Items> findItemsByItemType(ItemType itemType);
}
