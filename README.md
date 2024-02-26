# Reactive Programming Workshop

### Tomcat Vs Netty

1. Make sure to install the following tools:
   - JDK 17
   - Intellij Ultimate Edition
   - Jmeter ([just for mac users](https://formulae.brew.sh/formula/jmeter))
2. From intellij:
   - import `tomcat-example` project and start it in profile mode ![intellij profile mode](/img/profile-mode.png)
   - import `netty-example` project and start it in profile mode ![intellij profile mode](/img/profile-mode.png)
3. From Jmeter, open `tomcat-vs-netty-test-plan.jmx` and execute the test plan ![jmeter execute plan](/img/start-test-plan.png)
4. Go back to intellij and check CPU and memory usage from profiler ![profiler](/img/profiler.png) tab for `netty-example` and `tomcat-example` applications.
   ![CPU and memory](/img/cpu-memory-live.png)

### The Project Reactor Training

From intellij import `reactor-training` project, and check the following packages with reactive examples:

- `com.reactor.training.monos`
- `com.reactor.training.fliuxes`

### Webflux Example

1. Install [docker](https://www.docker.com/products/docker-desktop/)
2. Import the project in intellij
3. From the project root folder, execute the following command

   `docker-compose up -d --build`

4. Start the application
