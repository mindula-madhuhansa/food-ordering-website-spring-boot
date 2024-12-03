package com.kdmmc.dto;

import lombok.Data;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;


@Data
@Embeddable
public class RestaurantDto {

    private String title;

    @Column(length = 1000)
    private List<String> images;

    private String description;

    private Long id;
}
