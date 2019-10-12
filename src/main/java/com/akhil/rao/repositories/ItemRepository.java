package com.akhil.rao.repositories;

import com.akhil.rao.enums.ItemType;
import com.akhil.rao.models.Items;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Items, List> {
    public Items findItemsByItemId(int ItemId);
    public List<Items> findItemsByItemType(ItemType itemType);
}
