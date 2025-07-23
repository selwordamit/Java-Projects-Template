# ✅ Controller Class – Workflow Checklist

Step-by-step guide for writing a clean REST Controller in Spring Boot.

---

## 🧱 Base Setup

- [ ] Create controller in `controllers/` package
- [ ] Annotate with `@RestController`
- [ ] Add `@RequestMapping("/api/v1/[entity]")`
- [ ] Add `@RequiredArgsConstructor`
- [ ] Add `@Slf4j`

---

## 📋 Method Writing Flow

For each endpoint:

- [ ] Use appropriate annotation: `@PostMapping`, `@GetMapping`, etc.
- [ ] Use `@Valid @RequestBody` for inputs
- [ ] Use `@AuthenticationPrincipal` if user context is needed
- [ ] Log the request start (e.g. `log.info("[ACTION] - STARTED")`)
- [ ] Delegate to Service only — no business logic in controller
- [ ] Return `ResponseEntity.ok(result)` or proper response codes
- [ ] Log success at the end

---

## 🧪 Validation & Security

- [ ] DTOs validated with `@Valid`
- [ ] Sensitive data is never returned
- [ ] Only authorized endpoints exposed (configured in `SecurityConfig`)

---

## 📌 Best Practices

- [ ] Use path variables for resource IDs
- [ ] Use query params for filters/sorting
- [ ] Controller should be thin – keep logic in service
- [ ] Avoid catching exceptions manually – rely on `@RestControllerAdvice`

---

✅ Once all boxes are checked — your controller is ready for production.
