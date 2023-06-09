package com.king.springit.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
@Entity
@Data
@NoArgsConstructor
public class Comment extends Auditable{
    @Id
    @GeneratedValue
    private  Long id;
    private String body;

    //    Link
    @ManyToOne
    private Link link;
}
