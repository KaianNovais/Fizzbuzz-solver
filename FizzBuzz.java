public class FizzBuzz {
    
    public static void main(String[] args){
        
        //Varre todos os números de 1 a 100
        for(int i = 1; i <=100; i++){
            
          //se o número for divisível por 3, imprime FizzBuzz
          if(i % 3 == 0){
            System.out.println("FizzBuzz");
          }
            
          //se o número for divisível por 5, imprime Buzz
          else if(i % 5 == 0){
            System.out.println("Buzz");
              
           //se o número for divisível por 3 e 5, imprime Fizz
          } else if(i % 3 == 0 && i % 5 == 0){
            System.out.println("Fizz");
              
          } else {
            //Se não for divisível por 3 ou 5, mostra apenas o número
            System.out.println(i);
          }
          
        }
      }
}
