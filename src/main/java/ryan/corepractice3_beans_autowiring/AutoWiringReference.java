package ryan.corepractice3_beans_autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AutoWiringReference {

    @Autowired
    @Qualifier("autoWiringDemo")
    private AutoWiringDemo autoWiringDemo;

    public AutoWiringDemo getAutoWiringDemo() {
        return autoWiringDemo;
    }

    public void setAutoWiringDemo(AutoWiringDemo autoWiringDemo) {
        this.autoWiringDemo = autoWiringDemo;
    }
}
