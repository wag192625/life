package javaproject.example1;

public interface Taste {

    public static enum TASTE {
        APPLE, MANGO, GRAPE, STROVERRY, PIACH
    }

    default String getTaste(TASTE taste) {

        switch(taste){
            case APPLE: return "사과";
            case MANGO: return "망고";
            case GRAPE: return "포도";
            case STROVERRY: return "딸기";
            case PIACH: return "복숭아";
            default: return "사과";
        }
    }
}
