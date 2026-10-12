# Java Programming Assignments

Archived coursework examples covering random-number generation, sorting, binary search, procedural programming, inheritance, a scoreboard, and an event-driven Swing calculator.

## Project structure

- `Assignment/`: an array exercise using random values, bubble sort, and binary search. Its entry-point class is lowercase `main`.
- `final_Assignment/`: a menu-driven scoreboard/inheritance demonstration, additional procedural exercises, sorting helpers, and a Swing calculator.

These directories correspond to the Java package names used in the source.

## Compile and run

Use a Java Development Kit. The examples use Java standard-library APIs and do not require external dependencies.

From the repository root:

```sh
mkdir out
javac -d out Assignment/*.java final_Assignment/*.java
java -cp out Assignment.main
```

Run the final-assignment menu:

```sh
java -cp out final_Assignment.Main
```

Select `1` for the scoreboard or `2` for the inheritance/savings-account example. For the dialog-based calculator:

```sh
java -cp out final_Assignment.Event_Driven
```

The Swing calculator needs a graphical desktop session.

On PowerShell, pass an explicit file list if needed:

```powershell
New-Item -ItemType Directory -Force out | Out-Null
javac -d out (Get-ChildItem Assignment,final_Assignment -Filter *.java).FullName
```

## Scope and limitations

This repository preserves learning exercises rather than a maintained application or verified algorithms library. Randomized examples produce different output between runs. No automated test suite or build-system configuration is included. Review and test the algorithms before reusing them; binary search assumes correctly sorted input.

The repository remains archived and read-only following this documentation addition.
