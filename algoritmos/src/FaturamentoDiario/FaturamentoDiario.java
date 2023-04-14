package FaturamentoDiario;

/*Dado um vetor que guarda o valor de faturamento diário de uma distribuidora,
        faça um programa, na linguagem que desejar, que calcule e retorne:
        • O menor valor de faturamento ocorrido em um dia do mês;
        • O maior valor de faturamento ocorrido em um dia do mês;
        • Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

        IMPORTANTE:
        a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
        b) Podem existir dias sem faturamento, como nos finais de semana e feriados.
        Estes dias devem ser ignorados no cálculo da média;*/

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class FaturamentoDiario {

    public static void main(String[] args) {

        JSONArray faturamento;
        JSONParser parser = new JSONParser();


        try {
            faturamento = (JSONArray) parser.parse(new FileReader("C:\\Users\\Ericson\\IdeaProjects\\" +
                    "algoritmos\\src\\FaturamentoDiario\\dados.json"));

            double[] valor = new double[faturamento.size()];

            for(int i=0; i< faturamento.size(); i++){
                JSONObject diario = (JSONObject) faturamento.get(i);

                valor[i] = (double) diario.get("valor");
            }

            double maior=0;
            for (double value : valor) {
                if (maior < value) {
                    maior = value;
                }
            }
            System.out.printf("Maior faturamento do mês: R$" + "%.2f", maior);

            double menor = maior;
            for (double v : valor) {
                if (menor > v && v != 0) {
                    menor = v;
                }
            }
            System.out.printf("\nMenor faturamento do mês: R$" + "%.2f", menor);

            double media, soma=0;
            int cont=0;
            for (double v : valor) {
                if (v != 0) {
                    soma = soma + v;
                    cont++;
                }
            }
            media = soma/cont;
            System.out.printf("\nmédia: R$" + "%.2f", media);

            int dias=0;
            for (double v : valor) {
                if (v > media) {
                    dias++;
                }
            }
            System.out.println("\nNúmero de dias com faturamento acima da média: " +dias);















        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
