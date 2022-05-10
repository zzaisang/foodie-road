plugins {
	id ("org.springframework.boot") version "2.6.7"
	id ("io.spring.dependency-management") version "1.0.11.RELEASE"
	java
}

group = "com"
version = "0.0.1-SNAPSHOT"

configure<JavaPluginConvention> {
	sourceCompatibility = JavaVersion.VERSION_17

}

repositories {
	mavenCentral()
}


tasks {
	test {
		useJUnitPlatform()
	}
}

dependencies {

	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk17")

	//spring & webflux
	implementation("org.springframework.boot:spring-boot-starter-data-mongodb-reactive")
	implementation("org.springframework.boot:spring-boot-starter-webflux")

	//springfox swagger
	implementation("io.springfox:springfox-boot-starter:3.0.0")
//	implementation 'io.springfox:springfox-swagger-ui:3.0.0'
//	implementation 'io.springfox:springfox-spring-webflux:3.0.0'

	compileOnly("org.projectlombok:lombok")
	annotationProcessor("org.projectlombok:lombok")
	annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("io.projectreactor:reactor-test")

}