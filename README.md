# kotlin-stdlib-lite

This is a lite version of kotlin used by io.vproxy projects (mainly `vjson`).

This project only contains necessary kotlin classes and methods for certain projects.  
If you think some kotlin classes or methods are very common and can be added into this project, feel free to create a pr or an issue.

## Usage

This works on both jdk 8 and jdk >= 9

**gradle**

```groovy
runtimeOnly 'io.vproxy:kotlin-stdlib-lite:1.0.2-jdk9'
```

**maven**

```xml
<dependency>
  <groupId>io.vproxy</groupId>
  <artifactId>kotlin-stdlib-lite</artifactId>
  <version>1.0.2-jdk9</version>
  <scope>runtime</scope>
</dependency>
```

## If you are using JDK 8 and the above dep not working

Some toolchain might not support `module-info` in root of the jar, you might use the java 8 version instead:

**gradle**

```groovy
runtimeOnly 'io.vproxy:kotlin-stdlib-lite:1.0.1'
```

**maven**

```xml
<dependency>
  <groupId>io.vproxy</groupId>
  <artifactId>kotlin-stdlib-lite</artifactId>
  <version>1.0.1</version>
  <scope>runtime</scope>
</dependency>
```
