package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import io.javabrains.springbootstarter.topic.Topic;

// looks like this will be the connector to db
public interface CourseRepository extends CrudRepository<Course, String> {

	// findBy<Attribute><Attribute>   see camel case required
	public List<Course> findByTopicId(String topicId);
}
