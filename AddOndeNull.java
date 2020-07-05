/*
	@author  Robson Dornelles Ruiz
	@version 2.0
	@email   robsondorn@gmail.com
*/

package listasequencial;

public class AddOndeNull {
    private String[] filmesPreferidos;
    private int proximoIndice;
    
    int contVazia = 0, contCheia = 0, indice = 0, posicao = 0;
    
    public void verificarLista(){
        for(indice = 0; indice < filmesPreferidos.length; indice++){
            if(filmesPreferidos[indice] == null){
            	contVazia++;
                
                if(contVazia == filmesPreferidos.length){
                	contVazia = 0;
                    vazia();
                }
            }
            else if(filmesPreferidos[indice]!=null){
            	contCheia++;
                
                if(contCheia == filmesPreferidos.length){
                	contCheia = 0;
                    cheia();
                }
            }
        }
    }
    
    public void adicionaPosicaoY(String dado, int posicao){
        for(indice = proximoIndice; indice < filmesPreferidos.length; indice--){
            if(indice >= posicao){ 
                filmesPreferidos[indice] = filmesPreferidos[indice-1];    
            } 
        }
       
        filmesPreferidos[posicao] = dado;
        proximoIndice++;   
    }
    
    public void adicionaInicio(String dado){ 
    	//... substitui as posições dos filmes já adicionados para poder colocar o filme que vem por parâmetro no início
        for(indice = proximoIndice; indice < filmesPreferidos.length; indice--){ 
        	// garante que uma posição inexistente não seja acessada causando erro
            if(indice > 0) {    
                filmesPreferidos[indice] = filmesPreferidos[indice-1];
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
        for(int indice = 0; indice < filmesPreferidos.length; indice++){
            if(filmesPreferidos[indice] == dado){
                filmesPreferidos[indice] = filmesPreferidos[indice+1];
                proximoIndice--;
                filmesPreferidos[indice] = filmesPreferidos[indice+1];
                    
                if(filmesPreferidos[indice] == null){
                	break;
                }
            }
        }
    }
    
    public void adicionar(String novoDado){
        filmesPreferidos[proximoIndice] = novoDado;
        proximoIndice++;
    }
    
    public void imprimeFilmesPreferidos(){
        for(indice = 0; indice < proximoIndice; indice++){
            System.out.println(filmesPreferidos[i]);         
        }
    }
    
    public boolean vazia(){
        System.out.println("Vazia");
        return proximoIndice == 0;  
    }
   
    public boolean cheia(){
        System.out.println("Cheia");
        return proximoIndice == filmesPreferidos.length; 
    }
}
