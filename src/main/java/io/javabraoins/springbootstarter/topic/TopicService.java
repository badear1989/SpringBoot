package io.javabraoins.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("1","2","3"),
            new Topic("4","5","6"),
            new Topic("7","8","9")

    ));

    public List<Topic> getTopics(){return topics;}

    public Topic getTopic(String id){
        return topics.stream().filter(topic -> id.equals(topic.getId())).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {

    }

    public void deleteTopic(String id) {
    }
}
