grails.project.work.dir = 'target'
grails.project.class.dir = 'target/classes'
grails.project.test.class.dir = 'target/test-classes'
grails.project.test.reports.dir = 'target/test-reports'
grails.project.target.level = 1.6

grails.project.dependency.resolution = {
    inherits 'global'
    log 'warn'
    repositories {
        grailsCentral()
        mavenCentral()
        mavenLocal()
        mavenRepo 'http://maven.springframework.org/milestone/'
    }
    dependencies {
    }

    plugins {
        build ":tomcat:$grailsVersion"
        compile ':cloud-foundry:1.2.3', ':cache-headers:1.1.5'
        runtime ":hibernate:$grailsVersion", ':resources:1.2.RC2', ':jquery:1.8.0', ':cached-resources:1.0', ':zipped-resources:1.0'
        test ':spock:0.6'
    }
}

grails.plugin.location.'angular-scaffolding' = '../../..'