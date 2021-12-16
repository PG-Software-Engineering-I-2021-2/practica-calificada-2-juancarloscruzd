public class Teacher {
    private String _Nombre;
    private int _Tipo;
    private int _salarioBaseMensual =2000;
    private int _comision = 500;
    private int _bonus = 100;
    static final int ProfesorTP = 0;
    static final int ProfesorTC = 1;
    static final int Administrativo = 2;
    Teacher(int type, String nombre) {
        _Tipo = type;
        _Nombre = nombre;
    }
    int Sueldo() {
        switch (_Tipo) {
            case ProfesorTP:
                return _salarioBaseMensual;
            case ProfesorTC:
                return _salarioBaseMensual + _comision;
            case Administrativo:
                return _salarioBaseMensual + _bonus;
            default:
                throw new RuntimeException("Empleado incorrecto");
        }
    }
}
