/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pg11;

import javax.ejb.Local;

/**
 *
 * @author mcacnj
 */
@Local
public interface CalculatorBeanLocal {
    public float add(float x,float y);
    public float substract(float x,float y);
    public float multiply(float x,float y);
    public float division(float x,float y);
}
