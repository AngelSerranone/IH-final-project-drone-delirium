<img src="angular-frontend\src\assets\images\icons\banner.png" style="zoom:50%;" />

# DRONE-DELIRIUM APP

As a final project of the Ironhack bootcamp sponsored by Santander, I decided to make a website to sell my services as a professional drone pilot. 

This project had to have several requirements:

- Include a microservices Java / Spring Boot back-end and an Angular front-end
- Include at least 2 SQL database tables
- Include at least 4 services plus at least 1 edge service
- Include at least 1 GET, POST, PUT / PATCH, and DELETE route
- Include adequate and complete documentation

## STRUCTURE

My application has the following elements:

- Angular front-end: also using angular material components. It allows the user to view my photos and videos, and they can contact me through a form, which, once the submit is done, stores their data in the database, and sends me an email with their contact information. This form includes a privacy policy that must be accepted.

  ![](screenshots\captura1.png)

  ![](screenshots\captura2.png)

- 3 SQL databases tables:

  - photo: stores the routes of the photos that will be shown in the app.
  - video: stores the routes of the videos that will be shown in the app.
  - contact: stores the contacts that fill in the app form.

- Java back-end with the following microservices:

  - eureka-server: bring together all my microservices
  - configuration-server: outsource the configuration of my microservices.
  - photo-service: bring me the routes of the photos from the database.
  - video-service: bring me the routes of the videos from the database.
  - contact-service: stores the form contacts in the database, and sends me an email with their information
  - edge-service: centralizes calls to all microservices. It also has circuitbreakers and load balancer

## INSTALLATION

In order to use the application, you must:

1.  Download the files from repository

2. Create the 3 databases, executing the files found in the sql-statemetns folder

3. Go to the configuration server repository (https://github.com/AngelSerranone/IHFP-config-server-repo), download the files, and change the application properties of each microservice to the desired ones (username, password ...).

4. Run all microservices, in this order: eureka server, configuration-server, and the rest of microservices, with

   ```
   mvn spring-boot:run
   ```

5. Open the angular project and run

   ```typescript
   // first
   npm -i
   // and then
   ng serve
   ```

6. Enjoy it!

## THANKS

I would like to thank the entire ironhack team for the trust they placed in us when they chose us, and all the effort they have put into us, giving us endless tools to become a fullstack developper.

Likewise, I did not want to miss the opportunity to highlight the human quality of all the students, always ready to help, and especially to:

- Rubén Navarro
- Paul Barroso
- Celia Lumbreras
- Julia García
- Silvia Sanchez















