package com.example.model.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PostTask(
        @NotBlank(message = "Введи загловок")
        String title,
        @NotBlank(message = "Введи описание")
        String description,
        @NotNull(message = "Введи статус")
        Boolean completed

) {}
