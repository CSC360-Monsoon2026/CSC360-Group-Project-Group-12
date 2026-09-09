# Phase 2 — Technology Choices and Justification

This section records the key technology and interface choices made during Phase 2 and the reasoning behind selecting them.

| Choice | Why We Chose It | Why Not the Alternative |
|---|---|---|
| BorderPane | Provides a clear structure for organizing the JavaFX browser interface into different sections. | Using only VBox or HBox would make it harder to organize the interface into top, center, and bottom areas. |
| HBox | Allows browser controls such as the URL field and buttons to be arranged horizontally. | Using separate layouts would make the browser controls less organized. |
| TextField | Provides a simple input field for entering the website URL. | A Label cannot accept user input. |
| Button | Provides user interaction for actions such as loading a page and changing the DOM. | Static UI components such as Labels cannot trigger user actions. |
| WebView | Provides the browser display area and will support the browser and DOM functionality planned for later phases. | A normal JavaFX control cannot display and interact with web pages. |

## Design Approach

We decided to use `BorderPane` as the main layout for the JavaFX interface.

The top section is used for browser controls, while the center section is reserved for the `WebView`. This structure keeps the interface organized and provides a suitable foundation for adding browser and DOM functionality in the upcoming phases.

## Key Decision

The main approach followed in Phase 2 was:

**Choose a suitable layout → select the required UI components → organize the interface → prepare the structure for browser and DOM integration.**
