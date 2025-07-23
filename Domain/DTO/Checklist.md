# ✅ DTO Classes – Workflow Checklist

Step-by-step guide to designing clean and useful DTOs (Data Transfer Objects) in Spring Boot.

---

## 🧱 Base Setup

- [ ] Create DTOs in `domain.dtos/` package
- [ ] Split into:
  - [ ] `Create[Entity]Request`
  - [ ] `Update[Entity]Request` (if needed)
  - [ ] `[Entity]Response`

---

## 📋 Field Design

- [ ] Match fields to entity 1:1 where possible
- [ ] Use Java types like `LocalDateTime` (not `String` for dates)
- [ ] Avoid using entity references inside DTOs
- [ ] Use enums (not Strings) when values are predefined

---

## ✅ Validation (Request DTOs)

- [ ] Use `@NotNull`, `@NotBlank`, `@Size`, `@Min`, `@Pattern` etc.
- [ ] Add `@JsonFormat` to date/time fields
- [ ] Keep DTOs flat (avoid nesting unless necessary)

---

## 🧪 Response DTO Tips

- [ ] Include `id`, timestamps, and important fields only
- [ ] Never return passwords or internal DB fields
- [ ] Keep read-only and safe for client

---

## 📌 Best Practices

- [ ] Use `@Builder` + `@NoArgsConstructor` + `@AllArgsConstructor`
- [ ] Use `@Data` or `@Getter/@Setter` (avoid logic inside DTO)
- [ ] Separate `Request` vs `Response` for clarity
- [ ] Prefer DTOs over using the Entity directly

---

✅ Once you’ve defined and validated each DTO — you're ready to map and test.
