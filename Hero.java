public class Hero {

    private String name;

    private int age;

    private boolean glutenIntolerant;

    public Hero(String name, int age, boolean glutenIntolerant) {

        this.name = name;
        this.age = age;
        this.glutenIntolerant = glutenIntolerant;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isGlutenIntolerant() {
        return glutenIntolerant;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGlutenIntolerant(boolean glutenIntolerant) {
        this.glutenIntolerant = glutenIntolerant;
    }
}