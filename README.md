# Section 14 — MTOM

## Lesson 129 — Introduction



## Lesson 130 — Create the MTOM Project

Leveraging the Spring Initializr project, a project is created.

The project created is clean up per the ACD standard as follows:

1. Delete the mvnwrapper support.
2. Rename the `HELP.md` to `README.md`
3. Clean up the `.gitignore`, i.e., remove `HELP.md`, `.mvnw`  and other exclude inversions
   that look at the `src/main` class paths where `target` and `build` may occur in package names.

These Spring Initializr changes can be found in the commit history.

## Lesson 131 — Create the FileWs Interface

## Lesson 132 — Create the FileWsImpl

## Lesson 133 — Implement the download method

## Lesson 134 — Publish the endpoint

## Lesson 135 — Test using SOAP-UI