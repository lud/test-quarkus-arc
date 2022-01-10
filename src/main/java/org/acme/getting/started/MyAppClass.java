package org.acme.getting.started;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

@Dependent
public class MyAppClass {
  @Inject
  SomeLibraryClass usable;

  public Integer getUsabeId() {
    return usable.getId();
  }
}
