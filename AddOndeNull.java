package listasequencial;

public class AddOndeNull {
    private String[] filmesPreferidos;
    private int proximoIndice;
    
    int contVazia = 0, contCheia = 0, posicao = 0;
    
    public void verificar(){
        for(posicao = 0; posicao < filmesPreferidos.length; posicao++){
            if(filmesPreferidos[posicao] == null){
            	contVazia++;
                
                if(contVazia == filmesPreferidos.length){
                    vazia();
                    System.out.println("Vazia");
                }
            }
            else if(filmesPreferidos[posicao]!=null){
            	contCheia++;
                
                if(contCheia == filmesPreferidos.length){
                    cheia();
                    System.out.println("Cheia");
                }
            }
        }
    }
    
    int posicaoY = 0;
    
    public void adicionaPosicaoY(String dado, int posicaoY){
        for(posicao = proximoIndice; posicao < filmesPreferidos.length; posicao--){
            if(posicao >= posicaoY){ 
                filmesPreferidos[posicao] = filmesPreferidos[posicao-1];    
            } 
        }
       
        filmesPreferidos[posicaoY] = dado;
        proximoIndice++;   
    }
    
    public void adicionaInicio(String dado, int posicaoY){ 
        for(posicao = proximoIndice; posicao < filmesPreferidos.length; posicao--){
            if(posicao > posicaoY){
                filmesPreferidos[posicao] = filmesPreferidos[posicao-1];
            } 
        }
       
        filmesPreferidos[0] = dado;
        proximoIndice++;
    }
    
    public AddOndeNull(int tamanho){
        filmesPreferidos = new String[tamanho];
        proximoIndice = 0;        
    }
    
    public void remover(String dado){
        boolean troca = false;
        int a = 0, b = 0;
        
        for(posicao = 0; posicao < filmesPreferidos.length; posicao++){
            if(filmesPreferidos[posicao] != null && filmesPreferidos[posicao].equals(dado)){
                filmesPreferidos[posicao] = filmesPreferidos[posicao+1];
                troca = true;
                proximoIndice--;
                
                if(troca){
                    filmesPreferidos[posicao] = filmesPreferidos[posicao+1];
                    
                    if(filmesPreferidos[posicao] == null){
                        break;
                    }   
                }   
            }   
        }
    }
    
    public void adicionar(String novoDado){
        filmesPreferidos[proximoIndice] = novoDado;
        proximoIndice++;
    }
    
    public void imprimeFilmesPreferidos(){
        for(posicao = 0; posicao < proximoIndice; posicao++){
            System.out.println(filmesPreferidos[i]);         
        }
    }
    
    public boolean vazia(){
        return proximoIndice == 0;  
    }
   
    public boolean cheia(){
        return proximoIndice == filmesPreferidos.length; 
    }
}