package com.example.springbootprojet;

import org.junit.jupiter.api.Test;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.assertj.core.api.Assertions.assertThat;

@Testcontainers
public class TestContainersTest extends AbstractTestContainers{

    @Test
    void canStartPostgres() {
        assertThat(postgreSQLContainer.isRunning());
        assertThat(postgreSQLContainer.isCreated());

    }

}
