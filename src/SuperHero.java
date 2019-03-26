public class SuperHero {
    private String name;
    private long code;

    public SuperHero(String name, long code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public boolean match(long code) {
        if (this.code == code)
            return true;
        else
            return false;
    }
}
