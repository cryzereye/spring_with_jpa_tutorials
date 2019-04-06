package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

// looks like this will be the connector to db
public interface TopicRepository extends CrudRepository<Topic, String> {

}
