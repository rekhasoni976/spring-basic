package helloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	List<Topic> topics= new ArrayList<>( Arrays.asList(
			new Topic("spring", "Spring Frame work","Spring Description here"),
			new Topic("java", "java Frame work","java Description here"),
			new Topic("c", "c Frame work","c Description here"),
			new Topic("angular", "angular Frame work","angular Description here")
		));
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}
	
	public Topic getTopic(String id){
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}
	
	

}
