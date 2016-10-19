/*
Copyright (c) 2016. Kayo Martins Freitas
 */
package com.github.kayo08.aula07;

/**
 * Esta classe será usada para o desenvolvimento do exercício da aula07 proposto.
 * pelo professor Fábio Nogueira. O algoritmo ira identificar o dia da semana
 * pela data informada pelo usuário.
 *
 * @author Kayo Martins
 */
public class Calendario {

    public static int diaSemana(int data, int bissexto, int conhecida, int ds) {
      //variavei destinadas a "data".
        int ano, mes, dia, aux;

      //Variaveis destinadas a "conhecida".
        int anoC, mesC, diaC, auxC;

        int contaAno = 0;
        int auxBi;
        int verifBi;
        int i = 0;

        ano = data / 10000;

        aux = data % 10000;
        mes = aux / 100;

        dia = data % 100;

        anoC = conhecida / 10000;

        auxC = conhecida % 10000;
        mesC = auxC / 100;

        diaC = conhecida % 100;

        if(ano <= 999 || ano >= 10000 || mes < 1 || mes > 12 || dia < 1) {
            return -1;
        }

        /*Se o numero indicador do mês for um número PAR, então se presume
         * que o mes possui 30 dias.
         */
        if(mes / 2 == 0) {
            if(dia > 30) {
                return -1;
            }
        }
        /*Se o numero indicador do mês for um número IMPAR, então se presume
         * que o mes possui 31 dias.
         */
        if(mes / 2 != 0) {
            if(dia > 31) {
                return -1;
            }
        }
        
        /**
         * Contabiliza a diferença de anos entre a variavel "bissexto" e o ano 
         * fornecido pelo usuario.
         */
        auxBi = bissexto;
        while (auxBi <= ano) {
            contaAno++;
            auxBi++;
        }

        //Caso o "ano" seja bissexto, verifica o mês de Fevereiro.
        if(contaAno % 4 == 0) {
            if(mes == 2 && mes > 29) {
                return -1;
            }
        }

        //Caso o "ano" não seja bissexto, verifica o mês de Fevereiro.
        if(contaAno % 4 != 0) {
            if(mes == 2 && mes > 28) {
                return -1;
            }
        }

        verifBi = contaAno % 4;

        while (i == 0) {

            while (diaC <= dia) {

            }
        }
        
        return 0;
    }
}
