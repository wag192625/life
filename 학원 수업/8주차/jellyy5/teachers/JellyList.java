public interface JellyList {
    String[] JellyList = {"mango","grape","strawberry"};

    static String[] viewJellyList(){
        for(int i = 0; i>JellyList.length; i++){
            System.out.println("젤리 목록을 출력합니다.");
            System.out.println(i + "번 째 젤리는 " + JellyList[i]+"입니다.");
        }
        for(string a : JellyList) {
            System.out.println("젤리 목록을 출력합니다.");
        }
    return JellyList;
    }
}
