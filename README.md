# Alectronic Java Library

This project provides a simple template to get you started with creating a new shared Java library. 

## Modules
The following description describes what each of the modules this library comes with are for and what you should put in them. They are here as a guide, but will make sense in most situations. If you get rid of any modules, you should be able to just delete the folder and remove any reference to it from the settings.gradle and make sure it is removed from the build.gradle files of the other modules

### api
This is where the core code of your library should live. If possible, you should avoid putting any Spring-related code in here, so your library can still be used outside Spring. There is a simple class and unit test in here that should be deleted.

### integration-test
Pretty self-explanatory, but these kinds of tests can live in the other modules if that is more relevant. 

### spring-boot-autoconfigure
This module should contain any Spring configuration your app needs to automatically integrate with Spring. There is a file called spring.factories that inform Spring which configuration classes to auto-load. It **should not expose any dependencies**, this is to allow users of the library to manage them themselves. If you do not need any Spring integration then you can obviously just get rid of this module.

### spring-boot-starter
This module should expose explicit versions of required dependencies as well as the autoconfigure module. If you do not need any Spring integration then you can obviously just get rid of this module.