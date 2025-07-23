package com.example.project.controllers;

import com.example.project.domain.dtos.*;
import com.example.project.service.[EntityName]Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

/**
 * REST Controller for managing [EntityName] resources.
 */
@RestController
@RequestMapping("/api/v1/[entityName]")
@RequiredArgsConstructor
@Slf4j
public class [EntityName]Controller {

    private final [EntityName]Service [entityName]Service;

    @PostMapping
    public ResponseEntity<[EntityName]Response> create(
            @Valid @RequestBody [EntityName]Request request,
            @AuthenticationPrincipal UserDetailsImpl user) {

        log.info("[{}] - CREATE - STARTED", user.getUsername());
        [EntityName]Response response = [entityName]Service.create(request, user.getId());
        return ResponseEntity.ok(response);
    }

    // Add other endpoints (GET, PUT, DELETE) here as needed
}
