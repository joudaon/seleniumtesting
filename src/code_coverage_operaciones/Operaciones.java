package code_coverage_operaciones;

public class Operaciones {
	
	public Integer OperationSelector (Integer op1, Integer op2, Integer opArealizar){
		Integer resultado = 0;
		switch (opArealizar){
			case 1:
				resultado = op1+op2;
				break;
			case 2:
				resultado = op1-op2;
				break;
			case 3:
				resultado = op1*op2;
				break;
			}
			return resultado;
		
	}
}
