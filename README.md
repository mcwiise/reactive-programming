# Reactive Programming Workshop

### Tomcat Vs Netty Comparison

1. Make sure to install the following tools:
   - JDK 17
   - Intellij Ultimate Edition
   - Jmeter ([for mac users](https://formulae.brew.sh/formula/jmeter))
2. From intellij:
   - import `tomcat-example` project and start it in profile mode ![intellij profile mode](/img/profile-mode.png)
   - import `netty-example` project and start it in profile mode ![intellij profile mode](/img/profile-mode.png)
3. From Jmeter, open `tomcat-vs-netty-test-plan.jmx` and execute the test plan ![jmeter execute plan](/img/start-test-plan.png)
4. Go back to intellij and check CPU and memory usage from profiler ![profiler](/img/profiler.png) tab for `netty-example` and `tomcat-example` applications.
   ![CPU and memory](/img/cpu-memory-live.png)

### The Project Reactor Training

From intellij import `reactor-training` project, where you will find the following packages which a bunch reactor examples to execute:

- `com.reactor.training.monos`:
- `com.reactor.training.monos`:
