public class Main {
    public static void main(String[] args){
        Sound sond = new Cat();
        NameCat cat = new NameCat();

        sond.getSound("мяу");

        sond = cat;

        sond.getSound("Анфиса");
    }
}
