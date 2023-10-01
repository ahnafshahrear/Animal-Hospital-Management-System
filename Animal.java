public class Animal extends Owner {
    private String name, animalKind;
    private int age;
    private double wight, height;
    private String species, genus, family, order, className, phylum, kingdom;

    void setAnimalInfo(String name, String kind, int age, double wight, double height) {
        this.name = name;
        this.animalKind = kind;
        this.age = age;
        this.height = height;
        this.wight = wight;
    }

    void setSpeciesInfo(String species, String genus, String family, String order, String className, String phylum, String kingdom) {
        this.species = species;
        this.genus = genus;
        this.family = family;
        this.order = order;
        this.className = className;
        this.phylum = phylum;
        this.kingdom = kingdom;
    }

    void showAnimalInfo() {
        System.out.println("Name: " + name);
        System.out.println("Animal Kind: " + animalKind);
        System.out.println("Age: " + age);
        System.out.println("Wight: " + wight);
        System.out.println("Height: " + height);
    }

    void showSpeciesInfo() {
        System.out.println("Species: " + species);
        System.out.println("Genus: " + genus);
        System.out.println("Family: " + family);
        System.out.println("Order: " + order);
        System.out.println("Class: " + className);
        System.out.println("Phylum: " + phylum);
        System.out.println("Kingdom: " + kingdom);
    }

    String getName() {return name;}

    int getAge() {return age;}

    double getWight() {return wight;}

    double getHeight() {return height;}

    String getAnimalKind() {return animalKind;}

    String getKingdom() {return kingdom;}
}