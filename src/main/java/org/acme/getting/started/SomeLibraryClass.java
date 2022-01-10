package org.acme.getting.started;

public class SomeLibraryClass {

  private SomeLibraryClassDependency dep;

  public SomeLibraryClass(SomeLibraryClassDependency dep) {
    this.dep = dep;
  }

  public Integer getId() {
    return dep.getId();
  }
}
