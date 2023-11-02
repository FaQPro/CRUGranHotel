

package crudelgranhotel;

import static java.time.Clock.offset;
import static javax.management.Query.attr;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

/**
FACUPRO
 */
public class FiltrosValidaciones extends DocumentFilter{
    public static final char SOLO_NUMEROS ='N';
    public static final char SOLO_LETRAS ='L';
    public static final char NUM_LETRAS ='M';
    public static final char DEFAULT ='*';
    
    private char tipoEntrada;
    private int longitudCadena=0;

    public FiltrosValidaciones() {
        tipoEntrada=DEFAULT;
        
    }

    public FiltrosValidaciones(char tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }
    
        public FiltrosValidaciones(char tipoEntrada, int longitudCadena) {
        this.tipoEntrada = tipoEntrada;
        this.longitudCadena = longitudCadena;
    }
    
    
    @Override
    public void replace(FilterBypass fb, int i, int i1, String string, AttributeSet as) throws BadLocationException {
        if(esValido(string))
            {
            if(this.longitudCadena == 0 || longitudActual<longitudCadena)
                    fb.insertString(offset, string, attr);
            }
    }

    @Override
    public void insertString(FilterBypass fb, int i, String string, AttributeSet as) throws BadLocationException {
        if(string==null)
            return;
        else{
            Document dc = fb.getDocument();
            int longitudActual = dc.getLength();
            if(esValido(string))
            {
                if(this.longitudCadena == 0 || longitudActual<longitudCadena)
                    fb.insertString(offset, string, attr);
            }
        }
    }

    @Override
    public void remove(FilterBypass fb, int i, int i1) throws BadLocationException {
        super.remove(fb, i, i1); //To change body of generated methods, choose Tools | Templates.
    }
    
    private boolean esValido (String valor){
        char [] letras = valor.toCharArray();
        boolean valido = false;
        for (int i = 0; i < letras.length; i++) 
        
        {
           switch(tipoEntrada) 
           {
               case SOLO_NUMEROS:
                    if(Character.isDigit(letras[i]))
                        valido=true;
                    break;
               case SOLO_LETRAS:
                    if(Character.isLetter(letras[i]))
                        valido=true;
               case NUM_LETRAS:
                   if(Character.isLetterOrDigit(letras[i]))
                        valido=true;
                    
                    break; 
               case DEFAULT:
                   valido=true;
                   break;
               default:
                   valido = false;
           }
           if(valido)
               break;
         }
        return valido;
       
    
    }
    
    
}
