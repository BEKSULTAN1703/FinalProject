package services;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class AuthService {
    private static AuthService instance;
    private final Map<String, String> userCredentials;

    private AuthService() {
        userCredentials = new HashMap<>();
        userCredentials.put("admin", hashPassword("password123"));
    }

    public static synchronized AuthService getInstance() {
        if (instance == null) {
            instance = new AuthService();
        }
        return instance;
    }

    public boolean authenticate(String username, String password) {
        String storedPasswordHash = userCredentials.get(username);
        return storedPasswordHash != null && storedPasswordHash.equals(hashPassword(password));
    }

    private String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes());
            return Base64.getEncoder().encodeToString(hash);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Failed to hash password", e);
        }
    }
}
