package com.example.model.dto;

public record UpdateProjectRequest (
        String name,
        String description,
        String tint,
        Integer leadId
) {}
