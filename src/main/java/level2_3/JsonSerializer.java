package level2_3;

import annotations.JsonSerializable;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class JsonSerializer {

    public static void serializeObject(Object object) throws IOException {

        Class<?> clazz = object.getClass();

        if (clazz.isAnnotationPresent(JsonSerializable.class)) {

            JsonSerializable annotation = clazz.getAnnotation(JsonSerializable.class);

            String directoryPath = annotation.directory();

            File directory = new File(directoryPath);
            if (!directory.exists()) {

                boolean created = directory.mkdirs();

                if (created) {
                    System.out.println("Created directory: " + directoryPath);
                } else {
                    System.err.println("Failed to create directory: " + directoryPath);

                }
            }


            ObjectMapper mapper = new ObjectMapper();

            String fileName = clazz.getSimpleName() + ".json";

            File outputFile = new File(directory, fileName);

            mapper.writerWithDefaultPrettyPrinter().writeValue(outputFile, object);

            System.out.println("Object serialized to: " + outputFile.getAbsolutePath());

        } else {

            System.out.println("Class " + clazz.getSimpleName() + " is not annotated with " +
                    "@JsonSerializable. Skipping serialization.");
        }
    }
}