package com.acme.action

import com.acme.model.Person
import spock.lang.Specification
import spock.lang.Subject

class ActionOnPersonsShould extends Specification {

  @Subject
  ActionOnPersons underTest = new ActionOnPersons()

  def "unique names of people"() {
    expect:
    def result = underTest.names([new Person("name-a"),
                                  new Person("name-b"),
                                  new Person("name-a")]
        .toSet())

    result == ["Name-a", "Name-b"] as Set
  }
}
