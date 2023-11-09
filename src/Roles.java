public enum Roles {
    WARRIOR("I am STRONK", 15),
    MAGE("I am SMORT", 15);

    public final String description;
    public final int health;

    Roles(String description, int health) {
        this.description = description;
        this.health = health;
    }
}
