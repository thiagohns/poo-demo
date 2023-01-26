import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.7.2"
    id("io.spring.dependency-management") version "1.0.12.RELEASE"
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.spring") version "1.6.21"
    kotlin("plugin.jpa") version "1.6.21"
}

group = "me.thenrique"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
//    runtimeOnly("com.h2database:h2") //
    implementation("org.springframework.boot:spring-boot-starter-web") {
        exclude(module = "spring-boot-starter-tomcat")
    }
    implementation("mysql:mysql-connector-java:8.0.18")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation("org.springdoc:springdoc-openapi-webflux-ui:1.6.13")
    implementation("org.springframework.boot:spring-boot-starter-webflux")

//    implementation(kotlin("reflect"))
//    implementation(kotlin("stdlib-jdk8"))
//    implementation("org.slf4j:slf4j-api:1.7.35")
//    implementation("org.springframework.boot:spring-boot-starter")
//    implementation("org.springframework.boot:spring-boot-starter-web") {
//        exclude(module = "spring-boot-starter-tomcat")
//    }
//    implementation("org.springframework.boot:spring-boot-starter-jetty")
//    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
//    implementation("org.jetbrains.kotlin:kotlin-reflect")
//    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
//    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
////	implementation("com.newrelic.agent.java:newrelic-api:5.13.0")
////	implementation("com.mercadolibre.metrics:metrics-core:0.0.13")
////	implementation("com.mercadolibre.metrics:datadog-metric-wrapper:0.0.13")
//    implementation("org.springdoc:springdoc-openapi-kotlin:1.6.7")
//    implementation("org.springdoc:springdoc-openapi-webflux-ui:1.6.7")
////	implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml")
////	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
//    implementation("org.springframework.boot:spring-boot-starter-webflux")
//    implementation("org.springframework.boot:spring-boot-starter-aop")
//    implementation("org.springframework.boot:spring-boot-starter-actuator")
//    implementation("org.springframework.boot:spring-boot-starter-validation")
//    implementation("io.projectreactor.addons:reactor-extra:3.4.1")
//    implementation("mysql:mysql-connector-java:8.0.18")
//    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
//    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}


tasks.withType<Test> {
    useJUnitPlatform()
}
