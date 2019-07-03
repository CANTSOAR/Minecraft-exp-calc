import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner lvl = new Scanner(System.in);
        int current, want, needed = 0, grandbottle, currentlvl = 0, wantlvl = 0, lapisore, emeronds;

        System.out.println("Current EXP level:");
        current = lvl.nextInt();

        System.out.println("Wanted EXP level:");
        want = lvl.nextInt();

        if(current < 0) {
            System.out.println("Invalid value, please try again");
        }
        else {

            if (current > -1 && current < 17) {
                currentlvl = current * current + (6 * current);
            } else if (current > 16 && current < 32) {
                currentlvl = (5 * current * current - 81 * current + 720) / 2;
            } else if (current > 31) {
                currentlvl = (9 * current * current - 325 * current + 4440) / 2;
            }
            if (want > -1 && want < 17) {
                wantlvl = want * want + (6 * want);
            } else if (want > 16 && want < 32) {
                wantlvl = (5 * want * want - 81 * want + 720) / 2;
            } else if (want > 31) {
                wantlvl = (9 * want * want - 325 * want + 4440) / 2;
            }

            needed = wantlvl - currentlvl;

            grandbottle = (needed / 1628);
            lapisore = (needed / 7) * 2;
            emeronds = needed / 5;

            if (needed % 1628 > 0){
                grandbottle++;
            }

            System.out.println("You need " + needed + " more exp");
            System.out.println("This can be done with:");
            System.out.println(grandbottle + " grand exp bottles");
            System.out.println(lapisore + " lapis ores");
            System.out.println(emeronds + " emeralds or diamonds");

        }
        }
    }
