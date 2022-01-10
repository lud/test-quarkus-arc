package org.acme.getting.started;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Provider;

import io.quarkus.arc.runtime.BeanContainer.Instance;

@ApplicationScoped
public class MyAppFactory {
  @Dependent
  @Produces
  SomeLibraryClassDependency getDep() {
    return new SomeLibraryClassDependency();
  }

  @Dependent
  @Produces
  SomeLibraryClass getUsable(SomeLibraryClassDependency dep) {
    return new SomeLibraryClass(dep);
  }

  @Inject
  @Dependent
  Provider<MyAppClass> myClassProvider;

  public MyAppClass getNewMyClass() {
    return myClassProvider.get();
  }
}
