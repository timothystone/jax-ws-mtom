# Section 14 — MTOM

## Lesson 129 — Introduction

A basic introduction to the section and the features of MTOM.˚

## Lesson 130 — Create the MTOM Project

Leveraging the Spring Initializr project, a project is created.

The project created is clean up per the ACD standard as follows:

1. Delete the mvnwrapper support.
2. Rename the `HELP.md` to `README.md`
3. Clean up the `.gitignore`, i.e., remove `HELP.md`, `.mvnw`  and other exclude inversions
   that look at the `src/main` class paths where `target` and `build` may occur in package names.

These Spring Initializr changes can be found in the commit history.

### Add CXF for Spring Boot JAX-WS dependency

Update the POM with proper GAV coordinates and add the CXF dependency.

### Update the Spring Boot Application Properties

Of note, is `server.context-path` is deprecated in favor of `server.servlet.context-path`. The `cxf.path` setting of `/`
strips `services` from the default URL path created by CXF in Spring Boot.

## Lesson 131 — Create the FileWs Interface

## Lesson 132 — Create the FileWsImpl

## Lesson 133 — Implement the download method

## Lesson 134 — Publish the endpoint

## Lesson 135 — Test using SOAP-UI