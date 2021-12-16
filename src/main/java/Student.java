public class Student {
    private String _Nombre;
    private int _Tipo;
    private int _notaBase =11;
    static final int Pregado = 0;
    static final int Maestria = 1;
    static final int Doctorado = 2;

    Student(int type, String nombre) {
        _Tipo = type;
        _Nombre = nombre;
    }
    int Grado() {
        switch (_Tipo) {
            case Pregado:
                return _notaBase;
            case Maestria:
                return _notaBase + 1;
            case Doctorado:
                return _notaBase + 2;
            default:
                throw new RuntimeException("Empleado incorrecto");
        }
    }
}
