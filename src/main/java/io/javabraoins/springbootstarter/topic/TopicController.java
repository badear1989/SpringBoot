package io.javabraoins.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getTopics();
    }

    @RequestMapping("/topics/{foo}")
    public Topic getTopic(@PathVariable("foo") String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable("id") String id){
        topicService.updateTopic(id, topic);
    }

    @RequestMapping(value = "/topics/{foo}", method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable("foo") String id){
        topicService.deleteTopic(id);
    }
}
