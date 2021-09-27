public class Main {

    public static void main(String[] args) {

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");



    }

    public static String pluralize(String anmName, int num) {
        if (num == 0 || num > 1) {
            return anmName + "s";
        }else if (num==1){
             return (anmName);
        }
        return anmName;
    }
}