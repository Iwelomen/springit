package com.king.springit.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
public class Link {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;

//    comments
    @OneToMany(mappedBy = "link")
    private List<Comment> comments = new ArrayList<>();
}
