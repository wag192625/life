package javaproject.example1;

public interface Action {

    public static enum ACTION {
        EAT, DRINK, CHEW
    }

    public void eat();
    public void choice();

    default public String getAction(ACTION action) {
        switch(action) {
            case EAT : return "먹습니다.";
            case DRINK : return "마십니다.";
            case CHEW : return "씹습니다.";
            default: return "먹습니다.";
        }
    }
}
