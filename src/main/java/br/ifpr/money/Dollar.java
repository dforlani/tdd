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
class Dollar extends Money{

   

    Dollar(int amount) {
        this.amount = amount;
    }

   Money times(int multiplier)  {
      return new Dollar(amount * multiplier);
   }	
   
   String currency() {
       return "USD";
    }

    
}
