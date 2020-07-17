import java.util.Map;

public class MultipleChoice implements Pregunta{

	 public String texto;
	 public  Map<Integer , String> opciones;
	 public  int opcionCorrecta;
	 public  int peso;
	@Override
	public boolean esCorrecta(RespuestaPregunta respuesta) {
		// TODO Auto-generated method stub
		return false;
	}
}
