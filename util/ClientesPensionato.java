package util;

public class ClientesPensionato {

    private String name, email;
    int room;

    public ClientesPensionato(String name, String email, int room) {
        this.name = name;
        this.email = email;
        this.room = room;
    }

    public String toString() {
        return room + ": " + name + ", " + email + ".";
    }
}
