package Strings;

public class shortestPath {
    static int pathFind(String location) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < location.length(); i++) {
            switch (location.charAt(i)) {
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                case 'S':
                    y--;
                    break;
                case 'N':
                    y++;
                    break;
                default:
                    break;
            }
        }

        return (int) Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        String location = "WNEENESENNN";
        System.out.println(pathFind(location));
    }
}
