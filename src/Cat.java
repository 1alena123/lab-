public class Cat implements Sound {
    @Override
    public void getSound(String n) {
        System.out.println("Метод getSound(), вызываемый со значением " + n);
    }
}
