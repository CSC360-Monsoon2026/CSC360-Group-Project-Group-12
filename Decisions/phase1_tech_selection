# Phase 1 — Technology Choices and Justification

This section records the key technology choices made during Phase 1 and the reasoning behind selecting them.

| Choice | Why We Chose It | Why Not the Alternative |
|---|---|---|
| Java 21 | Provides a stable Java environment for the project. | The project is Java-based, so using another language was not suitable. |
| JavaFX 21 | Supports the required GUI and provides `WebView` for the browser integration planned for later phases. | Swing supports desktop GUIs but does not provide the same direct path for our browser integration requirement. |
| Maven | Makes dependency management and project configuration easier and keeps the setup consistent. | Manually adding JAR files would make dependency and version management harder. |
| JavaFX Maven Plugin | Provides a proper way to configure and launch the JavaFX application with Maven. | Running directly through the IDE caused the JavaFX runtime configuration issue. |

## Design Approach

We decided to first verify the basic JavaFX environment before adding browser and DOM functionality.

This keeps the development process modular: if an issue occurs later, it can be identified as a browser/DOM integration issue rather than a basic JavaFX setup issue.

## Key Decision

The main approach followed in Phase 1 was:

**Choose the required technology → justify the choice → consider alternatives → document why the alternative was not selected.**
