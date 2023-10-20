public class OperadoresDeAsignacion {
    public static void main(String[] args) {

        //Operador asignacion basico ( = )
        int i = 5;
        int j = i + 4;

        //Operador combinados

        // i = i + 2;
        i += 2;
        System.out.println("i = " + i);
        //j = j - 4;
        j -= 4;
        System.out.println("j = " + j);
        //j = j * 4;
        j *= 4;
        System.out.println("j = " + j);
        //j = j / 4;
        j /=  4;
        System.out.println("j = " + j);

        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombre='sebastian' ";
        sqlString += " and c.activo=1";
        System.out.println("sqlString = " + sqlString);
    }
}
