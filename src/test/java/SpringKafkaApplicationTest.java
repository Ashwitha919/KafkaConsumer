import com.kafka.consumer.model.User;
import com.kafka.consumer.service.UserListener;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.config.KafkaListenerEndpointRegistry;
import org.springframework.kafka.listener.MessageListenerContainer;
import org.springframework.kafka.test.rule.KafkaEmbedded;
import org.springframework.kafka.test.utils.ContainerTestUtils;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.TimeUnit;


@SpringBootTest
public class SpringKafkaApplicationTest {


}
