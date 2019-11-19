/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpr.money;

/**
 *
 * @author aluno
 */
class Franc extends Money {

    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    private String currency;

    Franc(int amount) {
        this.amount = amount;
        currency = "CHF";
    }

    String currency() {
        return currency;
    }

}
