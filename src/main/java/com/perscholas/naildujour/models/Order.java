package com.perscholas.naildujour.models;



import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@Getter
@Setter
@Slf4j
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "NAIL_ORDER")
@Entity

public class Order {

    @NonNull
    @Id  @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @NonNull
    String email;

    @NonNull
    String beverage;





    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinTable(name = "order_polishes",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "polish_id"))
    private Set<Polish> polishes = new LinkedHashSet<>();

}