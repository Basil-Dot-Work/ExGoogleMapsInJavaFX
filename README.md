## Demo Google Maps loading into JavaFX WebView

In response to this pair of Questions on StackOverflow.com:

 - [*JavaFX not embedding google maps html*](https://stackoverflow.com/q/77070695/642706)
 - [*Any java alternative approach to integrate google map with JavaFX as webkit is not supported ES6*](https://stackoverflow.com/q/79583143/642706)

… I wrote this utterly simple demonstration of successfully loading [Google Maps](https://www.google.com/maps) into a [`javafx.scene.web.WebView`](https://openjfx.io/javadoc/24/javafx.web/javafx/scene/web/WebView.html) widget in JavaFX/[OpenJFX](https://openjfx.io/) 24.0.1. 

The user is able to search for a map location, and obtain driving directions. Other Google Maps features may or may not function.

This project was originally generated by the *IntelliJ* IDE’s [JavaFX new-project template](https://www.jetbrains.com/help/idea/javafx.html). I then modified `HelloApplication.java`, the Maven POM file, and `module-info.java`.

The principal code is merely the following two lines, while this repo provides an entire ready-to-run project.

```java
final WebView webView = new WebView ( );
webView.getEngine ( ).load ( "https://www.google.com/maps" );
```
