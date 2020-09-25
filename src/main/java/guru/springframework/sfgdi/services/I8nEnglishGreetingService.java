package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i8nService")
public class I8nEnglishGreetingService implements GreetingService{


    @Override
    public String sayHello() {
        return "Hello World - i8nEnglishGreetingService";
    }

}
