# jpop-Repo
step by step learning 

#week 1 :
created user service and book service added h2 database;

#week 2 :
created added swagger and flyway;

#week 3: 
Implementing Cloud-Configuration, Eureka & Hystrix. Integrate the Book & User services with them;
setting up cloud config server
		set up the cloud config server and make other microservice as it client add the depency for it
		repository for cloud config is setup locally  
Setting up eureka
		create a project with added dependency of eureka server and annotated with @enableEurekaServer
		added client dependency to existing microservices and annoatted them with @enableDiscoveryClient
		
		on running microservice register it self to eureka server
		
		Note: added necessary property to applcation.properties fils of server and client
Setting up Hystrix and Hystrix dash board
add fllowing dependency
 hystrix ,hystrix-dashboard,acturator
 @EnableCircuitbreaker to the application call for enabling circuitbreaker(Hystrix) to the project.
 
	@hystrixcommand to the method where u need to add fallback method
	
 
 @EnableHystrixDashBoard to the application call for enabling hystrix-dashboard to the project.
 
 
 Problem faced in hystrix configuration
 ----------------------------------------------------------------------------------------------------------------------
 1. static resources were not loaded 
 ---------------------------------------------------------------------------------------------------------------------
 sol:   extend WebMvcConfigurationSupport
 
 manually need to add the and override the addResourceHandler
 
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/hystrix/**")
                .addResourceLocations("classpath:/static/hystrix/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }  
 
---------------------------------------------------------------------------------------------------------------------		
----------------------------------------------------------------------------------------------------------------------
 2. Hystrix dashboard issue Connecttion refused (proxy.stream issue) 
 ---------------------------------------------------------------------------------------------------------------------
 sol:   add hystrix.dashboard.proxy-stream-allow-list=*
 
		it allows the hystrix.stream
 ------------------------------------------------------------------------------------------------------------------	
		

		