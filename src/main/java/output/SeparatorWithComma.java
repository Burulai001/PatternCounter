package output;

import java.util.Map;

public class SeparatorWithComma implements Formatter {

    @Override
    public String format(Map<?, Integer> result) {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<?, Integer> each : result.entrySet()) {
            builder.append(each.getKey()).append(", ").append(each.getValue()).append("\n");
        }
        return builder.toString();
    }

}
