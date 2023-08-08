# Spring Core with XML Configuration
Simple app based on Spring Core with XML configuration.
The idea is to create a Market.

*Entities:*
1. Market class
2. Product Interface
3. Fruit class implements Products
4. Vegetables class implements Products

## 1. Preparation steps
1.Create a new project in IntelliJ IDEA (choose Maven Archetype - > org.apache.maven.archetypes:maven-archetype-webapp)

2.Open your pom.xml file. Create new dependencies with open tag <dependency> and close tag </dependency>. You need to create 3 dependencies: Spring Core, Spring Bean, Spring Context.

3.Go to Maven repository https://mvnrepository.com/. Find dependencies. Choose the latest version, copy the Maven dependency code and paste in each dependency your created before in pom.xml

4.Create a new directory ("java") in main.

5.Mark directory as Sources Root(it indicates that java-code stored here).

6.Create a new package "springCoreApp" at "java" directory.

## 2. Define Dependency classes

## 3.Configure the dependency injection

## 4.Create application context container
Create application context

`ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");`
