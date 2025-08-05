package com.example.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UpdateTask (
    String title,
    String description,
    Boolean completed
) {}
