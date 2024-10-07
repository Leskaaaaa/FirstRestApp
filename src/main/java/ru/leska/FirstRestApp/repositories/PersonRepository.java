package ru.leska.FirstRestApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.leska.FirstRestApp.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
