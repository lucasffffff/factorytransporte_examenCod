package factorytransporte;

public class Barco implements Transporte {
    @Override
    public float costeTotal(int cp) {
        // Asumiendo una lógica simple, puedes ajustar según tus necesidades
        return cp * 1.5f;
    }

    @Override
    public int tipoEmbalaje(float x, float y, float z, float peso) {
        if (peso > 500) {
            return 0; // contenedor
        } else {
            return 1; // envoltorio cartón
        }
    }
}
