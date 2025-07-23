# ✅ Spring Boot Service Structure – Best Practices Guide

This document defines how to write clean, testable, and maintainable `@Service` classes in a Spring Boot application.

---

## 📦 Structure of a Service Class

```java
@Slf4j
@Service
@RequiredArgsConstructor
@Transactional // optional, based on business logic
public class [ServiceName]Impl implements [ServiceName] {
    
    // 🔗 Dependencies
    private final Repository1 repository1;
    private final Repository2 repository2;
    private final Mapper mapper;
    private final ExternalService externalService;

    /**
     * Description of what this method does.
     *
     * @param inputParam1 description
     * @param inputParam2 description
     * @return response type description
     */
    @Override
    public ReturnType methodName(Type1 param1, Type2 param2) {
        log.info("[ACTION] - [contextId={}] - STARTED", contextId);

        // 1. Validate / load dependencies
        Entity entity = repository1.findById(param1)
                .orElseThrow(() -> {
                    log.error("[ACTION] - [contextId={}] - FAILED - Entity not found", contextId);
                    return new EntityNotFoundException("...");
                });

        // 2. Apply business logic
        ...

        // 3. Persist changes
        repository1.save(entity);

        log.info("[ACTION] - [contextId={}] - SUCCESS", contextId);
        return mapper.toResponse(entity);
    }
}
