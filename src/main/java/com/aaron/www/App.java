package com.aaron.www;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Expression expression = new ExpressionBuilder("3+2").build();
        double result = expression.evaluate();
        System.out.println(result);
    }
}
