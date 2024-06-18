public class Main {
    public static void main(String[] args) {
        ExplicitKeyRepository keyRepository = new ExplicitKeyRepository();

        // Add some keys
        keyRepository.addKey("123", "abcde");
        keyRepository.addKey("456", "fghij");

        // Retrieve a key
        System.out.println("Key 123: " + keyRepository.getKey("123"));

        // Remove a key
        keyRepository.removeKey("123");
    }
}
