package com.example.springbootprojet;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.springbootprojet.AbstractTestContainers;

/**
 * Basic context load test that leverages the Testcontainers based setup.
 * Extending {@link AbstractTestContainers} ensures a PostgreSQL container is
 * started so the Spring context can initialise successfully.
 */

@SpringBootTest
class SpringBootProjectApplicationTests extends AbstractTestContainers {

    @Test
    void contextLoads() {
    }

}
