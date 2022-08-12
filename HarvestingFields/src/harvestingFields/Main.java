package harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Class<RichSoilLand> richSoilLandClass = RichSoilLand.class;

        String command = scan.nextLine();

        Field[] fields = richSoilLandClass.getDeclaredFields();

        while (!command.equals("HARVEST")){

            if (command.equals("private")) {
                Arrays.stream(fields).forEach(field -> {
                    if(Modifier.isPrivate(field.getModifiers())) {
                        System.out.printf("%s %s %s%n", Modifier.toString(field.getModifiers()),
                                field.getType().getSimpleName(), field.getName());
                    }
                });
            } else if (command.equals("protected")){
                Arrays.stream(fields).forEach(field -> {
                    if(Modifier.isProtected(field.getModifiers())) {
                        System.out.printf("%s %s %s%n", Modifier.toString(field.getModifiers()),
                                field.getType().getSimpleName(), field.getName());
                    }
                });
            } else if (command.equals("public")) {
                Arrays.stream(fields).forEach(field -> {
                    if(Modifier.isPublic(field.getModifiers())) {
                        System.out.printf("%s %s %s%n", Modifier.toString(field.getModifiers()),
                                field.getType().getSimpleName(), field.getName());
                    }
                });
            } else if (command.equals("all")) {
                Arrays.stream(fields).forEach(field -> {
                    System.out.printf("%s %s %s%n", Modifier.toString(field.getModifiers()),
                            field.getType().getSimpleName(), field.getName());
                });
            }
            command = scan.nextLine();
        }
    }
}