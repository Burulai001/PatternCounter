package output;

import java.util.Map;

public interface Output {

    void send(Map<?, Integer> result, Formatter formatter);

}
