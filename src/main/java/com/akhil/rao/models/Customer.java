package com.akhil.rao.models;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Customer")
public class Customer {
    @Id
    private ObjectId id;
    private String name;
    @Indexed(unique = true)
    private String username;
    private String password;
    private Date dob;

}