package org.acme.getting.started;

public class SomeLibraryClassDependency {

  private static Integer n = 0;
  private Integer id;

  public SomeLibraryClassDependency() {
    n += 1;
    this.id = n;
  }

  public Integer getId() {
    return id;
  }
}
