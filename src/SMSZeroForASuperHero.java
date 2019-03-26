public class SMSZeroForASuperHero {

    private long code;
    Avengers avengers = new Avengers();

    public SMSZeroForASuperHero(String input) {
        code = Long.parseLong(input.split(" ")[1]);
    }

    public String filterSuperHeroName() {
        String superHeroName = avengers.getSuperHeroName(code);
        return superHeroName;
    }
}
