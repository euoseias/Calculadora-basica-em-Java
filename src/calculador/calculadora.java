/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculador;

/**
 *
 * @author Oséias Raamos
 */
public class calculadora {
        double resultado;
        
    double v1;
    double v2;
    int op;
    
    //metados parametros................................. 
    
    void setv1(double v1){
        this.v1=v1;
    }
    
    void setv2(double v2){
        this.v2=v2;
    }
    
    void setop(int op){
        this.op=op;
    }
    
    //metados parametros................................. 
    
    double calc(){
    switch(op){// operação a ser realizada
        case 1:
            resultado = v1+v2;
            break;
        // soma
         
        case 2:
            resultado = v1-v2;
            break;
       //Subtraçao
            
        case 3:
           resultado = v1*v2;
            break;
       //Multiplicaçao
            
            case 4:
                if(v2==0)
                    resultado = 0;
                else
                resultado = v1/v2;
            break;
            default: // caso nao encontra os valores 
                resultado = 0;
                break;
                
            case 5:
                resultado= Math.pow(v1,v2);
                break;
            case 6:
                covert();
                resultado= Math.sin(v1);
                break;
                
            case 7:
                covert();
                    resultado= Math.cos(v1);
                break;
                
                case 8:
                covert();
                    resultado= Math.tan(v1);
                break;
                
                case 9:
                    resultado= Math.log(v1);
                    break;
                    
                  case 10:
                    resultado= Math.sqrt(v1);
                    break;
                    
                      case 11:
                    resultado= Math.exp(v1);
                    break;
                    
                     case 12:
                    resultado= (v1%v2);
                    break;
                    
                    
                    
                
                    
                
                        
                        
               
                
            
    }
        
        return resultado;
        /*
        1-. operacao "+"
        2-. operacao "-"
        3-. operacao "*"
        4-. operacao "/"
        */
    
}
    void covert(){
        double rad= 0.0174533;
        v1=v1*rad;  
    }
    
}

    

