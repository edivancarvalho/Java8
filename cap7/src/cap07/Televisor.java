package cap07;

/**
 * |------------------------| | Televisor | |------------------------| |
 * +volume:int | +canal |------------------------| | +aumentarVolume():void | |
 * +reduzirVolume():void | | +trocarCanal(int canal): void | + mostrar():string
 * |
 */
/**
 *
 * @author edivan
 */
public class Televisor {

    public int volume;
    public int canal;

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVoluume() {
        volume--;
    }
    public void trocaCanal(){
        canal = 4;
    }
    public void mostrar(){
        System.out.println("Volume: "+ volume+ "/Canal: " + canal);
    }

}
