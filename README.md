# kotlin-stdlib-lite

This is a lite version of kotlin used by io.vproxy projects (mainly `vjson`).

This project only contains necessary kotlin classes and methods for certain projects.  
If you think some kotlin classes or methods are very common and can be added into this project, feel free to create a pr or an issue.

## Usage

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

## For jdk >= 9

If you are using java 9 or higher, you may use:

**gradle**

```groovy
runtimeOnly 'io.vproxy:kotlin-stdlib-lite:1.0.1-jdk9'
```

**maven**

```xml
<dependency>
  <groupId>io.vproxy</groupId>
  <artifactId>kotlin-stdlib-lite</artifactId>
  <version>1.0.1-jdk9</version>
  <scope>runtime</scope>
</dependency>
```
