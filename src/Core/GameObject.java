package Core;


public abstract class GameObject {
    private String name;
    private String description;
    private String examine; // Add this field

    public GameObject(String name, String description, String examine) {
        this.name = name;
        this.description = description;
        this.examine = examine; // Initialize the examine field
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getExamine() { return examine; } // Add this getter

    public abstract String deduce();
}