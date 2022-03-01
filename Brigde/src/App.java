public class App {
    public static void main(String[] args) throws Exception {
        FormularioMatriculacionPortugal formulario1 = new  
           FormularioMatriculacionPortugal(new FormHtmlImpl());  
         formulario1.visualiza();  
         if (formulario1.administraZona())  
             formulario1.generaDocumento();  
         System.out.println();  
         FormularioMatriculacionEspania formulario2 = new  
           FormularioMatriculacionEspania(new FormAppletImpl());  
         formulario2.visualiza();  
         if (formulario2.administraZona())  
             formulario2.generaDocumento();
    }
}
