package helloworld;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicListController {
	@Autowired
	private TopicService topicService;

	@RequestMapping(value="/topics")
	public List<Topic> getTopicList(){
		return topicService.getAllTopics();
	}
	
	@RequestMapping(value="/topics/{id}")
	public Topic getTopic(@PathVariable String id){
		return topicService.getTopic(id);
	}
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public  void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
}
