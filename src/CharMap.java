public class CharMap {

    private static final int MAX_MAP_SIZE = 200;
    private char[][] map;

    public CharMap () {

        map = new char[2*MAX_MAP_SIZE][2*MAX_MAP_SIZE];  //taki jest maksymalny rozmiar wiatraczka

        for (int i = 0; i < map.length/2; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (j <= i || (j >= map.length/2 && j <= map.length-1-i)) {
                    map[i][j] = '*';
                    map[map.length-1-i][map.length-1-j] = '*';
                }
                else {
                    map[i][j] = '.';
                    map[map.length-1-i][map.length-1-j] = '.';
                }
            }
        }
    }

    public char[][] getMap () {
        return map;
    }
}
