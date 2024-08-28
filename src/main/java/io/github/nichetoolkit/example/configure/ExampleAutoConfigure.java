package io.github.nichetoolkit.example.configure;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <code>ExampleAutoConfigure</code>
 * <p>The type example auto configure class.</p>
 * @author Cyan (snow22314@outlook.com)
 * @see lombok.extern.slf4j.Slf4j
 * @see org.springframework.context.annotation.Configuration
 * @see org.springframework.context.annotation.ComponentScan
 * @since Jdk1.8
 */
@Slf4j
@Configuration
@ComponentScan(basePackages = {"io.github.nichetoolkit.example"})
public class ExampleAutoConfigure {
    /**
     * <code>ExampleAutoConfigure</code>
     * Instantiates a new example auto configure.
     */
    public ExampleAutoConfigure() {
        log.debug("================= example-auto-configure initiated ！ ===================");
    }
}
