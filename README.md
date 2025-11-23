# Course Java

A Java development project with a complete dev container setup for running tests in a containerized environment.

## Prerequisites

Before you begin, ensure you have the following installed:

- **Docker**: [Install Docker](https://docs.docker.com/get-docker/)
- **Visual Studio Code**: [Download VS Code](https://code.visualstudio.com/)
- **Dev Containers Extension**: Install the [Dev Containers extension](https://marketplace.visualstudio.com/items?itemName=ms-vscode-remote.remote-containers) in VS Code

## Getting Started

1. **Clone the repository**
2. **Open in VS Code**
3. **Reopen in Container**
   - When VS Code opens, you'll see a notification to "Reopen in Container"
   - Click "Reopen in Container" (or use Command Palette: `Dev Containers: Reopen in Container`)
   - Wait for the container to build and start

4. **Run the tests**
   - Open the test files in `src/test/java/`
   - Uncomment the `@Disabled("skip")` tests you want to run
   - Execute the tests:
     ```bash
     gradle test
     ```

## Project Structure

```
course-java/
├── .devcontainer/          # Dev container configuration
├── src/
│   ├── main/java/          # Source code
│   └── test/java/          # Test files
├── build.gradle.kts        # Gradle build configuration
└── README.md
```

## Running Tests

To run all tests:
```bash
gradle test
```

To run tests in watch mode or specific test classes, refer to the Gradle documentation.

## Technologies

- Java 21
- Gradle
- JUnit 5
- Docker Dev Containers
