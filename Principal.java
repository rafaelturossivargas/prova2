pacote  br.ulbra.classes ;

importar  java.util.Scanner ;

 diretor de classe  pública 
{
 public  static  void  main ( String [] args )
         
    {
        Scanner ler =  new  Scanner ( System . in);
        IMC imc =  novo  IMC ();
        
        Sistema . fora . println( " Digite aqui o seu nome: " );
        im . setNome(ler . nextLine());
        
        Sistema . fora . println( " Digite aqui a sua altura: " );
        im . setAltura(ler . nextDouble());
        
        Sistema . fora . println( " Digite aqui o seu peso: " );
        im . setPesoAtual(ler . nextDouble());
        
        im . calcularIMC();
    }
 
}
