/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj_assignment;

/**
 *
 * @author wsc2010
 */
public interface CalculatablePrice {
    double calcPrice(Dimension dim, double weight);
    double DIVISOR = 0.0005;
}
