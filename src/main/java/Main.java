import annotations.JsonSerializationException;

public class Main {
    public static void main(String[] args)  throws JsonSerializationException {
        Person person = new Person("Aleksei", "Kazantsev", "43");
        ObjectToJsonConverter serializer = new ObjectToJsonConverter();
        String jsonString = serializer.convertToJson(person);
        System.out.println(jsonString);
    }
}
