FROM clojure:temurin-21-tools-deps-1.11.4.1474


# Set working directory
WORKDIR /app

# Copy project files
COPY deps.edn /app/
COPY apps/ /app/apps/
COPY libs/ /app/libs/
COPY test.clj /app/

# Download dependencies (cached layer)
RUN clojure -P -M:dev

# Default command (can be overridden)
CMD ["clojure", "-X", "test/print-packages"]
