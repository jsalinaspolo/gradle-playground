package com.acme.model;

import com.google.common.collect.ImmutableSet;
import org.apache.commons.lang3.StringUtils;

import java.util.Set;

import static java.util.stream.Collectors.toList;

public class Person {

  private String name;

  public Person(String name) {
    this.name = name;
  }

  public static Set<String> getNames(Set<Person> persons) {
    return ImmutableSet.copyOf(persons.stream()
        .map(person -> StringUtils.capitalize(person.name))
        .collect(toList()));
  }
}
