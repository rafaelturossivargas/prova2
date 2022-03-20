pacote  br.ulbra.classes ;

 classe  pública IMC 
{

     nome da string privada ;
    privada  dupla altura;
     peso duplo privadoAtual ;

     IMC público ()
            
    {
        
    }
    
    public  String  getNome ()
    {
        retornar nome;
    }

    public  void  setNome ( nome da string  )
    {
        isso . nome = nome;
    }

    public  double  getAltura ()
    {
        retornar altura;
    }

    public  void  setAltura ( double  altura )
    {
        isso . altura = altura;
    }

    public  double  getPesoAtual ()
    {
        devolver pesoAtual;
    }

    public  void  setPesoAtual ( double  pesoAtual )
    {
        isso . pesoAtual = pesoAtual;
    }

    public  void  calcularIMC ()
    {
       pesoAtual = pesoAtual / (altura * altura);
       
       if (pesoAtual <  18,5 )
       {
       Sistema . fora . println( " Você está abaixo do peso " );
       }
       senão  if ((pesoAtual >=  18.5 ) && (pesoAtual <=  24.9 ))
       {
       Sistema . fora . println( " Parabéns!!! Você está em seu peso normal! " );
       }
       senão  if ((pesoAtual >= 25.0 ) && (pesoAtual <= 29.9 ))
       {
           Sistema . fora . println( " Você está acima do seu peso ideal " );
       }
       senão  if ((pesoAtual >= 30.0 ) && (pesoAtual <= 34.9 ))
       {
           Sistema . fora . println( " Obesidade grau I " );
       }
       senão  if ((pesoAtual >= 35.0 ) && (pesoAtual <= 39.9 ))
       {
           Sistema . fora . println( " Obesidade grau II " );
       }
       senão  if (pesoAtual >= 40.0 )
       {
           Sistema . fora . println( " Obesidade grau III " );
       }
    }
}
