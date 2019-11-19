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
abstract class Money {

    protected int amount;

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    static Dollar dollar(int amount) {
        return new Dollar(amount);
    }
    
    static Money franc(int amount) {
      return new Franc(amount);
    }

    abstract Money times(int multiplier);
}
