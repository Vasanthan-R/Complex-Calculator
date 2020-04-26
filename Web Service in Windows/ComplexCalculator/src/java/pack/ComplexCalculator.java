/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Vasanthan
 */
@WebService(serviceName = "ComplexCalculator")
public class ComplexCalculator {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "calculate")
    public String calculate(@WebParam(name = "name") String a,String b,String c,String op) {
        Integer num1 = Integer.parseInt(a);
        Integer num2 = Integer.parseInt(b);
        Integer num3 = Integer.parseInt(c);
        
        Integer res = new Integer(0);
        Double res1 = new Double(0);
        
        if(op.equals("Addition"))
        {
            res=num1+num2;
            return String.valueOf(res);
        }
        else if(op.equals("Subtraction"))
        {
            res=num1-num2;
            return String.valueOf(res);
        }
        else if(op.equals("Multiplication"))
        {
            res=num1*num2;
            return String.valueOf(res);
            
        }
        else if(op.equals("Division"))
        {
            res=num1/num2;
            return String.valueOf(res);
        }
        else if(op.equals("power"))
        {
            res1=Math.pow(num1,num2);
            return String.valueOf(res1);
        }
        else if(op.equals("log"))
        {
            res1=Math.log10(num1);
            return String.valueOf(res1);
        }
        else if(op.equals("interest"))
        {
            res=(num1*num2*num3)/100;
            return String.valueOf(res);
        }
        
        return "NULL";
    }
}