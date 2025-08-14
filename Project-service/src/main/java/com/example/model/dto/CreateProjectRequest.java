package com.example.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record CreateProjectRequest(
        @NotBlank(message = "введи имя проекта")
        String name,
        String description,
        @Pattern(regexp = "^#(?:[0-9a-fA-F]{3}){1,2}$", message = "Неверный цвет")
        String tint,
        Integer workSpaceId,
        @NotBlank(message = "введи ID лидера")
        Integer leadId
) {}
