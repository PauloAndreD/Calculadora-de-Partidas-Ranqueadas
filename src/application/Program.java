package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de vitorias do jogador: ");
        int vitorias = sc.nextInt();
        System.out.print("Digite o numero de derrotas do jogador: ");
        int derrotas = sc.nextInt();

        int saldo = saldoDeVitorias(vitorias, derrotas);
        String nivel = nivelJogador(saldo);

        System.out.println("O Herói tem de saldo de " + saldo + " vitorias e está no nível de " + nivel);
        sc.close();
    }
    static int saldoDeVitorias(int vitorias, int derrotas) {
        int saldo = vitorias - derrotas;
        return saldo;
    }
    static String nivelJogador(int saldo) {
        String nivel;
        
        if (saldo <= 10) {
            nivel = "Ferro";
        } else if (saldo > 10 && saldo <= 20) {
            nivel = "Bronze";
        } else if (saldo > 20 && saldo <= 50) {
            nivel = "Prata";
        } else if (saldo > 50 && saldo <= 80) {
            nivel = "Ouro";
        } else if (saldo > 80 && saldo <= 90) {
            nivel = "Diamante";
        } else if (saldo > 90 && saldo < 100) {
            nivel = "Lendário";
        } else {
            nivel = "Imortal";
        }
        return nivel;
    }
}
