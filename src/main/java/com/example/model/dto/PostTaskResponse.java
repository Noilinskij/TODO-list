package com.example.model.dto;

public record PostTaskResponse (
    Long id,
    String title,
    String description,
    boolean completed
) {}
