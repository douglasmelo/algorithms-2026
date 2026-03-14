// package com.learning;

public class ModifierValidation {
    public static void main(String[] args) {
        Modifiers obj = new Modifiers();
        System.out.println(obj.publicMessage);
        obj.publicMessage = "New value for Public message";
        System.out.println(obj.publicMessage);

        // System.out.println(obj.protectedMessage);
        // obj.protectedMessage = "New value for Protected message";
        // System.out.println(obj.protectedMessage);

        // System.out.println(obj.defaultMessage);
        // obj.defaultMessage = "New value for Default message";
        // System.out.println(obj.defaultMessage);

        // System.out.println(obj.privateMessage);
        // obj.privateMessage = "New value for Private message";
        // System.out.println(obj.privateMessage);
    }
}
