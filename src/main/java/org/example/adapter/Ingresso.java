package org.example.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Ingresso {
    private String owner;
    private String movie;
    private int chairNumber;
}
