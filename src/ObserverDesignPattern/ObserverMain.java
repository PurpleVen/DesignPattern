package ObserverDesignPattern;

import ObserverDesignPattern.Controller.Observer;
import ObserverDesignPattern.Model.EmailTopic;
import ObserverDesignPattern.Model.EmailTopicSubscriber;

public class ObserverMain {

    public static void main(String[] args) {

        EmailTopic topic = new EmailTopic();



        //create observers
        Observer firstObserver = new EmailTopicSubscriber("FirstObserver");

        Observer secondObserver = new EmailTopicSubscriber("secondObserver");

        Observer thirdObserver = new EmailTopicSubscriber("thirdObserver");

        //Register them...
        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);

        // Attaching observer to subject
        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);


        //Check for updates
        firstObserver.update();
        thirdObserver.update();


        //Provider/ Subject ( broadcaster)
        topic.postMessage("Hello Subscribers!");


        topic.unregister(firstObserver);

        topic.postMessage("Hello Subscribers!");




    }

}
