package org.example.builder;

import java.time.LocalDate;
import lombok.*;

@Data
@Builder
public class Book {
    private String name;
    private String authorName;
    private LocalDate releaseDate;
    private String publisherName;
    private double price;
    private int views;
}
