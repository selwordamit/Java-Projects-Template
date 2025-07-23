package com.example.project.domain.entities;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * JPA Entity representing [EntityName].
 */
@Entity
@Table(name = "[table_name]")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class [EntityName] {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    // Example field
    @Column(nullable = false)
    private String name;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    // Add relationships, enums, or constraints as needed
}
