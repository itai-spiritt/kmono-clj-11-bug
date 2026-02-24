# Clojure Monorepo - Reflection Warnings in kmono

This repository demonstrates reflection warnings that occur when using `kmono` with Clojure CLI 1.11.x on Java 21.

## Issue Summary

When running kmono operations with Clojure CLI version 1.11.4.1474, the following reflection warnings appear:

```
Reflection warning, k16/kmono/core/fs.clj:89:3 - call to method checkIgnored can't be resolved (target class is unknown).
Reflection warning, k16/kmono/core/fs.clj:118:16 - call to method matches can't be resolved (target class is unknown).
Reflection warning, k16/kmono/core/thread.clj:29:25 - call to method submit can't be resolved (target class is unknown).
```

These warnings do not occur with Clojure CLI version 1.12.4.1602 or later.

## Reproduction

### Using Docker

**With Clojure CLI 1.11.4.1474 (shows warnings):**
```bash
docker build --platform linux/amd64 -t kmono-test .
docker run --rm kmono-test
```

**With Clojure CLI 1.12.4.1602 (no warnings):**
```bash
# Update Dockerfile FROM line to: clojure:temurin-21-tools-deps
docker build --platform linux/amd64 -t kmono-test .
docker run --rm kmono-test
```

### Environment Details

- Java: OpenJDK 21.0.10 (Temurin)
- kmono: 4.11.0
- Affected: Clojure CLI 1.11.x
- Fixed: Clojure CLI 1.12.x+
