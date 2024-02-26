package com.example.webflux;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRecord {
    @Id
    private Integer id;
    private String name;
    private String lastName;
}
