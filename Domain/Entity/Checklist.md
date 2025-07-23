# ✅ Entity Class – Workflow Checklist

Guide to writing a JPA-compliant entity for PostgreSQL using Spring Data JPA.

---

## 🧱 Base Setup

- [ ] Annotate with `@Entity`
- [ ] Use `@Table(name = "table_name")`
- [ ] Add `@Id` with UUID generation
- [ ] Use `@CreationTimestamp`, `@UpdateTimestamp` for timestamps
- [ ] Use `@Column(nullable = false)` for required fields

---

## 🔁 Relationships (as needed)

- [ ] `@ManyToOne`, `@OneToMany`, `@OneToOne`, etc.
- [ ] Specify `cascade = CascadeType.ALL` only when needed
- [ ] Use `@JoinColumn` for foreign keys
- [ ] Prevent infinite recursion with `@JsonIgnore` / `@ToString.Exclude`

---

## 🧠 Lombok

- [ ] Use `@Data` for small entities, `@Getter`/`@Setter` otherwise
- [ ] Use `@Builder`, `@NoArgsConstructor`, `@AllArgsConstructor`

---

## 📌 Best Practices

- [ ] Avoid using primitive types (`int`) — use boxed (`Integer`) for nullability
- [ ] Use `LocalDateTime` instead of `Date`
- [ ] Use enums for `status`, `type`, `role`, etc.
- [ ] Avoid putting business logic inside entities

---

✅ Once all fields, annotations and relationships are checked — your entity is production ready.
