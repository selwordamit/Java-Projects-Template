# ✅ Service Class – Workflow Checklist

Step-by-step guide for writing a professional Spring Boot `@Service` class.

---

## 🧱 Base Setup

- [ ] Create `Service` interface in `service/`
- [ ] Create `ServiceImpl` in `service/impl/`
- [ ] Annotate with `@Service`, `@Slf4j`, `@RequiredArgsConstructor`
- [ ] Add `@Transactional` if DB operations involved

---

## 📥 Dependencies

- [ ] Inject all required `repositories`
- [ ] Inject `mappers`, `helper services`, etc.

---

## 📋 Method Writing Flow

For each method:

- [ ] Write clear method signature in the interface
- [ ] Add Javadoc above method (what it does, params, return)
- [ ] Add `log.info("[ACTION] - [context] - STARTED")`
- [ ] Validate input or fetch required entities with `.findById().orElseThrow()`
- [ ] Log warning/error before throwing any exception
- [ ] Apply business logic
- [ ] Save/update/delete entities if needed
- [ ] Convert entity to DTO with mapper
- [ ] Log success `log.info("[ACTION] - [context] - SUCCESS")`
- [ ] Return final DTO

---

## ✅ Validation

- [ ] Use `@Valid` in controller layer (not in service)
- [ ] Use DTOs as method parameters (not entity)

---

## 📌 Best Practices

- [ ] Keep methods short and focused
- [ ] Extract helper logic to private methods if needed
- [ ] Do **not** call controller logic from service
- [ ] Do **not** log sensitive information (e.g., passwords)
- [ ] Never catch generic `Exception` unless necessary

---

✅ Once all steps checked — your service is production-grade.
