package org.acme.getting.started;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Objects;

import javax.inject.Inject;

@QuarkusTest
public class CDITest {

  @Inject
  MyAppFactory factory;

  @Test
  public void testHelloEndpoint() {
    Objects.requireNonNull(factory);
    var a = factory.getNewMyClass();
    var b = factory.getNewMyClass();
    assertNotEquals(a.getUsabeId(), b.getUsabeId());
  }

}