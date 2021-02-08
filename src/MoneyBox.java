import java.util.Scanner;

/**
 * Clase principal.
 *
 * @author Cristhian C
 */
public class MoneyBox {
    
    /** Valor de la moneda de 100. */
    public static final int COIN_100 = 100;
    /** Valor de la moneda de 200. */
    public static final int COIN_200 = 200;
    /** Valor de la moneda de 500. */
    public static final int COIN_500 = 500;
    /** Valor de la moneda de 1000. */
    public static final int COIN_1000 = 1000;
    
    /**
     * Método principal, donde se encuentran las intrucciones de ejecución.
     * @param args Parametros de ejecución.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        System.out.println("Bienvenido a la alcancía virtual.");    
        int[] moneyBox = new int[50];
        int action;
        do {
            System.out.println("\n¿Qué desea hacer?\n" + 
                               "1. Ingresar monedas.\n" + 
                               "2. ¿Cuantas monedas en total hay?\n" + 
                               "3. ¿Cuanto dinero hay?\n" + 
                               "4. Saber cuantas monedas de X valor hay.\n" + 
                               "5. Saber cuánto dinero tienes con X valor de moneda.\n" + 
                               "6. Salir.");
            action = sc.nextInt();
            menuOption(action, moneyBox);
        }
        while (action != 7);
        System.out.println("Gracias por usarme.");
        sc.close();
    }
    
    /**
     * Éste método muestra el menú de funciones.
     * @param action Opción del menú.
     * @param moneyBox Alcancía.
     * */
    private static void menuOption(int action, int[] moneyBox) {
        switch (action) {
            case 1:
                MoneyBox.menuInsertCoins(moneyBox);
                break;
            case 2:
                MoneyBox.totalCoins(moneyBox);
                break;
            case 3:
                MoneyBox.totalMoney(moneyBox);
                break;
            case 4:
                MoneyBox.menuCoinsQuantity(moneyBox);
                break;
            case 5:
                MoneyBox.menuTotalCoinsMoney(moneyBox);
                break;
            case 6:
                System.out.println("Gracias por usarme.");
                System.exit(0);
                break;
            default:
                System.out.println("Ingresa una opción correcta. ");
                break;
        }
    }
    
    /**
     * Método que llama al menú de inserción de monedas.
     * @param moneyBox Alcancia.
     * */
    private static void menuInsertCoins(int[] moneyBox) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué monedas deseas ingresar?\n" + 
            "1. Monedas de $100.\n" + 
            "2. Monedas de $200.\n" + 
            "3. Monedas de $500.\n" + 
            "4. Monedas de $1000.\n" +
            "5. Volver");
        int actionMenuInsertCoins = sc.nextInt();
        switch (actionMenuInsertCoins) {
            case 1:
                MoneyBox.insertCoins(moneyBox, COIN_100);
                break;
            case 2:
                MoneyBox.insertCoins(moneyBox, COIN_200);
                break;
            case 3:
                MoneyBox.insertCoins(moneyBox, COIN_500);
                break;
            case 4:
                MoneyBox.insertCoins(moneyBox, COIN_1000);
                break;
            case 5:
                break;
            default:
                System.out.println("Ingrese una opción válida.");
                break;
        }
    }
    
    /**
     * Este método ingresará las monedas dentro de un arreglo llamado moneyBox.
     * @param coin Moneda 
     * @param moneyBox Alcancía
     */
    private static void insertCoins(int[] moneyBox, int coin) {
        Scanner sc = new Scanner(System.in);
        int coinQuantity;
        int cicleArray;
        System.out.println("¿Cuantas deseas ingresar?");
        coinQuantity = sc.nextInt();
        cicleArray = coinQuantity;
        for (int i = 0; i < cicleArray; i++) {
            if (moneyBox[i]==0) {
                    moneyBox[i] = coin;
            } else {
                cicleArray = cicleArray + 1;
            }
        }
        System.out.println("Se han ingresado " + coinQuantity + " monedas de $" + coin);
        
    }
    
    /**
     * Este método muestra la cantidad de monedas dentro de la alcancía.
     * @param moneyBox Alcancía
     */
    private static void totalCoins(int[] moneyBox) {
        int counterArray = 0;
        for (int i = 0; i < moneyBox.length; i++) {
            if (moneyBox[i]!=0) {
                counterArray = counterArray + 1;
            }     
        }
        System.out.println("En la alcancía se encuentran " + counterArray + " monedas.");
    }
    
    /**
     * Éste método se encarga de sumar todo el dinero almacenado en la alcancía.
     * @param moneyBox Alcancía.
     * */
    private static void totalMoney(int[] moneyBox) {
        int counterMoney = 0;
        for (int i = 0; i < moneyBox.length; i++) {
            counterMoney = counterMoney + moneyBox[i];
        }
        System.out.println("El dinero total de la alcancía es: $" + counterMoney + " pesos.");
    }
    
    /**
     * Éste método se encarga de mostrar el menú de cual moneda que se desea contar.
     * @param moneyBox Alcancía.
     * */
    private static void menuCoinsQuantity(int[] moneyBox) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué moneda deseas contar?\n" + 
            "1. Monedas de $100.\n" + 
            "2. Monedas de $200.\n" + 
            "3. Monedas de $500.\n" + 
            "4. Monedas de $1000.\n" +
            "5. Volver");
        int actionMenuInsertCoins = sc.nextInt();
        switch (actionMenuInsertCoins) {
            case 1:
                System.out.println("Se encontraron " + MoneyBox.checkCoinsQuantity(moneyBox, COIN_100) + " de $" + COIN_100);
                break;
            case 2:
                System.out.println("Se encontraron " + MoneyBox.checkCoinsQuantity(moneyBox, COIN_100) + " de $" + COIN_200);
                break;
            case 3:
                System.out.println("Se encontraron " + MoneyBox.checkCoinsQuantity(moneyBox, COIN_100) + " de $" + COIN_500);
                break;
            case 4:
                System.out.println("Se encontraron " + MoneyBox.checkCoinsQuantity(moneyBox, COIN_100) + " de $" + COIN_1000);
                break;
            case 5:
                break;
            default:
                System.out.println("Digita una opción correcta.");
                break;
        }
    }
    
    /**
     * Éste método se encarga de contar las monedas de x cantidad almacenadas en la alcancía.
     * @param moneyBox Alcancía.
     * @param coin Moneda.
     * @return counterArray contador.
     * */
    private static int checkCoinsQuantity(int[] moneyBox, int coin) {
        int counterArray = 0;
        for (int i = 0; i < moneyBox.length; i++) {
            if (moneyBox[i]==coin) {
                counterArray = counterArray + 1;
            }
        }
        
        return counterArray;
    }

    /**
     * Método que llama al menú de monedas a contar.
     * @param moneyBox Alcancia.
     * */
    private static void menuTotalCoinsMoney(int[] moneyBox) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué moneda deseas contar?\n" + 
            "1. Monedas de $100.\n" + 
            "2. Monedas de $200.\n" + 
            "3. Monedas de $500.\n" + 
            "4. Monedas de $1000.\n" +
            "5. Volver");
        int actionMenuInsertCoins = sc.nextInt();
        switch (actionMenuInsertCoins) {
            case 1:
                System.out.println("Se encontraron $" + MoneyBox.totalCoinsMoney(moneyBox, COIN_100) + " en monedas de $" + COIN_100);
                break;
            case 2:
                System.out.println("Se encontraron $" + MoneyBox.totalCoinsMoney(moneyBox, COIN_100) + " en monedas de $" + COIN_200);
                break;
            case 3:
                System.out.println("Se encontraron $" + MoneyBox.totalCoinsMoney(moneyBox, COIN_100) + " en monedas de $" + COIN_500);
                break;
            case 4:
                System.out.println("Se encontraron $" + MoneyBox.totalCoinsMoney(moneyBox, COIN_100) + " en monedas de $" + COIN_1000);
                break;
            case 5:
                break;
            default:
                System.out.println("Digita una opción correcta.");
                break;
        }
    }
    
    /**
     * Método que se encarga de sumar el valor de dinero en X monedas
     * @param moneyBox Alcancía.
     * @param coin Moneda.
     * @return valor total en X monedas.
     * */
    private static int totalCoinsMoney(int[] moneyBox, int coin) {
        int counterArray = 0;
        for (int i = 0; i < moneyBox.length; i++) {
            if (moneyBox[i]==coin) {
                counterArray = counterArray + 1;
            }
        }
        return counterArray * coin;
    }

}
