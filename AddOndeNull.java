package listasequencial;

public class AddOndeNull {
    private String[] vetor;
    private int proximoIndice;
    
    int a = 0, b = 0, i = 0;
    
    public void verificar(){
        for(i = 0; i < vetor.length; i++){
            if(vetor[i] == null){
                a++;
                
                if(a == vetor.length){
                    vazia();
                    System.out.println("Vazia");
                }
            }
            else if(vetor[i]!=null){
                b++;
                
                if(b == vetor.length){
                    cheia();
                    System.out.println("Cheia");
                }
            }
        }
    }
    
    int j = 0;
    int y = 0;
    
    public void adicionaPosicaoY(String dado, int y){
        for(j = proximoIndice; j < vetor.length; j--){
            if(j >= y){ 
                vetor[j] = vetor[j-1];    
            } 
        }
       
        vetor[y] = dado;
        proximoIndice++;   
    }
    
    public void adicionaInicio(String dado, int y){ 
        for(j = proximoIndice; j < vetor.length; j--){
            if(j > y){
                vetor[j] = vetor[j-1];
            } 
        }
       
        vetor[0] = dado;
        proximoIndice++;
    }
    
    public AddOndeNull(int tamanho){
        vetor = new String[tamanho];
        proximoIndice = 0;        
    }
    
    public void remover(String dado){
        boolean troca = false;
        int a = 0, b = 0;
        
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] != null && vetor[i].equals(dado)){
                vetor[i] = vetor[i+1];
                troca = true;
                proximoIndice--;
                
                if(troca){
                    vetor[i] = vetor[i+1];
                    
                    if(vetor[i] == null){
                        break;
                    }   
                }   
            }   
        }
    }
    
    public void adicionar(String novoDado){
        vetor[proximoIndice] = novoDado;
        proximoIndice++;
    }
    
    public void imprimeVetor(){
        for(int i = 0; i < proximoIndice; i++){
            System.out.println(vetor[i]);         
        }
    }
    
    public boolean vazia(){
        return proximoIndice == 0;  
    }
   
    public boolean cheia(){
        return proximoIndice == vetor.length; 
    }
}