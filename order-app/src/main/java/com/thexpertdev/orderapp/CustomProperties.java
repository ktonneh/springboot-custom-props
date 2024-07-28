package com.thexpertdev.orderapp;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;


@ConfigurationProperties(prefix = "order")
@Validated
@Data
public class CustomProperties {

    @NotBlank(message = "Sender mail cannot be blank")
    private String emailFrom;

    @Min(100)
    private Integer minOrderAmount;
}
