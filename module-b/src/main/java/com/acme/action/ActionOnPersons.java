package com.acme.action;

import com.acme.model.Person;
import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class ActionOnPersons {

  public ImmutableSet<String> names(Set<Person> people) {
    return ImmutableSet.copyOf(Person.getNames(people));
  }
}
