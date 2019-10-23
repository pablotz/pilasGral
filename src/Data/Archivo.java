package Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class Archivo {
    
    public String[] leerNombre() throws FileNotFoundException, IOException {
        //  Ruta del archivo
        File file = new File("data/chido.xls");

        //  Consume la ruta del archivo - crea un archivo de tipo workbook
        HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream(file));

        //  Generamos una hoja de nuestro libro y la toma del indice que le estamos dando
        HSSFSheet sheet = wb.getSheetAt(0);
        
        //  La hoja 0 debe saber el ultimo renglon ocupado
        int rows = sheet.getLastRowNum()+1;
        
        //  Se dimensiona un arreglo con la cantidad que se leyó
        String[] nombre = new String[rows];
        for (int i = 0; i < rows; i++) {
            
            //  Leemos cada renglones de la hoja
            HSSFRow row = sheet.getRow(i);
            
            //  Leemos celdas y le damos su indice
            HSSFCell numCell = row.getCell(0);
            
            //  Decrementamos
            nombre[i] = numCell.getStringCellValue();
            
        }
        
        return nombre;

    }
    
    public String[] leerMarca() throws FileNotFoundException, IOException {
        //  Ruta del archivo
        File file = new File("data/palabras.xls");

        //  Consume la ruta del archivo - crea un archivo de tipo workbook
        HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream(file));

        //  Generamos una hoja de nuestro libro y la toma del indice que le estamos dando
        HSSFSheet sheet = wb.getSheetAt(0);
        
        //  La hoja 0 debe saber el ultimo renglon ocupado
        int rows = sheet.getLastRowNum()+1;
        
        //  Se dimensiona un arreglo con la cantidad que se leyó
        String[] marca = new String[rows];
        for (int i = 0; i < rows; i++) {
            
            //  Leemos cada renglones de la hoja
            HSSFRow row = sheet.getRow(i);
            
            //  Leemos celdas y le damos su indice
            HSSFCell numCell = row.getCell(1);
            
            //  Decrementamos
            marca[i] = numCell.getStringCellValue();

        }
        
        return marca;

    }
    
     public int[] leerNumero() throws FileNotFoundException, IOException {
        //  Ruta del archivo
        File file = new File("data/palabras.xls");

        //  Consume la ruta del archivo - crea un archivo de tipo workbook
        HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream(file));

        //  Generamos una hoja de nuestro libro y la toma del indice que le estamos dando
        HSSFSheet sheet = wb.getSheetAt(0);
        
        //  La hoja 0 debe saber el ultimo renglon ocupado
        int rows = sheet.getLastRowNum()+1;
        
        //  Se dimensiona un arreglo con la cantidad que se leyó
        int[] numeros = new int[rows];
        for (int i = 0; i < rows; i++) {
            
            //  Leemos cada renglones de la hoja
            HSSFRow row = sheet.getRow(i);
            
            //  Leemos celdas y le damos su indice
            HSSFCell numCell = row.getCell(2);
            
            //  Decrementamos
            numeros[i] = Integer.parseInt(numCell.getStringCellValue());

        }
        
        return numeros;

    }
     
    
    
}
