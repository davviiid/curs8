package ro.fasttrackit.curs8;

public class Dog implements Animal {
    public String walk() {
        return "Dog-walking";
    }

    public String talk() {
        return "woof";
    }

    public String eat() {
        return "meat and water";
    }
}