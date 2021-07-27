import java.util.Optional;

public class SystemPropertiesReader {

    public static String getProperty(String variableName, String defaultValue) {
        return Optional
                .ofNullable(Optional
                        .ofNullable(System.getenv(variableName))
                        .orElse(System.getProperty(variableName)))
                .orElse(defaultValue);
    }

    public static String getProperty(String variableName) {
        return getProperty(variableName, null);
    }
}
