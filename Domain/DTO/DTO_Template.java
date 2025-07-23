package com.example.project.domain.dtos;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.validation.constraints.*;
import java.time.LocalDateTime;

/**
 * Example request and response DTOs for [EntityName].
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class [EntityName]Request {

    @NotNull
    private String field1;

    @Min(1)
    private int field2;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime timestamp;
}


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class [EntityName]Response {

    private String field1;
    private int field2;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime timestamp;
}
