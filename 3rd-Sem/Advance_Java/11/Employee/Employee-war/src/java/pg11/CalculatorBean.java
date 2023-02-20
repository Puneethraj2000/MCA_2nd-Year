/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pg11;

import javax.ejb.Stateless;

/**
 *
 * @author mcacnj
 */
@Stateless
public class CalculatorBean implements CalculatorBeanLocal {
    @Override
    public float add(float x,float y){
        return(x+y);
    }
    @Override
    public float substract(float x,float y){
        return(x-y);
    }
    @Override
    public float multiply(float x,float y){
        return(x*y);
    }
    @Override
    public float division(float x,float y){
        return(x/y);
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
