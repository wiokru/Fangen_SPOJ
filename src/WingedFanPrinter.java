import enums.FanDirection;

public class WingedFanPrinter {

    private char[][] map;

    public WingedFanPrinter (CharMap wingMap) {
        this.map = wingMap.getMap();
    }

    private void printClockwise (int size) {  //wybranie srodkowej czesci o zadanym rozmiarze

        for (int i=map.length/2 - size; i < map.length/2 + size; i++){
            for (int j=map[i].length/2 - size; j<map[i].length/2 + size; j++ ){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    private void printCounterClockwise (int size){ //srodkowa czesc o zadanym rozmiarze, ale czytana od prawej do lewej

        for (int i=map.length/2 + size -1; i >= map.length/2 - size; i--){
            for (int j=map[i].length/2 - size; j<map[i].length/2 + size; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
    public void printFan (int size, FanDirection direction) {

        if (direction == FanDirection.Clockwise)
            printClockwise(size);
        else
            printCounterClockwise(size);
    }

}


