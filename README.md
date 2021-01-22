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

Create a new Java interface and define the following two (2) methods for implementation:

`void upload(DataHandler)` and `DataHandler download()`

This interface is marked with an `@Webservice` annotation and the `upload` method parameter MAY be marked with the 
`@WebParam` annotation for documentation purposes.

## Lesson 132 — Create the FileWsImpl

The implementation of the webservice from Lesson 131 is straightforward stream handling of bytes.

Write the file to the JVM temp directory, or elsewhere as needed in the design.

Added some JavaDocs.

## Lesson 133 — Implement the download method

Directly implemented with a DataHandler and FileDataSource.

## Lesson 134 — Publish the endpoint

Create the endpoint with a configuration class.

The endpoint using the FileWsImpl requires that MTOM be enabled. Get a SOAPBinding from the endpoint and enable the MTOM
feature. Apache CXF documentation provide details.

## Lesson 135 — Test using SOAP-UI

Refactor the InputStream and OutputStream so that the implementation can properly handle the resources. Close the 
streams in a `finally` block on the upload implementation of the service.

