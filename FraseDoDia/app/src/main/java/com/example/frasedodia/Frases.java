package com.example.frasedodia;

import java.util.Random;

public class Frases {
    int num = new Random().nextInt(24);
    String[] frases = {
            "Não lamente o que podia ter e se perdeu por caminhos errados e nunca mais voltou.",
            "Há três coisas na vida que nunca voltam atrás: a flecha lançada, a palavra pronunciada e a oportunidade perdida.",
            "Quando a vida te decepciona, qual é a solução? Simplesmente continue a nadar.",
            "Maior que a tristeza de não haver vencido é a vergonha de não ter lutado!",
            "Quando a vida te decepciona, qual é a solução? Simplesmente continue a nadar",
            "O número dos que nos invejam confirma as nossas capacidades.",
            "A vida é muito importante para ser levada a sério.",
            "Não basta conquistar a sabedoria, é preciso usá-la. ",
            "É melhor conquistar a si mesmo do que vencer mil batalhas.",
            "A minha vontade é forte, porém minha disposição de obedecer-lhe é fraca.",
            "O importante não é vencer todos os dias, mas lutar sempre.",
            "O homem digno ganha para viver; o menos honesto vive para ganhar.",
            "Quem ousou conquistar e saiu pra lutar, chega mais longe!",
            "Enquanto houver vontade de lutar haverá esperança de vencer.",
            "Viver significa lutar.",
            "A alegria evita mil males e prolonga a vida.",
            "Difícil é ganhar um amigo em uma hora; fácil é ofendê-lo em um minuto.",
            "O medo de perder tira a vontade de ganhar.",
            "Melhor lutar por algo do que viver para nada.",
            "Aquele que não tem confiança nos outros, não lhes pode ganhar a confiança.",
            "Escolher o seu tempo é ganhar tempo.",
            "Perder para a razão, sempre é ganhar.",
            "Muitos sabem ganhar dinheiro, mas poucos sabem gastá-lo.", // 23

    };
    public String geradorFrases(){
        return frases[num];
    }
}
