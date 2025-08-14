package com.example.model.dto;

public record ProjectInfoDto(
        Integer id,
        String name,
        String description,
        String tint,
        Integer leadId
) {}
