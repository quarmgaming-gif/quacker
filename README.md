# Bombamod C4

Starter project for an original client-side Fabric mod for Minecraft **1.21.4**.

## Included
- Fabric client entrypoint
- Menu opened with **Right Shift**
- A starter GUI with three example toggle buttons
- English and Polish keybind translations
- No license activation or external license service

The example buttons currently only change their on-screen ON/OFF state. They are placeholders for features you implement next.

## Requirements
- JDK 21
- Gradle (or import the folder into IntelliJ IDEA and let it use the Gradle wrapper if you add one)

## Build
From this folder, run:

```bash
gradle build
```

The mod JAR will be generated in `build/libs/`.

## Change the menu key
Open `BombamodC4Client.java` and change `GLFW.GLFW_KEY_RIGHT_SHIFT` to another GLFW key constant.

## Notes
This is a clean-room starter implementation. It does not contain code copied from the uploaded JAR.
