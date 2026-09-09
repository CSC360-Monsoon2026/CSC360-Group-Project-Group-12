# Phase 2: Basic JavaFX Interface — Methodology

## Objective

The objective of Phase 2 was to create the basic user interface for the JavaFX browser application and organize its components using a suitable layout.

## Approach

We designed the application using a `BorderPane` layout. The JavaFX application contains a `Stage` and `Scene`, with the `BorderPane` used to organize the interface into different sections.

The top section contains the browser controls such as the URL field and Load button. The center section is reserved for the `WebView`, which will provide browser support. A Change DOM button is included for the future DOM manipulation functionality.

## UI Structure

```text
JavaFX Application
        ↓
      Stage
     (Window)
        ↓
      Scene
        ↓
    BorderPane
     /      \
   TOP     CENTER
    │         │
   HBox     WebView
    │
 URL + Load

   BOTTOM
      │
 Change DOM
