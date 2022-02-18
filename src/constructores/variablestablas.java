package constructores;

public class variablestablas{

/*Todo los atributos*/
    char codigopro;
    String nombrepro;
    int cantidadpro;
    int valorpro;
    int stockmax;
    int stockmin;
    
    
   

public variablestablas(){}

/*Todo los codigos get*/
    public char getcodigopro(){
        return codigopro;
    }
    public String getnombrepro(){
        return nombrepro;
    }
    public int  getcantidadpro(){
        return cantidadpro;
    }
    public int getvalorpro(){
        return valorpro;
    }
    public int getstockmax(){
        return stockmax;
    }
    public int getstockmin(){
        return  stockmin;
    }


/*Todo los codigos set*/
    public void setCodigo(char codigopro){
        this.codigopro = codigopro;
    }
    public void setNombre(String nombrepro){
        this. nombrepro = nombrepro;
    }
    public void setcantidadpro(int cantidadpro){
        this.cantidadpro = cantidadpro;
    }
    public void setvalorpro(int valorpro){
        this.valorpro = valorpro;
    }
     public void setstockmax(int stockmax){
        this.stockmax = stockmax;
    }
      public void setstockmin(int stockmin){
        this.stockmin =stockmin;
    }

}
