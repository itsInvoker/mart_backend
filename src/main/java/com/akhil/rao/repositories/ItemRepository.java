package com.akhil.rao.repositories;

import com.akhil.rao.enums.ItemType;
import com.akhil.rao.models.Items;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends MongoRepository<Items, List> {
    public Items findItemsByItemId(int ItemId);
    public List<Items> findItemsByItemType(ItemType itemType);
}
