# ✅ Mapper Interface – Workflow Checklist (MapStruct)

Step-by-step guide to implement mappers between Entity and DTOs using MapStruct.

---

## 🧱 Base Setup

- [ ] Create interface in `mappers/` package
- [ ] Annotate with `@Mapper(componentModel = "spring")`
- [ ] Define map methods for:
  - [ ] `toEntity(RequestDto)`
  - [ ] `toResponse(Entity)`
  - [ ] `toResponseList(List<Entity>)`
  - [ ] `updateFromDto(UpdateDto, @MappingTarget Entity)`

---

## 🧪 Usage Tips

- [ ] Use `@BeanMapping(nullValuePropertyMappingStrategy = IGNORE)` for partial updates
- [ ] Avoid setting ID manually unless required
- [ ] Keep mappings 1:1 with DTO/Entity fields for simplicity

---

## 📌 Best Practices

- [ ] Do **not** put logic in mapper — only mapping
- [ ] Mapper should not call repository or other services
- [ ] Keep DTOs flat — avoid nested objects unless necessary
- [ ] For enums — make sure names match between DTO ↔ Entity

---

✅ Once all methods are defined and tested — your mapper is ready.
