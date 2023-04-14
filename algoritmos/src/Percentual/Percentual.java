package Percentual;

public class Percentual {

    public static void main(String[] args) {


        double total = 0, percentual;
        double[] faturamento = new double[5];
        faturamento[0] = 67836.43;
        faturamento[1] = 36678.66;
        faturamento[2] = 29229.88;
        faturamento[3] = 27165.48;
        faturamento[4] = 19849.53;

        for(double f:faturamento){
            total = total+f;
        }
        System.out.print("PERCENTUAL DE REPRESENTAÇÃO DE FATURAMENTO POR ESTADO:");
        for(double f:faturamento){
            percentual= (f*100)/total;
            System.out.printf("\n%.2f", percentual);
        }



    }
}
