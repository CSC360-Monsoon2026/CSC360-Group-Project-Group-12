# Phase 2: Basic JavaFX Interface — Methodology

## Objective

The objective of Phase 2 was to create the basic graphical user interface of the JavaFX application.

After successfully setting up and running JavaFX in Phase 1, this phase focused on creating the main application window and adding the required user interface components.

The interface was designed to contain a browser area in the center and a button bar at the bottom. The buttons would later be used to interact with the HTML page and modify its DOM.

## Approach

We followed a step-by-step approach:

1. Created the main JavaFX application window using `Stage`.
2. Created a `Scene` to hold the application interface.
3. Used `BorderPane` as the main layout container.
4. Created a `WebView` to provide the browser area.
5. Created an `HBox` to arrange the buttons horizontally.
6. Added buttons for different DOM operations.
7. Placed the `WebView` in the center of the interface.
8. Placed the button bar at the bottom of the interface.
9. Connected button actions to JavaFX event handlers.
10. Tested the complete interface.

## JavaFX Application Structure

The basic interface was designed using the following structure:

```text
Stage
┌──────────────────────────────────────────────────────┐
│                                                      │
│                     Scene                            │
│                                                      │
│  ┌───────────────────────────────────────────────┐   │
│  │                                               │   │
│  │                                               │   │
│  │                    WebView                    │   │
│  │                                               │   │
│  │              Browser Content                  │   │
│  │                                               │   │
│  │                                               │   │
│  └───────────────────────────────────────────────┘   │
│                                                      │
│  ┌───────────────────────────────────────────────┐   │
│  │      [Change Text] [Change Color] [Reset]    │   │
│  └───────────────────────────────────────────────┘   │
│                    HBox                              │
└──────────────────────────────────────────────────────┘

