package hyperion.com.training.basic;
/*
Created by Hiram Padilla
*/
public class Addition
{
  int k = 10, a = 9;

  //método para hacer la suma
  public int add()
  {
    int result = a + b;
    return result;
  }

  public static void (String [] args)
  { //instanciar objeto de la clase
    Addition sumar = new Addition();
    System.out.print(sumar.add());//imprimir el valor que regresa "add"
  }
}
