package tiposDatos;

public class TiposPrimitivos {
    public static void main(String[] args){
        System.out.println("TIPO DE DATOS EN JAVA: ");
        byte tipoByte = 1;
        System.out.println("byte: "+ tipoByte+ " --Puede almanecenar 8 bits es decir un rango [-128, 127]." );

        short tipoShort = 20;
        System.out.println("short: "+tipoShort+ " --Puede almacenar 16 bits es  posible representar " +
                "cualquier valor en el rango [-32.768, 32.767].");

        int tipoInt = 3000;
        System.out.println("int: "+tipoInt+ " --Emplea 4 bytes de almacenamiento su rango de valores a" +
                " representar es -231 a 231-1.");

        long tipolong = 4233333;
        System.out.println("long: "+tipolong+ " --Tipo entero de mayor tamaño, 8 bytes (64 bits) su " +
                "rango es desde -263 a 263-1.");

        System.out.println("_____________TIPOS NUMERICOS EN PUNTO FLOTANTE_________________");

        float tipoFloat = 32.1F;
        System.out.println("float: "+tipoFloat+ " --Emplea un total de 32 bits, su rango es " +
                "de rango de 1.4x10-45 a 3.4028235x1038.");

        double tipoDouble = 521.23D;
        System.out.println("double: "+tipoDouble+ " Emplea 64 bits,esto le permite representar valores" +
                " en el rango de 4.9x10-324 a 1.7976931348623157x10308.");

        System.out.println("_______________BOOLEANOS Y CARACTERES________________");
        boolean tipoBool1 = true;
        boolean tipoBool2 = false;
        System.out.println("Valores posibles para los tipos booleanos son: "+tipoBool1+ " y "+tipoBool2+".");

        int c = 1;
        char tipoChar = (char)c;
        System.out.println("char: Se convirtio la variable de tipo entero: "+c+ " en un tipo char: "+tipoChar);


    }
}
