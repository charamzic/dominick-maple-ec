# Dominick Maple-ec exercise

___

### Task

Create a simple Java web application for newsletter email registration. The application should be deployable as a WAR to
an application container.

It should provide a simple HTML form accepting a name and an email address and it should have a view of all entered
names and emails in a table. The application should save names and emails to an embedded DB like HSQLDB/H2/Derby.

You have free hand how to implement it and what technologies you use.

- Write down any assumptions and/or decisions you've made about application.
- Identify possible threats and their mitigations.
- Provide source code.

---

### Creation

- I have decided to go with simple MVC pattern as I remember it most.
- There is one Model (Subscriber) and its service, service implementation and repository. It could seem redundant in
  this case, but I'm trying to follow practices I was told are appropriate.
- I think an asynchronous programming would be convenient here, but I don't know much about it yet.
- I chose H2 db for no particular reason. I don't have much experience with any of mentioned databases, we used mainly
  MySQL during the bootcamp.
- Seeded the db with some default items via CommandLineRunner.
- Bootstrap seemed to be suitable here as the frontend wasn't main focus.
- I didn't comment much as there is not a lot of unclear methods or so.

**Threats and their mitigations**

- I think some sort of authorisation and authentication should be included.
- And data validation on both sides, frontend and backend.
- Asynchronous programming would be better in my opinion for communication with database.
- Pagination of the subscribers list in the view would be a good option when more items are stored.
- Checking for duplicate users would also be in place when post request is made.

**Docker**

- First time seeing it, although I knew something like that exists.
- I used this H2 image from hub: https://hub.docker.com/r/thomseno/h2/ for separate db container, but went into some
  issues:
  - Mounting failed, didn't find out how to run docker in this scenario. 
  - More precisely, I didn't find out how to specify
    the path to inmemory db in the docker run command. Going to learn more about this.
  - Tried file storage instead of inmemory, but issued JdbcSQLSyntaxErrorException while trying to save items.
  - I am going to learn more about these issues and go more into depth of using docker and embedded databases.
- After all, the app seems to run in the container successfully.
- Pushed the [image to docker hub](https://hub.docker.com/repository/docker/charamzic/dominick-maple-ec).

### Summary

It took me some googling even though this was considered an easy task. This was my first time using Docker and I had to
remember a bit of Java again as we switched to C# pretty soon in Green Fox Academy bootcamp. I wasn't quite successful
with the database and docker issues and going to learn more about that.

Regarding security threats, I don't have much know-how and experience yet. 