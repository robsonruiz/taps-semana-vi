/*
	@author  Robson Dornelles Ruiz
	@version 2.0
	@email   robsondorn@gmail.com
*/

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
                	contVazia = 0;
                    vazia();
                }
            }
            else if(filmesPreferidos[posicao]!=null){
            	contCheia++;
                
                if(contCheia == filmesPreferidos.length){
                	contCheia = 0;
                    cheia();
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
    	//... substitui as posi��es dos filmes j� adicionados para poder colocar o filme que vem por par�metro no in�cio
        for(posicao = proximoIndice; posicao < filmesPreferidos.length; posicao--){ 
        	// garante que uma posi��o inexistente n�o seja acessada causando erro
            if(posicao > 0) {    
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
        
        for(int posicao = 0; posicao < filmesPreferidos.length; posicao++){
            if(filmesPreferidos[posicao] == dado){
                filmesPreferidos[posicao] = filmesPreferidos[posicao+1];
                troca = true;
                proximoIndice--;
                
                if (troca){
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
        System.out.println("Vazia");
        return proximoIndice == 0;  
    }
   
    public boolean cheia(){
        System.out.println("Cheia");
        return proximoIndice == filmesPreferidos.length; 
    }
}