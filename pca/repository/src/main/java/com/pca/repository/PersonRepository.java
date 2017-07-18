package com.pca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pca.bean.*;
import antlr.collections.List;

/**
 * Specifies methods used to obtain and modify person related information
 * which is stored in the database.
 * @author Petri Kainulainen
 */
public interface PersonRepository extends JpaRepository<Person, Integer> {
 
    /**
     * Finds person by using the last name as a search criteria.
     * @param lastName
     * @return  A list of persons whose last name is an exact match with the given last name.
     *          If no persons is found, this method returns null.
     */
/*    public List<Person> findByName(String lastName);*/
}