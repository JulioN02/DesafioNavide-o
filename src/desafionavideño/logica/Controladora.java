package desafionavideño.logica;

import java.util.Random;

public class Controladora {

    //metodo para determinar la cantidad del emoji elegido que aparecen en la matriz 
    public int determinarCantidadEmoji(String emoji, int cantidad, String matriz[][]) {
        int cantidadEncontrada=0;
        for (int f=0;f<4;f++){
            for(int c=0;c<4;c++){
                if(matriz[f][c].equals(emoji)){
                cantidadEncontrada++;
                }
            }
        }
        return cantidadEncontrada;
    }

    //generar la matriz con los emojis de manera aleatoria
    public String[][] generarMatriz() {
        Random random = new Random();
        String [] emojis={"🎄","🎅","⭐","🎁"};
        String[][] matriz=new String[4][4];
        for (int f=0;f<4;f++){
            for(int c=0;c<4;c++){
                matriz[f][c]=emojis[random.nextInt(emojis.length)];
            }
        }
        return matriz;
    }
}
