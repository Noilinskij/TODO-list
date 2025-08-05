package com.example.model.dto;

public record TaskResponse(
    Long id,
    String title,
    String description,
    boolean completed
) {}
