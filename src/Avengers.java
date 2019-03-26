import java.util.ArrayList;
import java.util.List;

public class Avengers {

    private List<SuperHero> SuperHerosList;
    private CodeGenerator codeGenerator;
    private String[] superHerosNames;

    public Avengers() {
        SuperHerosList = new ArrayList<>();
        codeGenerator = new CodeGenerator();
        superHerosNames = new String[]{"THOR", "SUPERMAN", "ROBIN", "IRONMAN", "GHOSTRIDER", "CAPTAINAMERICA", "FLASH", "WOLVERINE", "BATMAN", "HULK", "BLADE", "PHANTOM", "SPIDERMAN", "BLACKWIDOW", "HELLBOY", "PUNISHER"};
        for(String name : superHerosNames){
            SuperHerosList.add(new SuperHero(name,codeGenerator.generateCode(name)));
        }
    }

    public String getSuperHeroName(long code){
        for(SuperHero hero : SuperHerosList){
            if(hero.match(code)){
                return hero.getName();
            }
        }
        return "";
    }
}
