package output;

import java.util.Map;

public class Print implements Output{
    @Override
    public void send(Map<?, Integer> result, Formatter formatter) {
        System.out.println(formatter.format(result));
    }
}
