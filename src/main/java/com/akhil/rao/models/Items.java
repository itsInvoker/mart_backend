package com.akhil.rao.models;

import com.akhil.rao.enums.ItemType;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Items")
public class Items {

    @Id
    private ObjectId itemId;
    private String itemName;
    private double itemPrice;
    private ItemType itemType;
    private int itemDiscountPercent;
    private boolean itemInStock;

}
