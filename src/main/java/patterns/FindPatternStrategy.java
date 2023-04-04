package patterns;

import org.reflections.Reflections;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static org.reflections.scanners.Scanners.SubTypes;

@FunctionalInterface
public interface FindPatternStrategy {

    Map<?, Integer> findPattern(List<String> input);

    static FindPatternStrategy getPattern(String pattern) {
        FindPatternStrategy findPattern;
        try {
            Class<FindPatternStrategy> findPatternStrategy = (Class<FindPatternStrategy>) Class.forName("patterns." + pattern);
            findPattern = findPatternStrategy.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            Reflections reflections = new Reflections("patterns");
            Set<Class<?>> subTypes = reflections.get(SubTypes.of(FindPatternStrategy.class).asClass());
            String message = "Please, write one of the valid pattern name as a second command line argument: \n";
            String validPatterns = subTypes.stream().map(Class::getSimpleName).collect(Collectors.joining(", "));
            throw new IllegalArgumentException(message + validPatterns);
        }
        return findPattern;
    }
}
