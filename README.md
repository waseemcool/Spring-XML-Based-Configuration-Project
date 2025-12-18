# Spring-XML-Based-Configuration-Project

In the Spring Framework, there are three main configuration types:
1. **XML-based Configuration**
2. **Java-based Configuration**
3. **Annotation-based Configuration**

XML-based Configuration is a Spring Configuration approach where you define beans and their properties, dependencies in external XML file (like applicationContext.xml).

**Key characteristics:**

* Beans are declared using <bean> tags with id and class attributes
* Dependencies are injected through <property> (setter injection) or <constructor-arg> (constructor injection) tags
* Configuration is completely separate from your Java code
* Requires an XML parser to load the application context