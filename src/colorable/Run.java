package colorable;

public class Run {
    public static void main(String[] args) {
        Shape[] hinhhoc = new Shape[4];
        hinhhoc[0] = new Square();

        for (Shape duyet: hinhhoc) {
            if(duyet == hinhhoc[0]){
                duyet.howToColor();
            }
        }

    }
}
